package MultipleChoice;

//What will be the output of the program?
// A. null null 42
// B. 0 0 42
// C. 0 42 42
// D. 0 0 0

// Answer: C


class Two{
    byte x;
}

public class Question8 {
    public static void main(String[] args) {
        Question8 p = new Question8();
        p.start();
    }

    void start(){
        Two t = new Two();
        System.out.print(t.x + " ");
        Two t2 = fix(t);
        System.out.println(t.x + " " + t2.x);
    }

    Two fix(Two tt){
        tt.x = 42;
        return tt;
    }
}
