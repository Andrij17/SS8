//a) Read in the file 81aIN.txt. It contains four marks (average) of some students. The number of students is under 10.
// Display the averages of these students, and the student with the highest mark.

//import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class e1a {
    public static void main(String args[]) {
        try{
            Scanner sin = new Scanner(new FileReader("81aIN.txt"));
            int arnNum[] = new int[4];
            for (int i = 0; i < 4; i++) {// read in 4 lines of marks.
                for (int j = 0; j < 4; j++) { // 4 marks per line
                    arnNum[j] = sin.nextInt();
                    System.out.print(arnNum[j] + " ");
                }
                System.out.println();
            }
            sin.close();
        }catch(FileNotFoundException err){
            System.out.println(err.getMessage());
        }
    }
}
