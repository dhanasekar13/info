package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.google.appengine.api.datastore.KeyFactory;

public class register extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Registerpojo db1;
	static PersistenceManager data=databasepmf.get().getPersistenceManager();
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("texthtml");
		PrintWriter out=resp.getWriter();
		String n1=req.getParameter("Name");
		String pa1=req.getParameter("pass");
		String a1=req.getParameter("address");
		String c1=req.getParameter("Country");
		String e1=req.getParameter("EMail");
		String p1=req.getParameter("phoneno");
		String sc1=req.getParameter("scno");
		db1=new Registerpojo(n1,a1,p1,e1,c1,sc1,pa1);
		try{
		data.makePersistent(db1);
		}
		catch(Exception e)
		{
		}resp.sendRedirect("index.html");
		
		out.close();
	}
}
