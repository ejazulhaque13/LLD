package LLD1_2;

public class Rectangle {
    Point topLeft;
    Point bottomRight;

    Rectangle(Point topLeft, Point bottomRight)
    {
      //this.topLeft = topLeft;                     // shallow copy
      //this.bottomRight = bottomRight;              // shallow copy
        this.topLeft = new Point(topLeft);              //Deep Copy
        this.bottomRight = new Point(bottomRight);      //Deep Copy
    }
    void display()
    {
        System.out.println("[" + topLeft.x + ", " + topLeft.y + "] -> [" + bottomRight.x
                + ", " + bottomRight.y + "]");
    }
}
