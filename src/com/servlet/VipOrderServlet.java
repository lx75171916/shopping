package com.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.model.Orders;
import com.model.Vipuser;
import com.service.UserService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.tmodel.TOrders;

/**
 * Servlet implementation class VipOrderServlet
 */
@WebServlet("/vipOrder")
public class VipOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserService userService = new UserService();
    public VipOrderServlet() {}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		Class clazz = this.getClass();
		try {
			Method method = clazz.getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
			method.invoke(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", "后台错误！");
			e.printStackTrace();
		}
	}
	public void find(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Vipuser user = (Vipuser)request.getSession().getAttribute("user");
		List<Orders> orders = userService.findOrdersByUserid(user.getId());
		List<TOrders> tOrders = new ArrayList<TOrders>();
		for (Orders order : orders) {
			tOrders.add(new TOrders(order));
		}
		request.setAttribute("orders", tOrders);
		request.getRequestDispatcher("vipOrder.jsp").forward(request, response);
	}
}
