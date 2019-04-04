package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int fibonacciOf10 = new Fibonacci().getFibonacci(10);
    }

    public int getFibonacci(int position){

        int x = 0;
        int y = 1;
        int sum = 0;

        for(int i = 0; i < position; i++){
            sum = x + y;
            x = y;
            y = sum;
        }

        return sum;
    }
}
