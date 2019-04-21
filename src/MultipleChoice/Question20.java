package MultipleChoice;

// What will be the output of the program?
// A. 41
// B. 42
// C. 50
// D. 51

// Answer: D

public class Question20 {
    static boolean b;
    public static void main(String [] args)
    {
        short hand = 42;
        if ( hand < 50 && !b )
            hand++;
        if ( hand > 50 );
        else if ( hand > 40 )
        {
            hand += 7;
            hand++; }
        else --hand;
        System.out.println(hand);
    }
}
