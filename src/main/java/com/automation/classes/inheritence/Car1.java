package com.automation.classes.inheritence;

public class Car1 {

    private String brandName;

    private String color;

    private String camera;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", color='" + color + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }
}
