package Assessment;

import java.util.Scanner;

public class Palindrome {
    public static void getPalindrome(){
        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.print("\ninput word: ");
        while(!(input = sc.nextLine()).equalsIgnoreCase("exit")){
            System.out.println(isPalindrome(input));
            System.out.print("input word: ");
        }
        System.out.println(input + " is signal to exit");
    }

    private static boolean isPalindrome(String input){
        char[] word = input.toCharArray();
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
