/*d ) Read 3 coordinates of a triangle ABC. Find the centroid. (p. 33 of your grade 10 text)
Median: the line segment joining the mid-point of one side and the opposite vertex.
Centroid: the intersection point of the medians of a triangle. */


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e2d {
    public static void main(String args[])throws IOException {
        int nXCoords[]=new int[6], nYCoords[]=new int[6], i;
        double dSumX=0, dSumY=0, dXC, dYC;

        Scanner sin = new Scanner(new FileReader("82dIN.txt"));
        for(i=0;i<3;i++){
            nXCoords[i]=sin.nextInt();
            nYCoords[i]=sin.nextInt();
            dSumX+=nXCoords[i];
            dSumY+=nYCoords[i];
        }
        sin.close();

        dXC=dSumX/3;
        dYC=dSumY/3;


        System.out.println("The centroid is ("+dXC+","+dYC+").");
    }
}
