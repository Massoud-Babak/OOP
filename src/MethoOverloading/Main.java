package MethoOverloading;

/*
polymorphism is a concept, and method overloading is an approach to achieve
that concept.
method overloading is creating multiple method or constructors with same name but different
parameters, to save the memory and time. to void confusion while calling we can differentiate
the methods from each other while creating them by:
1-number of  parameters
2- data types of parameters.
constructor overloading has the same concept.

 */

public class Main {
   public static class MethodOverL{
        int add(int a, int b){
            return a + b;
        }
        double add(double a, double b){
            return  a + b;
        }
        int add (int a, int b, int c){
            return a+b+c;
        }
        double add(double a, double b, double c){
            return a +b +c;
        }
    }
    public static void main(String[] args) {

      MethodOverL addit = new MethodOverL();

        System.out.println(addit.add(2.2,4.5,5.8));


    }
}
