package Assessment;

public class IterativeFibonacci {
    private static String getIterativeFibonacci(int pos){

        String output = "";
        int first = 0, second = 1, sum = 0;

        for(int i = 0; i < pos; i++){
            if(i == 0){
                output += first + " ";
                continue;
            } else if(i == 1){
                output += second + " ";
                continue;
            }
            sum = first + second;
            output += sum + " ";
            first = second;
            second = sum;
        }

        return output;
    }

    public static void iterativeFibonacci(int pos){
        System.out.print("fibonacci iterative: ");
        System.out.println(getIterativeFibonacci(pos));
    }
}
