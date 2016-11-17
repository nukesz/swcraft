package org.swcraft.functional.java;

import java.util.List;

import org.swcraft.functional.scala.ScalaToJava;

public class DemoApp {
	public static void main(String[] args) {
		ScalaToJava obj = new ScalaToJava();
		
		System.out.println(obj.helloWorld());
	}
}

class MyClassJava {
	public int addNumbers(int a, int b) {
		return a + b;
	}
	
	public void nothing(List<Integer> s) {
		// ...
		s.add(5);
	}
	
	
	public int ifWorkingShort(Integer a) { 
		return (a > 10) ? 10 : 4;
	}
}
