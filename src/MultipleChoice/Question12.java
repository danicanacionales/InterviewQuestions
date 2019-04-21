package MultipleChoice;

// What will be the output of the program?
// A. abcd
// B. ABCD
// C. dccd
// D. dcba

// Answer: A

public class Question12 {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = a.toLowerCase();
        b.replace('a','d');
        b.replace('b','c');
        System.out.println(b);
    }
}
