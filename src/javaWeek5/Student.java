package javaWeek5;

public class Student {
    /* Student's properties*/
    /* A property that all students shared must be static eg below*/
    static int numberOfStudents;
    String firstName;
    String lastName;
    String phoneNumber;
    int gradeLevel;

    /* Other way of instantiate a class using a constructor*/
    public Student(){}; //This is a constructor
    public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gradeLevel = gradeLevel;
    }

    /* Create another instance of student which takes 2 params only*/
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /* Now after the above, we have 3 different constructors: 2 here and one in Classes class*/

    /* Student's methods: actions/verbs/ what a student can do*/
    public void introduce() {
        System.out.println("Hello my name is " + firstName + " " + lastName);
        System.out.println("I am in grade "+ gradeLevel);
        System.out.println("My phone number is "+ phoneNumber);

    }
}
