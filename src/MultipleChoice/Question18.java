package MultipleChoice;

// What will be the output of the program?
// A. 1
// B. 10
// C. 101
// D. 1101

// Answer: D

public class Question18 {
    public static void main(String [] args )
    {
        int result = 0;
        Question18 oc = new Question18();
        Object o = oc;
        if (o == oc)
            result = 1;
        if (o != oc)
            result = result + 10;
        if (o.equals(oc) )
            result = result + 100;
        if (oc.equals(o) )
            result = result + 1000;
        System.out.println("result = " + result);
    }
}
