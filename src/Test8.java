/*Andrija Isakov
Test 8 */


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test8 {
    public static void main(String args[])throws IOException {
        int i, nX1, nX2, nX3, nY1, nY2, nY3;
        boolean arbSet[]=new boolean[5], isPar;

        //input
        Scanner sin = new Scanner(new FileReader("Pythagoras.txt"));
        for(i=0;i<5;i++){
            nX1=sin.nextInt();
            nY1=sin.nextInt();
            nX2=sin.nextInt();
            nY2=sin.nextInt();
            nX3=sin.nextInt();
            nY3=sin.nextInt();
            //send 3 coordinates to isParrallel method
            isPar=isParallel(nX1, nX2, nX3, nY1, nY2, nY3);
            if(isPar) arbSet[i]=true;
        }
        sin.close();
        for(i=0;i<5;i++){
            if(arbSet[i]) System.out.println("Set "+(i+1)+" is a right-angled triangle.");
            else  System.out.println("Set "+(i+1)+" is not a right-angled triangle.");
        }

    }
    public static boolean isParallel(int nX1,int nX2,int nX3, int nY1,int nY2,int nY3){
        double dDX12, dDX23, dDX13, dDY12, dDY23, dDY13, dM12=0, dM23=0, dM13=0;

        //slope calculation of 3 lines
        dDX12=nX1-nX2;
        dDX23=nX2-nX3;
        dDX13=nX1-nX3;
        dDY12=nY1-nY2;
        dDY23=nY2-nY3;
        dDY13=nY1-nY3;

        if(dDX12!=0) dM12=dDY12/dDX12;
        if(dDX23!=0) dM23=dDY23/dDX23;
        if(dDX13!=0) dM13=dDY13/dDX13;

        //vertical line check
        if(dDX12==0) {
            if(dM23!=0 && dM13!=0) return false;
            else return true;
        }
        if(dDX23==0) {
            if(dM12!=0 && dM13!=0) return false;
            else return true;
        }
        if(dDX13==0) {
            if(dM12!=0 && dM23!=0) return false;
            else return true;
        }

        if (dDX23 * dDX13 != -1)
            if (dDX12 * dDX23 != -1)
                if (dDX12 * dDX13 != -1) {
                    return false;
                }
        return true;
    }
}
