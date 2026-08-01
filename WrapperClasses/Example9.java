import java.util.ArrayList;

class Example9 {
    public static void main(String[] args) {
        // --- 1. AUTOBOXING EXAMPLE ---
        // Compiler automatically converts the primitive value 42 to Integer.valueOf(42)
        Integer wrapperNum = 42; 

        // Primary Use Case: Adding primitives to a collection (Collections cannot hold primitives)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100); // Autoboxed from primitive 'int' to 'Integer' object


        // --- 2. UNBOXING EXAMPLE ---
        // Compiler automatically converts the Integer object to wrapperNum.intValue()
        int primitiveNum = wrapperNum; 

        // Arithmetic operations force automatic unboxing
        int sum = list.get(0) + 50; // list.get(0) is an Integer object; unboxed to int to add 50
        
        System.out.println("Sum: " + sum);
    }
}
