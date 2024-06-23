package com.automation.classes.oops;

public class College {

    public String courses;

    public String students;

    public int courseDuration;

    public int teacherId;

    public String departments;

    public String name;

    public String address;

//    public College() {
//
//    }
//
    public College(String studentName, int teacherId, String courses){
      this.name=studentName;
      this.teacherId=teacherId;
      this.courses=courses;

      ///this---> this is a keyword which is used to call the properties of same class

    }

    public void campusPlacement(){  //non parameter method
        System.out.println("The Student with name "+ name + " got hired");

    }


    public void campusPlacement(String name, String address, String departments){  //parameter method

        System.out.println("The student got placed in Niit technologies " + students);

    }


}
