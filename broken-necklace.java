import java.io.*;
import java.util.*;

/*
ID: rileype1
LANG: JAVA
TASK: beads
*/

public class beads {
    public static void main(String[] args) throws IOException{
                BufferedReader f = new BufferedReader(new FileReader("beads.in"));
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

                int numBeads = Integer.parseInt(f.readLine());
                char[] beads = new char[numBeads];
                int[] streaks = new int[numBeads];
                String beadsin = f.readLine();

                for(int i = 0; i < numBeads; i++) {
                    beads[i] = beadsin.charAt(i);
                }

                for(int i = 0; i < numBeads; i++) {
                    char bead = beads[i];
                    int index = i;
                    int counter = 0;
                    char beadaccept = '_';
                    boolean undecided = true;
                    while((beads[index] == bead || beads[index] == 'w' || beads[index] == beadaccept || undecided) && counter < numBeads) {
                        if(beads[index] != 'w') {
                            beadaccept = beads[index];
                            undecided = false;
                        }
                        index += 1;
                        index %= numBeads;
                        counter ++;
                    }
                    streaks[i] = counter;
                }

                int max = 0;
                for(int i = 0; i < streaks.length; i++){
                    int tmp = streaks[i] + streaks[(i + streaks[i]) % numBeads];
                    if (tmp > max){
                        max = tmp;
                    }
                }
                if(max > numBeads){
                    max = numBeads;
                }

                out.println(max);
                out.close();


    }
}
