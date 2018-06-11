package com.inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		System.out.println(p.i);
		p.meth1();
		p.meth2();
		Child c = new Child();
		System.out.println(c.i);
		c.meth1();
		c.meth2();
	}

}
