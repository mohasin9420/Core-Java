package Java.methods;

public class staticmethod4 {
    static void main() {
        System.out.println("start main");
        int x=100;
        float y=200.5f;
        m1(x,y );
        System.out.println("method end");
    }
    static  void m1(int a ,float b){
        System.out.println("inside m1");
        float res=a + b;
        System.out.println(a+b);
        System.out.println("method execute");

    }
}
