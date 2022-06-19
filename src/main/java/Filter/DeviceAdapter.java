package Filter;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Locale;

/**
 * @author Chris Yang
 * created 2022-06-19 20:13
 **/

@WebFilter(filterName = "DeviceAdapter",urlPatterns = "*.html")
public class DeviceAdapter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        System.out.println("URI:"+uri);
        if(uri.startsWith("/desktop") || uri.startsWith("/mobile")){
            filterChain.doFilter(request,response);
        }else {
            String userAgent =  request.getHeader("user-agent").toLowerCase();
            String targetURI = "";
            if(userAgent.indexOf("android") != -1 || userAgent.indexOf("iphone") != -1){
                targetURI = uri.replace("index.html","") + "/mobile" ;
                System.out.println("移动端设备正在访问，跳转URI"+targetURI);
                response.sendRedirect(targetURI);
            }else {
                targetURI =  uri.replace("index.html","") + "/desktop";
                System.out.println("PC 端设备正在访问，跳转URI"+targetURI);
                response.sendRedirect(targetURI);
            }
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
