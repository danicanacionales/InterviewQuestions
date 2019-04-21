package MultipleChoice;

// What will be the output of the program?
// A. slip stream
// B. slipstream stream
// C. stream slip stream
// D. slipstream slip stream

// Answer: D

public class Question16 {
    public static void main(String [] args) {
        Question16 p = new Question16();
        p.start();
    }

    void start() {
        String s1 = "slip";
        String s2 = fix(s1);
        System.out.println(s1 + " " + s2);
    }

    String fix(String s1) {
        s1 = s1 + "stream";
        System.out.print(s1 + " ");
        return "stream";
    }
}