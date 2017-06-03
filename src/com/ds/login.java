package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Registerpojo temp;
	static String loggeduserN;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String var1 = req.getParameter("login");
		String var2 = req.getParameter("password");

		Key k = KeyFactory.createKey(Registerpojo.class.getSimpleName(), var1);

		temp = register.data.getObjectById(Registerpojo.class, k);
		loggeduserN = temp.gete();
		String password = temp.getpa();
		if (loggeduserN.equals(var1) && password.equals(var2)) {
			HttpSession hs1=req.getSession();
			hs1.setAttribute("username", var1);
			resp.sendRedirect("sessionpage.html");
		}
		else
		{
			resp.sendRedirect("index.html");
		}
	}
}
