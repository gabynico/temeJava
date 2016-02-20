package homework1;

public class Person2 {


    private String firstName;
    private String lastName;
    private int age;

    public Person2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person2(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

    public void print() {
        System.out.println("First Name:" + this.firstName);
        System.out.println("Last Name:" + this.lastName);
        System.out.println("Age:" + this.age);
    }



    public static void main (String[] args)
    {
        // your code goes here
        Person2 p = new Person2("A","B", 22);
        p.print();
    }

}
