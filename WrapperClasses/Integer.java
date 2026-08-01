package java.lang;

public final class Integer extends Number implements Comparable<Integer> {
    
    // The actual raw primitive value stored inside the object
    private final int value;

    // Standard constructor (DEPRECATED: Use Integer.valueOf() instead)
    @Deprecated(since="9")
    public Integer(int value) {
        this.value = value;
    }

    // Modern factory method used during Autoboxing
    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
}
