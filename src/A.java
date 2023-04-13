public class A {
    void method(){
        System.out.println("A");
    }
}
class B extends A{
    @Override
    void method() {
        System.out.println("B");
    }
}class C extends B{
    @Override
    void method() {
        System.out.println("C");
    }
}class D extends C{
    @Override
    void method() {
        System.out.println("D");
    }
}
class Test {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();
        A d = new D();
        a.method();
        b.method();
        c.method();
        d.method();

    }
}