/*Your program will give the user the following choices:
a. The computer will display the name of all the students as well as the overall average of the three subject marks that
 are in the data list.
b. The computer will display those students that earned greater than 80% in history class.
c. The computer will display only those students that passed ALL of their courses.
d. The computer will display the those students that passed either Math or English.
e. The computer will display those students that failed no courses or just one.*/



import java.io.*;
import java.io.IOException;
import java.util.*;


public class e1f {
    public static void main(String args[])throws IOException {
        String arsNames[]=new String[7];
        int arnHisMark[]=new int[7], arnMathMark[]=new int[7], arnEngMark[]=new int[7], i, nChoice;
        int arnAverage[]=new int[7];

        Scanner sin = new Scanner(new FileReader("81fIN"));
        for (i = 0; i < 7; i++) {
            arsNames[i] = sin.next();
            arsNames[i]+=" ";
            arsNames[i] += sin.next();
            arnHisMark[i] = sin.nextInt();
            arnMathMark[i] = sin.nextInt();
            arnEngMark[i] = sin.nextInt();
            arnAverage[i]=(arnHisMark[i]+arnMathMark[i]+arnEngMark[i])/3;
        }
        sin.close();

        System.out.println("Would you like to:");
        System.out.println("1) display each student's overall average");
        System.out.println("2) display those students that earned at least 80% in history class");
        System.out.println("3) display only those students that passed all of their courses");
        System.out.println("4) display the those students that passed either Math or English");
        System.out.println("5) display those students that failed no courses or just one: ");
        Scanner sin1 = new Scanner(System.in);
        nChoice=sin1.nextInt();

        if(nChoice==1){
            for(i=0;i<7;i++) System.out.println(arsNames[i] + " average: " + arnAverage[i]);
        } else if(nChoice==2){
            for(i=0;i<7;i++)
                if (arnHisMark[i] > 79) System.out.println(arsNames[i] + " earned at least 80% in history");
        } else if(nChoice==3){
            for(i=0;i<7;i++)
                if(arnHisMark[i]>49&&arnMathMark[i]>49&&arnEngMark[i]>49) System.out.println(arsNames[i] + " passed all of their courses");
        } else if(nChoice==4) {
            for(i=0;i<7;i++)
                if(arnMathMark[i]>49 || arnEngMark[i]>49) System.out.println(arsNames[i]+" passed either math or english");
        } else {
            for(i=0;i<7;i++)
                if ((arnHisMark[i] > 49) && (arnMathMark[i] > 49) || (arnHisMark[i] > 49) && (arnEngMark[i] > 49) || (arnMathMark[i] > 49) && (arnEngMark[i] > 49))
                    System.out.println(arsNames[i] + " failed at most one course");
        }
    }
}
