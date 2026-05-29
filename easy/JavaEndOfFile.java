package easy;

import java.io.*;

public class JavaEndOfFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int count = 1;

        while ((line = br.readLine()) != null) {
            System.out.println(count + " " + line);
            count++;
        }

        br.close();
    }
}
