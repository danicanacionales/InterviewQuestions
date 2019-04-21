package MultipleChoice;


// What will be the output of the program?
// A. x = 0
// B. x = 1
// C. Compilation fails
// D. An exception is thrown at runtime

// Answer: B

class A {
    public int GetResult(int a, int b){
        return 0;
    }
}

class B extends A {
    public int GetResult(int a, int b){
        return 1;
    }
}

public class Question1 {
    public static void main(String[] args) {
        A a = createA();
        System.out.println("x = " + a.GetResult(0, 1));
    }

    public static A createA(){
        B b = new B();
        return b;
    }
}
