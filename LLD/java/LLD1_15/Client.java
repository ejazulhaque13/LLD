package LLD1_15;

public class Client {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");

        // == does a shallow check but equals does a deep check

        System.out.println((s1==s2) + " " + s1.equals(s2));
        System.out.println((s1==s3) + " " + s1.equals(s3));
        System.out.println((s3==s4) + " " + s3.equals(s4));

        String s5 = s1.replace('l', 'd');
        System.out.println(s1 + " " + s5);

    }
}
