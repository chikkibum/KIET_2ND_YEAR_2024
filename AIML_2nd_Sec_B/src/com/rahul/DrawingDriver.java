package com.rahul;

public class DrawingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(10,20);
		Circle c = new Circle(10);
		DrawingApp d = new DrawingApp(r);
		d.draw();
	}

}
