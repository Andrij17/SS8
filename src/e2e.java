/*e ) Read 3 coordinates of a triangle. Is it isosceles? Is it a right angle triangle? Which is the hypotenuse?*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e2e {
    public static void main(String args[])throws IOException {
        int nXCoords[]=new int[6], nYCoords[]=new int[6], i;
        double dDxAB, dDxAC, dDxBC, dDyAB, dDyAC, dDyBC;
        double ardSlopes[]=new double [3], dDxABsq, dDxACsq, dDxBCsq, dDyABsq, dDyACsq, dDyBCsq;
        double dAB, dAC, dBC, dHypot;
        Scanner sin = new Scanner(new FileReader("82eIN.txt"));
        for(i=0;i<3;i++){
            nXCoords[i]=sin.nextInt();
            nYCoords[i]=sin.nextInt();
        }
        sin.close();

        dDxAB=nXCoords[0]-nXCoords[1];
        dDxAC=nXCoords[0]-nXCoords[2];
        dDxBC=nXCoords[1]-nXCoords[2];
        dDxABsq=Math.pow(dDxAB,2);
        dDxACsq=Math.pow(dDxAC,2);
        dDxBCsq=Math.pow(dDxBC,2);

        dDyAB=nYCoords[0]-nYCoords[1];
        dDyAC=nYCoords[0]-nYCoords[2];
        dDyBC=nYCoords[1]-nYCoords[2];
        dDyABsq=Math.pow(dDyAB, 2);
        dDyACsq=Math.pow(dDyAC, 2);
        dDyBCsq=Math.pow(dDyBC, 2);

        dAB=Math.pow(dDxABsq+dDyABsq, 0.5);
        dAC=Math.pow(dDxACsq+dDyACsq, 0.5);
        dBC=Math.pow(dDxBCsq+dDyBCsq, 0.5);

        ardSlopes[0]=dDyAB/dDxAB;
        dHypot=ardSlopes[0];
        ardSlopes[1]=dDyAC/dDxAC;
        ardSlopes[2]=dDyBC/dDxBC;

        System.out.println(ardSlopes[0]+" is perpendicular to "+ardSlopes[2]);

        for(i=0;i<2;i++){
            if(ardSlopes[i]>dHypot) dHypot=ardSlopes[i];
        }

        if(dAB==dAC || dAB==dBC || dAC==dBC){
            System.out.println("The triangle is isosceles.");
        }else System.out.println("The triangle is not isosceles.");

        if(ardSlopes[0]*ardSlopes[1]==-1){
            System.out.println("The hypoteneuse is the side with slope "+dHypot);
        }else if(ardSlopes[0]*ardSlopes[2]==-1){
            System.out.println("The hypoteneuse is the side with slope "+dHypot);
        }else if(ardSlopes[1]*ardSlopes[2]==-1){
            System.out.println("The hypoteneuse is the side with slope "+dHypot);
        }else{
            System.out.println("The triangle is not a right triangle.");
        }
    }
}
