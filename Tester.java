public class Tester {
    public static void main(String[] args) {
        realTests();
        rationalTests();
    }

    public static void realTests() {
        RealNumber n0 = new RealNumber(0);
        RealNumber n1 = new RealNumber(0.000001);
        RealNumber n2 = new RealNumber(100000);
        RealNumber n3 = new RealNumber(100001);
        RealNumber n4 = new RealNumber(1);
        RealNumber n5 = new RealNumber(1.001);
        RealNumber n6 = new RealNumber(1.00001);

        System.out.println("Equals test:");
        System.out.println(n0.equals(n1));
        System.out.println(n2.equals(n2));
        System.out.println(n2.equals(n3));
        System.out.println(n4.equals(n2));
        System.out.println(n4.equals(n4));

        System.out.println("Add test:");
        RealNumber add0 = n2.add(n4);
        System.out.println(add0);

        System.out.println("Multiply test:");
        RealNumber multiply0 = n2.multiply(n4);
        System.out.println(multiply0);

        System.out.println("Divide test:");
        RealNumber divide0 = n4.divide(n1);
        System.out.println(divide0);

        System.out.println("Subtract test:");
        RealNumber subtract0 = n4.subtract(n1);
        System.out.println(subtract0);
    }
    public static void rationalTests() {
        RationalNumber n0 = new RationalNumber(-10, -2);
        RationalNumber n1 = new RationalNumber(2, 10);
        RationalNumber n2 = new RationalNumber(1, 2);
        RationalNumber n3 = new RationalNumber(3, 2);
        System.out.println(n0);
        System.out.println(n0.multiply(n1));
        System.out.println(n0.divide(n2));
        System.out.println(n2.add(n2));
        System.out.println(n2.add(n3));
        System.out.println(n2.subtract(n2));
        System.out.println(n2.subtract(n3));
    }
}