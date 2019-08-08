package com.flatgine.objectsys;

public class Object {
    String scene;
    int layer;
    int modelX, modelY, modelWidth, modelHeight;
    int x, y, width, height;

    String state;

    //for physSys
    boolean phys;
    int currentSpeedFall;
    int maxSpeedFall;
    int accelerationFall;

    
    
    //_____GETTERS____
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public int getAccelerationFall() {
        return accelerationFall;
    }
    
    public int getMaxSpeedFall() {
        return maxSpeedFall;
    }
    
    public int getCurrentSpeedFall() {
        return currentSpeedFall;
    }
    
    
    
   //_____SETTERS__INCREMENTS__DECREMENTS_____
    
    //__X__
    public void setX(int x) {
        this.x = x;
    }
    
    public void increaseXBy(int parameter) {
        this.x += parameter;
    }
    
    public void decreaseXBy(int parameter) {
        this.x -= parameter;
    }
    
    
    //__Y__
    public void setY(int y) {
        this.y = y;
    }
    
    public void increaseYBy(int parameter) {
        this.y += parameter;
    }
    
    public void decreaseYBy(int parameter) {
        this.y -= parameter;
    }
    

    //__FOR_PHYS__
    
    public void setCurrentSpeedFall(int currentSpeedFall) {
        this.currentSpeedFall = currentSpeedFall ;
    }
    
    public void increaseCurrentSpeedFallBy(int parameter) {
        this.currentSpeedFall += parameter;
    }
    
    public void setMaxSpeedFall(int maxSpeedFall) {
        this.maxSpeedFall = maxSpeedFall;
    }

    public void setAccelerationFall(int accelerationFall) {
        this.accelerationFall = accelerationFall;
    }

}
