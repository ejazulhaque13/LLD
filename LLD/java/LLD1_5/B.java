package LLD1_5;

public class B extends A{ // giving error cannnot be inherited

    int d2;
    B(){
        this.d2 = 20;
    }

    B(int d1, int d2){
        super(d1);
        this.d2 = 20;
    }

    void fun(){
        super.fun(); // We can also call super since it will give A's fun property
        System.out.println("I am fun from B");
    }
}
