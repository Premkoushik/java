public class s {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
int c = 23;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
System.out.println("c = " + c);
        a = a ^ b ^ c;
        b = a ^ b ^ c;
        c = a ^ b ^ c;
 a = a ^ b ^ c;
{
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
 System.out.println("c = " + c);
    }
}
}
