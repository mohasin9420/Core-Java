package Java.methods;

public class staticmethod3 {
    static void main() {
        System.out.println("start main");
        int a=100;
        m1(a);
        System.out.println("end main");
    }
    static  void m1(int b){
        System.out.println("inside m1");
        System.out.println(b);

    }
}
