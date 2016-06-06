package com.prack2;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String i = req.getParameter("i");
		int val = Integer.parseInt(i);
		switch(val){
		case 0:
			resp.setContentType("text/plain");
			resp.getWriter().println("Hello, world");
			break;
		case 1:
			String var1 = req.getParameter("var1");
			int i1 = Integer.parseInt(var1);
			
			String var2 = req.getParameter("var2");
			int i2 = Integer.parseInt(var2);
			
			String operation = req.getParameter("operation");
			int result;
			if(operation.equals("0")){
				result = i1 + i2;
			} else if(operation.equals("1")){
				result = i1 - i2;
			} else if (operation.equals("2")){
				result = i1 * i2;
			} else {
				result = i1 / i2;
			}
			resp.getWriter().println(result);
			break;
		}
	}
}