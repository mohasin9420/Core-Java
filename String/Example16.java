class Example16 {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        String str = "CyberSuccess";

        System.out.println(str.startsWith("Cyb"));
        System.out.println(str.startsWith("ber"));
        System.out.println(str.startsWith("cce"));
        System.out.println(str.endsWith("ess"));
		System.out.println(str.endsWith("ces"));
        System.out.println(str.contains("Cyb"));
        System.out.println(str.contains("ber"));

        String str1 = null;

        System.out.println(str1.isEmpty()); // This will throw NullPointerException
    }
}