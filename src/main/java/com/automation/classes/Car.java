package com.automation.classes;

public interface Car {

    public void tyre(); //non - implement

    public void brake();

    public void light();

    public void gear();

    default void riversGear() {
        System.out.println("wipe the glass");
    }

}
