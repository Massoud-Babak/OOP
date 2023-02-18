package constructorOverLoading;

  /*
        constructor overloading has the same concept as the method overloading.
        you can create multiple construcors with the same name of its class, but the parameters must be different
        in size and datatype. the difference between method overloading and constructor overloading is that the name
         of the method can be anything, but the name of the constructor must match the class name.

         constructor will be invoked at the time of method creation; you can pass parameters while creating object in main
         */

public class constOverLoading {
    constOverLoading (int a, int b)
    {
        System.out.println( a + b);
    }
    constOverLoading (int a, int b, int c)
    {
        System.out.println( a + b + c);
    }
    constOverLoading (double a, double b, int c)
    {
        System.out.println( a + b + c);
    }
    constOverLoading (double a, int c)
    {
        System.out.println( a  + c);
    }


    public static void main(String[] args) {

        constOverLoading constt = new constOverLoading(2,8,6); // parameters passed during object creation.

    }
}
