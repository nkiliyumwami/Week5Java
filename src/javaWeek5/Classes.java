package javaWeek5;

import jdk.swing.interop.SwingInterOpUtils;

public class Classes {
    public static void main(String[] args) {
        /* Create instances of Logger*/
        Logger asterisk = new AsteriskLogger();
        asterisk.log("Hello");
        asterisk.error("Test");

        Logger spacedLogger = new SpacedLogger();
        spacedLogger.log("House");
        spacedLogger.error("Boston");





    }
        /*StringBuilder name = new StringBuilder();
        StringBuilder name1 = new StringBuilder();

        *//* Creating instances of students from the "student" class*//*
        Student student1 = new Student();//This is a constructor
        student1.firstName = "Tom";
        student1.lastName = "Brady";
        student1.gradeLevel = 12;
        student1.phoneNumber = "508-402-2345";

        student1.introduce();

        System.out.println("------------------------------");

        *//* Creating another student*//*
        Student student2 = new Student("Mary", "Baine");
        student2.introduce();

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");

        *//* Best way of creating an instance of student using the constructor
            instead of .notation like above for the first student*//*
        Student student3 = new Student("Paul","Kane","406-345-1234",11);
        student3.introduce();
    }*/

}
