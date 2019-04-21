package MultipleChoice;

//What will be the output of the program?
// A. Nothing. The program will not compile because no exceptions are specified.
// B. Nothing. The program will not compile because no catch clauses are specified.
// C. Hello world.
// D. Hello world Finally executing

// Answer: D

public class Question9 {
    public static void main(String[] args) {
        try{
            System.out.print("Hello World ");
        }finally{
            System.out.println("Finally executing ");
        }
    }
}
