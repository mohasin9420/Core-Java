interface MathUtil {

    static int square(int n) {
        return n * n;
    }
}

public class Example23 {

    public static void main(String[] args) {
        System.out.println(MathUtil.square(5));
    }
}