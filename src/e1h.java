/*h ) This program will read in 2 numbers and output the greatest common denominator for the two numbers.*/


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e1h {
    public static void main(String args[])throws IOException {
        int nNum1, nNum2, i, nGCF;

        Scanner sin = new Scanner(new FileReader("81hIN.txt"));
        for(i = 0; i < 4; i++){
            nNum1=sin.nextInt();
            nNum2=sin.nextInt();
            nGCF=GCF(nNum1, nNum2);
            System.out.println(nGCF);
        }

    }
    public static int GCF(int n1, int n2) {
        int nGCF = 1, nCount;

        for (nCount = n1; nCount > 0; nCount--) {
            if (n1 % nCount == 0 && n2 % nCount == 0) {
                nGCF = nCount;
                break;
            }
        }
        return nGCF;
    }
}
