public class GrandFather {
    void swim(){
        System.out.println("Swimming!");
    }
}
class Father extends GrandFather{
    @Override
    void swim() {
        System.out.println("Swimming in River!");
    }
}
class Son extends Father{
    @Override
    void swim() {
        System.out.println("Swimming in Pool!");
    }

    public static void main(String[] args) {
        GrandFather gf,f,s;
        gf = new GrandFather();
        f= new Father();
        s = new Son();
        gf.swim();
        f.swim();
        s.swim();
    }
}