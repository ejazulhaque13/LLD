package LLD1_2;

import org.springframework.objenesis.strategy.StdInstantiatorStrategy;

public class Client {
    public static void main(String[] args) {
        Person p= new Person();
        p.name="ABC";
        p.age=10;
        p.display();

        //Student s= new Student(); Every time we will make student object we have to provide a value.
        //As we have made a parameterized constructor.

        Student s = new Student(20, "DEF");
        s.display();


        Point p1 = new Point();  //Default Constructor
        Point p2 = new Point(5,10); //Parameterized Constructor
        Point p3 = new Point(p2); //Copy Constructor
        p1.display();
        p2.display();
        p3.display();

        Point p4 = new Point(10, 10);
        Point p5 = new Point(5, 5);
        Rectangle r = new Rectangle(p4, p5);


        r.display();
        p1.x = 100;
        r.display();
    }
}

