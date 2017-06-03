package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getall extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json");
		PrintWriter out1=resp.getWriter();
		System.out.println("this is the first");
		javax.jdo.Query q1=register.data.newQuery(seconddb.class);
		System.out.println("this is the second");
		@SuppressWarnings("unchecked")
		List<seconddb> listdata=(List<seconddb>)q1.execute();
		/*if(!listdata.isEmpty()){
		out1.println(listdata);
		}*/
		out1.println(listdata);
	
	}
}
