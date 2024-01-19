package LLD1_2;

public class Student {
    int age;
    String name;

    // This a parameterized constructors. Since we have added it java has removed default value.
    Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    void display()
    {
        System.out.println("My name is "+ name);
        System.out.println("My age is "+ age);
    }
}
