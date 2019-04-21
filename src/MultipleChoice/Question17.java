package MultipleChoice;

//What will be the output of the program?
// A. hello throwit caught
// B. Compilation fails
// C. hello throwit RuntimeException caught after
// D. hello throwit caught finally after

// Answer: D

public class Question17 {
    public static void throwit () throws Exception
    {
        System.out.print("throwit ");
        throw new RuntimeException();
    }
    public static void main(String [] args)
    {
        try
        {
            System.out.print("hello ");
            throwit();
        }
        catch (Exception re )
        {
            System.out.print("caught ");
        }
        finally {
            System.out.print("finally ");
        }
        System.out.println("after ");
    }
}