package zadanie2;

public class Zadanie2 {

    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1);
        
        Test t2 = new Test(5);
        System.out.println(t2);
        
        Test t3 = new Test(5, 10);
        System.out.println(t3);
    }
    
}

class Test{
    public int a, b;
    public static int c;
    
    public Test()
    {
        System.out.println("Konstruktor bez argumentów");
        a = 1;
        b = 2;
    }
    
    public Test(int a)
    {
        this();
        System.out.println("Konstruktor z jednym intem " + a);
        this.a = a;
    }
    
    public Test(int a, int b)
    {
        this(a);
        System.out.println("Konstruktor z dwoma intami " + a + ", " + b);
        this.b = b;
    }
    
    static {
        System.out.println("Konsutrktor statyczny");
        
        c = 99;
    }
    
    public String toString() { 
        return String.format("a=" + a + "\tb=" + b + "\tc=" + c + "\n");
    } 
}