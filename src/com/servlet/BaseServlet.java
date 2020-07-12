package com.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BaseServlet extends HttpServlet {

	   @Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			try {
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("utf-8");
				String action = request.getParameter("action");
				
				//防盗链   防止用户未登录访问项目内的其他页面，保证只能从登陆页面登陆成功以后才能对其它信息进行访问
				/*User user = (User)request.getSession().getAttribute("user");
				if(user==null && !action.equals("login")){
					response.sendRedirect("login.jsp");
					return;
				}*/
				
				Class clazz = this.getClass();
				Method method = clazz.getDeclaredMethod(action, HttpServletRequest.class,HttpServletResponse.class);
				method.invoke(this, request,response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	


}
