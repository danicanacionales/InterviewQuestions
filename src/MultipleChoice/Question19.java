package MultipleChoice;

//What will be the output of the program?
// A. 5 2
// B. 5 3
// C. 6 3
// D. 6 4

// Answer: C

public class Question19 {
    public static void main(String [] args)
    {
        int x= 0;
        int y= 0;
        for (int z = 0; z < 5; z++)
        {
            if (( ++x > 2 ) && (++y > 2))
            {
                x++; }
        }
        System.out.println(x + " " + y);
    }
}
