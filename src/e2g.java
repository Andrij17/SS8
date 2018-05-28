/*g) Create a program that will read in 2 fractions in the form of nNum1, nDen1, nNum2, nDen2, whereby nNum is the
numerator of the fraction, and nDen is the denominator.

Your program will add the two fractions up, and then display the answer in lowest terms.*/


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e2g {
    public static void main(String args[]) throws IOException {
        int arnNum[]=new int[5], arnDen[]=new int[2], nGCF, nResultNum, nWholeNum = 0;
        int nNum1b, nNum2b, nCommDenom, i;

        Scanner sin = new Scanner(new FileReader("82gIN.txt"));
        for(i=0;i<2;i++) {
            arnNum[i]=sin.nextInt();
            arnDen[i]=sin.nextInt();
        }
        sin.close();

        /*numerators (by index):
        0 and 1-inputted
        2 and 3-after multiplication (to get a common denominator)
        4-result after addition                                 */

        //addition
        nCommDenom = arnDen[0] * arnDen[1];
        arnNum[2] = arnNum[0] * arnDen[1];
        arnNum[3] = arnNum[1] * arnDen[0];
        arnNum[4] = arnNum[2] + arnNum[3];


        if (arnNum[4] > nCommDenom) {
            nWholeNum = (int) (arnNum[4] / nCommDenom);
            arnNum[4] -= nCommDenom * nWholeNum;
        }

        nGCF = GCF(arnNum[4], nCommDenom);
        arnNum[4] /= nGCF;
        nCommDenom /= nGCF;

        if (nWholeNum == 0) {
            System.out.println(arnNum[0] + "/" + arnDen[0] + " plus " + arnNum[1] + "/" + arnDen[1] + " equals " + arnNum[4] + "/" + nCommDenom);
        } else {
            System.out.println(arnNum[0] + "/" + arnDen[0] + " plus " + arnNum[1] + "/" + arnDen[1] + " equals " + nWholeNum + " and " + arnNum[4] + "/" + nCommDenom);
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
