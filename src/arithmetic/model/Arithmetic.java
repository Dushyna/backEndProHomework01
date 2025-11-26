package arithmetic.model;

public class Arithmetic {

    public void add(int a, int b){
        int result= a+b;
        System.out.println("result = " + result );
    }

    public void subtract(int a, int b){
        int result= a-b;
        System.out.println("result = " + result );
    }

    public void multiply(int a, int b){
        int result= a*b;
        System.out.println("result = " + result );
    }

    public void div(int a, int b){
        try {
            int result= a/b;
            System.out.println("result = " + result );
        }catch (Exception e){
            System.out.println("You can't divide by zero");
        }

    }
}
