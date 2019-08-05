package com.flatgine.camera;

import com.flatgine.camera.MapScroller;

public class Camera {
	private int x; 
	private int y;
	//TODO make variables for focusOn method: speed, acceleration
	
	
	public Camera(int x,int y) {
		setX(x);
		setY(y);
	}
	
	public void moveToCoord(int x, int y) {
		setXMinusParam(x);
		setYMinusParam(y);
		//TODO There is null argument until the groups objects is created
		MapScroller.scrollOfXAxisObjectsGroupByDistance(null, x);	
		MapScroller.scrollOfYAxisObjectsGroupByDistance(null, y);
	}
	
	
	//___Setters_And_Getters__
	private void setX(int X) {
		this.x = X;
	}
	
	private void setY(int Y) {
		this.y = Y;
	}
	
	private void setXPlusParam(int param) {
		this.x += param;
	}
	
	private void setXMinusParam(int param) {
		this.x -= param;
	}
	
	private void setYPlusParam(int param) {
		this.y += param;
	}
	
	private void setYMinusParam(int param) {
		this.y -= param;
	}
	
}
