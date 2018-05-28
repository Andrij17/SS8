/*f) Write a program that reads 2 times in military format (0900, 1730) and outputs the number of hours and minutes
between the 2 times. It should also calculate the duration even if the two times pass midnight.
 Input specification: Start time on the first line, and the end time on the second line*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e2f {
    public static void main(String args[])throws IOException {
        int nTime1, nTime2, nMins1, nMins2, i, nHrs1, nHrs2, nTimDifMins, nTimDifHrs;

        //file read
        Scanner sin = new Scanner(new FileReader("82fIN.txt"));
        nTime1 = sin.nextInt();
        nTime2 = sin.nextInt();
        sin.close();

        //creation of minute and hour variables
        nMins1=nTime1%100;
        nHrs1=(nTime1-nMins1)/100;
        nMins2=nTime2%100;
        nHrs2=(nTime2-nMins2)/100;

        //time difference calculations
        if(nHrs2<nHrs1) nTimDifHrs=24-nHrs1+nHrs2;
        else nTimDifHrs=nHrs2-nHrs1;

        if(nMins2<nMins1) {
            nTimDifMins=60-nMins1+nMins2;
            nTimDifHrs-=1;
        } else nTimDifMins=nMins2-nMins1;

        if(nTimDifHrs<0) nTimDifHrs+=24;
        if(nTimDifMins<0) nTimDifMins+=60;

        //output
        System.out.println(nTimDifHrs+" hours, "+nTimDifMins+" minutes.");
    }
}
