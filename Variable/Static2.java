package Java.Variable;

public class Static2 {
    static void main() {
        float result = A.a+b.b;
        System.out.println(result);
    }


}
class A {
    static  int a =10;

}
 class b{
    static float b= 15.5F;
 }
