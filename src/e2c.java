/*c) Read the coordinates of 2 lines. Assess whether these 2 lines are perpendicular.(2 lines a perpendicular if the
slopes are negative reciprocals).*/


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e2c {
    public static void main(String args[])throws IOException {
        int nXCoords[]=new int[4], nYCoords[]=new int[4], i;
        double dSlopeLineA, dSlopeLineB, dDX1, dDY1, dDX2, dDY2;

        Scanner sin = new Scanner(new FileReader("82cIN.txt"));
        for(i=0;i<4;i++){
            nXCoords[i]=sin.nextInt();
            nYCoords[i]=sin.nextInt();
        }
        sin.close();

        dDX1=nXCoords[0]-nXCoords[1];//-1
        dDY1=nYCoords[0]-nYCoords[1];//20
        dDX2=nXCoords[2]-nXCoords[3];//-20
        dDY2=nYCoords[2]-nYCoords[3];//-1
        System.out.println("dX2: "+dDX2+", dY2: "+dDY2);

        dSlopeLineA=dDY1/dDX1;//-20
        dSlopeLineB=dDY2/dDX2;//1/20
        System.out.println(dSlopeLineA+" "+dSlopeLineB);

        if(dSlopeLineA*dSlopeLineB==-1){
            System.out.println("The lines are perpendicular.");
        }else{
            System.out.println("The lines are not perpendicular.");
        }
    }
}
