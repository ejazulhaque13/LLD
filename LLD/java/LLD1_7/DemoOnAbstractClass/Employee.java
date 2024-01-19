package LLD1_7.DemoOnAbstractClass;

public abstract class Employee {
    public int empid;
    public String name;
    void MarkAttendance(boolean flag)
    {
        if(flag)
            System.out.println(name + "is present");
        else
            System.out.println(name + "is absent");
    }
    abstract void work();
}
