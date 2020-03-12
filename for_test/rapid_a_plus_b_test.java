package for_test;

import java.io.*;

public class rapid_a_plus_b_test {
    public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        br.close();

        String line ="";
        for(int i=1; (line = br.readLine()) != null; i++) {
            System.out.println(line);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       String s = "abcdefg";
       bw.write(s+"\n");
       bw.write("hello\n");
       bw.flush();
       bw.close();
    }
}
