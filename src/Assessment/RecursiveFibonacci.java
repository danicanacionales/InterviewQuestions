package Assessment;

public class RecursiveFibonacci {
    public static void recursiveFibonacci(int pos){
        System.out.print("fibonacci recursive: ");
        for(int i = 0; i < pos; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int num) {

        if (num == 0) {
            return 0;
        }
        else if(num == 1)
        {
            return 1;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }
}
