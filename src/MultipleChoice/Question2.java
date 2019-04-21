package MultipleChoice;

// What will be the output of the program?
// A. 9 7 7 foo 7 7foo
// B. 72 34 34 foo34 34foo
// C. 9 7 7 foo34 34foo
// D. 72 7 34 foo34 7foo

// Answer: D

public class Question2 {
    public static void main(String[] args) {
        Question2 s = new Question2();
        s.start();
    }

    void start(){
        int a = 3;
        int b = 4;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(a + b);
        System.out.print(" " + a + b + " ");
        System.out.print(foo() + a + b + " ");
        System.out.println(a + b + foo());
    }

    String foo(){
        return "foo";
    }
}
