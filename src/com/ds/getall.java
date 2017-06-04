package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

//import com.google.appengine.repackaged.org.codehaus.jackson.map.ObjectMapper;

public class getall extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json");
		ObjectMapper map=new ObjectMapper();
		HashSet<Object> hm=new HashSet<Object>();
		PrintWriter out1=resp.getWriter();
			javax.jdo.Query q1=register.data.newQuery(seconddb.class);
			@SuppressWarnings("unchecked")
		List<seconddb> listdata=(List<seconddb>)q1.execute();
	int i=0;
		for(seconddb ki:listdata)
		{	hm.add(map.writeValueAsString(ki));
		/*System.out.println(i+"   --  This is inside the for loop   -  "+ki);
		System.out.println("for name  --  "+ki.getn());
		System.out.println("for blog  -- "+ki.getb());   
		System.out.println("for previous comment -- "+ki.getpre());
		System.out.println("for new commment --  "+ki.getnew());*/
			/*hm.put(i, ki.getn());
			hm.put(i, ki.getb());
			hm.put(i, ki.getpre());
			hm.put(i, ki.getnew());	*/
		i++;
		
		}
	//	map.writeValue(seconddb.class, hm);
		
		out1.println(hm);
	
	}
}
