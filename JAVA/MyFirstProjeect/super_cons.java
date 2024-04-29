class A {
    public A() {
        System.out.println("constructor of A");
    }
}

class B extends A {
    public B(int x) {
        super();
        System.out.println("constructor of B");
    }
}

class C extends B {
    public C() {
        super(10);
        System.out.println("constructor of C");
    }
}

public class super_cons {
    public static void main(String[] args) {
        C objC = new C();
    }
}
