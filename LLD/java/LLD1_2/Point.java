package LLD1_2;

public class Point {
    int x;
    int y;

    Point()
    {
//        this.x = 0;
//        this.y = 0;   Instead of doing this we can do
        this(0,0); // This is called telescoping.
    }
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    Point(Point p) // This is a Copy Constructor
    {
      this.x = p.x;
      this.y = p.y;
    }
    void display()
    {
        System.out.println("x= "+ x +" "+ "y= "+ y);
    }
}
