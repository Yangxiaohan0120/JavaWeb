package Filter;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * @author Chris Yang
 * created 2022-06-19 18:55
 **/
public class FirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器生效");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化成功");
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器已被销毁");
        Filter.super.destroy();
    }
}
