package easy.bignumber;

import java.io.*;
import java.math.BigInteger;

public class JavaBiginteger {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        BigInteger sum = bigA.add(bigB);
        BigInteger product = bigA.multiply(bigB);

        System.out.println(sum);
        System.out.println(product);

        br.close();
    }
}
