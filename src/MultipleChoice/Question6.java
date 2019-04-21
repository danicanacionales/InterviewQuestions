package MultipleChoice;

// What will be the output of the program?
// A. finally
// B. exception finished
// C. finally exception finished
// D. Compilation fails

// Answer: C

public class Question6 {
    public static void aMethod() throws Exception {
        try{
            throw new Exception();
        }finally{
            System.out.print("finally ");
        }
    }

    public static void main(String[] args) {
        try{
            aMethod();
        }catch(Exception e){
            System.out.print("exception ");
        }

        System.out.print("finished");
    }
}
