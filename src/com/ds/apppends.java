package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class apppends extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
static seconddb db1;
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		HttpSession s1 = req.getSession(false);
		if (s1 != null)
		{
		resp.setContentType("application/json");
		PrintWriter out=resp.getWriter();
		String blog=req.getParameter("requ");
	
		String name=(String) s1.getAttribute("username");
		
			db1=new seconddb(name,blog,null,null);
			try{
				register.data.makePersistent(db1);
				}
				catch(Exception e)
				{
				}
		out.print("never give up");
		}
		else
		{
			resp.sendRedirect("session");
		}
	}
}
