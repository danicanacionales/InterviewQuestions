package MultipleChoice;

// What will be the output of the program?

// A. true true
// B. false true
// C. true false
// D. false false

// Answer: B.

public class Question15 {
    public static void main(String [] args)
    {
        Question15 p = new Question15();
        p.start(); }
    void start()
    {
        boolean b1 = false;
        boolean b2 = fix(b1);
        System.out.println(b1 + " " + b2);
    }
    boolean fix(boolean b1)
    {
        b1 = true;
        return b1; }
}
