package Assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assessment {
    public static void main(String[] args) {
        List<Integer> numbers = new Assessment().getInputNumbers();

        //Get closest number


        // Sort Array
        System.out.print("Sorted: ");
        MergeSort.sortArray(numbers);

        //Total number
        System.out.println("\nTotal number inputted: " + numbers.size());

        //Star

        //Iterative Fibonacci
        IterativeFibonacci.iterativeFibonacci(numbers.size());

        //Recursive Fibonacci
        RecursiveFibonacci.recursiveFibonacci(numbers.size());

        //Palindrome
        Palindrome.getPalindrome();
    }

    public List<Integer> getInputNumbers(){
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        String input = "";
        System.out.print("input number: ");
        while(!(input = sc.nextLine()).equalsIgnoreCase("end")){
            numbers.add(Integer.parseInt(input));
            System.out.print("input number: ");
        }

        return numbers;
    }
}
