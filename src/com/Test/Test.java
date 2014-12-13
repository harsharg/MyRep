package com.Test;

public class Test {
	
	
	public static void main(String args[])
	{
		
		Room r = new Room();
		r.setspace(10);
		School s = new School(r);
		System.out.println(s.r.getpace());	
	}

}
