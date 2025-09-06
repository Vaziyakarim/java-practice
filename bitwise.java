public class bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 1);
        System.out.println(a >> 1);

        int c = -5;
        System.out.println(c >>> 1);
    }
}
