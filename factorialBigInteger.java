import java.math.BigInteger;
import java.util.Scanner;

public class factorialBigInteger {
    public static String factorial(int A) {
        BigInteger factResult=BigInteger.ONE;
        for(int i=1;i<=A;i++) {
            factResult=factResult.multiply(BigInteger.valueOf(i));
        }
        return factResult.toString();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int A=s.nextInt();
        String factResult=factorial(A);
        System.out.println(factResult);
    }
}
