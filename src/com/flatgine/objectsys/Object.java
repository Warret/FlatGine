package com.flatgine.objectsys;

public class Object {
    String scene;
    int layer;
    int modelX, modelY, modelWidth, modelHeight;

    //for collisions
    int ex, ey;

    String state;

    //for physSys
    boolean phys;
    int currentSpeedFall;
    int maxSpeedFall;
    int accelerationFall;


    public String getScene() {
        return scene;
    }

    public int getModelX() {
        return modelX;
    }

    public void setModelX(int modelX) {
        this.modelX = modelX;
    }

    public int getModelWidth() {
        return modelWidth;
    }

    public void setModelWidth(int modelWidth) {
        this.modelWidth = modelWidth;
    }

    public int getEx() {
        return ex;
    }

    public void setEx(int ex) {
        this.ex = ex;
    }

    public boolean isPhys() {
        return phys;
    }

    public void setPhys(boolean phys) {
        this.phys = phys;
    }

    public int getMaxSpeedFall() {
        return maxSpeedFall;
    }

    public void setMaxSpeedFall(int maxSpeedFall) {
        this.maxSpeedFall = maxSpeedFall;
    }

    public int getAccelerationFall() {
        return accelerationFall;
    }

    public void setAccelerationFall(int accelerationFall) {
        this.accelerationFall = accelerationFall;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }
}
