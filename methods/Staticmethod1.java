package Java.methods;

public class Staticmethod1 {
    static void main() {
        System.out.println("insode main");
        m1(); // direct access
        Staticmethod1.m1(); // class name acess
        System.out.println("executed main");

    }
    static void m1(){
        System.out.println("inside m1");
        return;
    }
}
