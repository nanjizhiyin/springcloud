package com.example.zuul.config;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 16:36
 */

import com.example.zuul.service.Userservice;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * 登录过滤器
 *记得类上加Component注解
 */
@Component
public class LoginFilter extends ZuulFilter {

    @Autowired
    private Userservice userservice;
    /**
     * 过滤器类型，前置过滤器
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    /**
     * 过滤器顺序，越小越先执行
     */
    @Override
    public int filterOrder() {
        return 4;
    }

    /**
     * 过滤器是否生效
     * 返回true代表需要权限校验，false代表不需要用户校验即可访问
     */
    @Override
    public boolean shouldFilter() {

        //共享RequestContext，上下文对象
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String uri = request.getRequestURI();
        System.out.println("uri="+uri);
        //true需要权限校验URL,false不用权限
        if (uri.startsWith("/auth/login")) {
            return false;
        }
        if (uri.startsWith("/service1")) {
            return false;
        }
        if (uri.startsWith("/service2")) {
            return false;
        }
        return true;
    }

    /**
     * 业务逻辑
     * 只有上面返回true的时候，才会进入到该方法
     */
    @Override
    public Object run() throws ZuulException {

        //读取cookie
        String token = null;
        //JWT
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Cookie[] Cookies = request.getCookies();
        for(int i =0;i<Cookies.length;i++){
            Cookie c = Cookies[i];
            if ("token".equals(c.getName())){
                token = c.getValue();
                break;
            }
        }
        if (!StringUtils.isEmpty(token)) {
            //验证cookie
            String tmpStr = userservice.auth(token);
            if ("0".equals(tmpStr)){
                System.out.println("登录成功了");
            }else{

            }
        }
        else {
            //过滤该请求，不往下级服务去转发请求，到此结束
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(200);
            ctx.setResponseBody("{\"result\":\"accessToken为空!\"}");
            ctx.getResponse().setContentType("text/html;charset=UTF-8");
        }
        return null;
    }
}
