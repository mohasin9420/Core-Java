package Java.methods;

public class staticmethod2 {
    static void main() {
        System.out.println("start main method");
        m1();
        A.m2();

        System.out.println("stop main method");
    }
    static void m1(){
        System.out.println("inside m1");
    }
}
class A{
    static void m2(){
        System.out.println("inside m2");
    }
}
