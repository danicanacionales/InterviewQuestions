package Factorial;

public class Factorial {
    public static void main(String[] args) {
        int factorialOf10 = new Factorial().getFactorial(10);
    }

    public int getFactorial(int number){

        int product = 1;
        for(int i = number; i > 0; i--){
            product *= i;
        }

        return product;
    }
}
