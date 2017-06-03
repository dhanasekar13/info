package com.ds;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class seconddb {
	DateFormat datef=new SimpleDateFormat();
	Date d1=new Date();
	@PrimaryKey
	@Persistent
private String name;
	
	@Persistent
private String blogd;
	@Persistent
	private String previousc;
	@Persistent
	private String newcom;

	public seconddb(String n1,String e1,String p1,String c1)
	{
		this.name=n1+datef.format(d1);
		this.blogd=e1;
		this.previousc=p1;
		this.newcom=c1;
		
	}
public void setn(String name)
{
	this.name=name;
}
public void setpre(String previousc)
{
	this.previousc=previousc;
}
public void setb(String blogd)
{
	this.blogd=blogd;
}
public void setnew(String newcom)
{
	this.newcom=newcom;
}
public String getn()
{
	return name;
}
public String getb()
{
	return blogd;
}
public String getnew()
{
	return newcom;
}
public String getpre()
{
	return previousc;
}
@Override
public String toString() {
	return "seconddb [name=" + name + ", blogd=" + blogd + ", previousc=" + previousc + ", newcom=" + newcom + "]";
}

}
