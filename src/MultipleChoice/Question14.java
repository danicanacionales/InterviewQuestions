package MultipleChoice;

//which two code fragments will compile?

//1. interface Base2 implements Base {}
//2. abstract class Class2 extends Base
//    { public boolean m1(){ return true; }}
//3. abstract class Class2 implements Base {}
//4. abstract class Class2 implements Base
//    { public boolean m1(){ return (7 > 4); }}
//5. abstract class Class2 implements Base
//    { protected boolean m1(){ return (5 > 7) }}

// A. 1 and 2
// B. 2 and 3
// C. 3 and 4
// D. 1 and 5

interface Base
{
    boolean m1 ();
    byte m2(short s);
}

