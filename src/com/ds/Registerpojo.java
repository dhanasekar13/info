package com.ds;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Registerpojo {
	@Persistent
private String name;
	@PrimaryKey
	@Persistent
private String email;
	@Persistent
	private String phone;
	@Persistent
	private String password;
	@Persistent
private String country;
	@Persistent
private String address;
	@Persistent
private String landline;
	public Registerpojo(String n1,String e1,String p1,String c1,String a1,String l1,String pa1)
	{
		this.name=n1;
		this.address=a1;
		this.phone=p1;
		this.email=e1;
		this.country=c1;
		this.landline=l1;
		this.password=pa1;
	}
public void setn(String name)
{
	this.name=name;
}
public void setpa(String password)
{
	this.password=password;
}
public void sete(String email)
{
	this.email=email;
}
public void setp(String phone)
{
	this.phone=phone;
}
public void setc(String country)
{
	this.country=country;
}
public void seta(String address)
{
	this.address=address;
}
public void setl(String landline)
{
	this.landline= landline;
}
public String getn()
{
	return name;
}
public String gete()
{
	return email;
}
public String getp()
{
	return phone;
}
public String getpa()
{
	return password;
}
@Override
public String toString() {
	return "Registerpojo [  email=" + email + "name=" + name +", phone=" + phone + ", country=" + country
			+ ", address=" + address + ", landline=" + landline +",password="+password+ "]";
}
public String getc()
{
	return country;
}
public String geta()
{
	return address;
}
public String getl()
{
	return landline;
}

}
