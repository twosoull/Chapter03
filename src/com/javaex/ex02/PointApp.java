package com.javaex.ex02;

public class PointApp {
	
	public static void main(String[] args) {
		Point p = new Point(2,3);
		Point p01 =new Point(5,5);
		Point p02 = new Point(100,100);
		
		//Object 클래스가 부모이다.
		//Object 클래스의 메소드 + Point 클래스의 메소드 모두 사용가능
		//겹치는 메소드 주의
		
		System.out.println(p.toString());
		
		//메소드 오버라이딩
		Object op = new Point();
		System.out.println(op.toString());
		//printn toString() 찾아서 실행한다
		System.out.println(p); //주소의 toString()
		
		//getClass()
		System.out.println("=============");
		System.out.println(p.getClass()); //어디에 소속되어있는지 알려준다
		
		//hashCode()
		System.out.println("===========");
		System.out.println(p.hashCode());//실제주소값은 우리가 알수없고
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode()); 
	//임의로정한 주소값 0x999(정확히는 알수없음) = 주소값hashCode
		
		//equals()
		System.out.println("===========");
		System.out.println(p.equals(p01));//equals(비교할대상의주소)
		//주소값이 다르면 false로 처리
		
		//주소값을 직접비교할때 사용
		System.out.println(p==p01);
		System.out.println(p==p05);
		
	
	}
}
