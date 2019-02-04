/* public class Test {
     private int a = 0, b = 0;

     private int add() {
          return a + b;
     }

     public static void main(String[] args) {
           a = 2;
           b = 3;
           System.out.println(add());
      }
} rewritten class below */  

/* Test() constructor is missing.
 * a and b are non-static. static main cannot change the attributes 
 * without instantiating a new object.
 */

class Test {
    private int a = 0;
    private int b = 0;

    public Test(int newA, int newB) {
        this.a = newA;
        this.b = newB;
    }

    public int add() {
        return this.a + this.b;
    }
}

class Solver {
    public static void main(String[] args) {
        Test test = new Test(2, 3);
        System.out.println(test.add());
    }
}
