package easy.estruturaDeDados;

import java.io.*;

public class Java1dArrayIntroduction {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine().trim());
        }

        bufferedReader.close();

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
