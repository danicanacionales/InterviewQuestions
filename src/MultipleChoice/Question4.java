package MultipleChoice;

// A. If a is true and b is true then the output is "A && B"
// B. If a is true and b is false then the output is "notB"
// C. If a is false and b is true then the output is "ELSE"
// D. If a is false and b is false then the output is "ELSE"

// Answer: C

public class Question4 {
    public static void main(String[] args) {
        Question4 q4 = new Question4();
        q4.foo(true, true);
        q4.foo(true, false);
        q4.foo(false, true);
        q4.foo(false, false);
    }

    public void foo(boolean a, boolean b){
        if(a){
            System.out.println("A");
        }else if(a && b){
            System.out.println("A && B");
        }else{
            if(!b){
                System.out.println("notB");
            }else{
                System.out.println("ELSE");
            }
        }
    }
}
