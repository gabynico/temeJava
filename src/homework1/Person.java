package homework1;

import java.lang.*;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        System.out.println("Default constructor");
    }
    public Person(String firstName, String lastName) {
        System.out.println("Other constructor");
        //this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        //this();
        this(firstName, lastName);
        this.age = age;
    }

    public void print() {
        //this();
        System.out.println("First Name:" + this.firstName);
        System.out.println("Last Name:" + this.lastName);
        System.out.println("Age:" + this.age);
    }


    public static void main (String[] args) /*throws java.lang.Exception*/
    {
        // your code goes here
        Person p = new Person("A","B", 22);
        p.print();

        Person e = new Person("C","D");
        e.print();

        Person n = new Person();
        n.print();
    }

}

