package com.javaex.ex04;

public class Point {
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	// 메소드 일반

	public void showInfo() {
		System.out.println("x: " + x + " y: " + y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	/*
	// 주소값 대용,변경해서 사용할수있다.
	public int hashCode() {
		return x + y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.hashCode() == ((Point) obj).hashCode()) {
			if(this.x == ((Point)obj).x && this.y == ((Point)obj).y){
				return true;
			}else {
				return false;
			}
		}

		return true;
	}
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //같은 인스턴스일때
			return true;
		if (obj == null) //비교대상이 없을 때
			return false;
		if (getClass() != obj.getClass())//Point Circle 비교할때
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
