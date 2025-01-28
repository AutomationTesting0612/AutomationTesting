package com.automation.test;

public class Car1 {

//    a) Class is a blueprint
//    b) has variables and methods

     //variable

//     OOps--> Encapsulation --> Methods and object/variables and make variables private
     protected String name;
     protected String color;
     protected int noOfTyre;
     protected String model;

     protected String make;

//     public void hello(){
//
//     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public int getNoOfTyre() {
          return noOfTyre;
     }

     public void setNoOfTyre(int noOfTyre) {
          this.noOfTyre = noOfTyre;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }
}
