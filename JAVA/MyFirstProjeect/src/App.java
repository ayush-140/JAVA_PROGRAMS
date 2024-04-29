class A{
    int a;
    String b;
    double c;

    A()
    {
        a=10;
        b="ayush";
        c=3.14;
    }
    A(int x,String y)
    {
        a=x;
        b=y;
    }
    A(double z,int x)
    {
        a=x;
        c=z;
    }
};
class B{
    public static void main(String[] args) {
        A ob=new A();
        A ob1=new A(20,"raj");
        A ob2=new A(56.6,46);
        System.out.println(ob.a+" "+ob.b+" "+ob.c);
        System.out.println(ob1.a+" "+ob1.b);
        System.out.println(ob2.a+" "+ob2.c);
        
        
    }
}