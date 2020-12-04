package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {

		Object obj = new Object();
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj));
		
		//getClass()  -->클래스의 정보
		System.out.println("=======");
		System.out.println("getClass()");
		System.out.println(obj.getClass());
		
		//hashCode() --> 메모리의 주소값(실제는 아니다)
		System.out.println("===================");
		System.out.println("hashCode()");
		System.out.println(obj.hashCode());
		
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		
		//toString() -- > 객체의 값 정보
		
		System.out.println("============");
		System.out.println(obj.toString());

		//equals() -->객체(인스턴스)까 같은지 비교
		System.out.println("===================");
		System.out.println("obj.equals()");
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj01));
		System.out.println(obj01.equals(obj));
	}
}
