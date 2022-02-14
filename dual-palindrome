import java.io.*;
import java.util.*;

/*
ID: rileype1
LANG: JAVA
TASK: dualpal
*/

public class dualpal {
    public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new FileReader("dualpal.in"));
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));

                String temp = br.readLine();
                StringTokenizer st = new StringTokenizer(temp);

                int N = Integer.parseInt(st.nextToken());
                int S = Integer.parseInt(st.nextToken());

                int answer = 0;
                for(int i = S + 1; answer < N; i++) {
                    int correctBases = 0;
                    for (int base = 2; base <= 10; base++) {
                        String result = Integer.toString(i, base);
                        String reversed = new StringBuilder(result).reverse().toString();
                        if (result.equals(reversed)) {
                            correctBases++;
                        }
                    }
                    if (correctBases >= 2) {
                        answer++;
                        out.println(i);
                    }
                }
                

                out.close();


    }
}
