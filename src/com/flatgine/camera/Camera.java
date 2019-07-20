package com.flatgine.camera;

public class Camera {
	private int x; 
	private int y;
	//TODO make variables for focusOn method: speed, acceleration
	
	
	public Camera(int x,int y) {
		setX(x);
		setY(y);
	}
	
	private void setX(int X) {
		this.x = X;
	}
	
	private void setY(int Y) {
		this.y = Y;
	}
	
}
