package hans;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginRegisterFilter
 */
@WebFilter("/web/html/user_edit.html")
public class LoginRegisterFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginRegisterFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		HttpSession session = httpRequest.getSession();
		String userEmail = (String)session.getAttribute("userEmail");
		System.out.println(userEmail);
		System.out.println("sdfa");
		
		if (userEmail == null || "".equals(userEmail)) 
		{
			System.out.println("111111111");
            // 跳转到登陆页面
			httpResponse.sendRedirect("/B2C/web/html/login.html");
         }
		else 
		{
			System.out.println("sss");
             // 已经登陆,继续此次
             chain.doFilter(request, response);
		}
		
		/*if (userEmail == null || "".equals(userEmail)) 
		{
			System.out.println("111111111");
            // 跳转到登陆页面
			httpResponse.sendRedirect("/B2C/web/html/login.html");
         }
		chain.doFilter(request, response);*/
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
