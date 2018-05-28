//d) The computer will calculate the total earnings for each employee. Output a list of the names and total earnings for
// each employee. You will then give the user the option of displaying only those employees that make more than $300.


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class e1d {
    public static void main(String args[]){
        String arsNames[]= new String[4], sHWage;
        int arnTotalEarnings[]=new int [4], i, nHours, nChoice;
        double dHWage;

        try {
            Scanner sin = new Scanner(new FileReader("81dIN"));
            for(i=0; i < 4; i++) {
                arsNames[i] = sin.next();
                arsNames[i] += sin.next();
                sHWage = sin.next();
                dHWage = Float.valueOf(sHWage);
                nHours = sin.nextInt();
                arnTotalEarnings[i] = (int) (dHWage * nHours);
            }
            sin.close();

            for(i=0;i<4;i++){
                System.out.println(arsNames[i]+"  Total earnings: "+arnTotalEarnings[i]);
            }


            Scanner sin1 = new Scanner(System.in);
            System.out.println("Would you like to display only those employees that make more than $300? " +
                    "[type 1 for yes or 0 for no]: ");
            nChoice = sin1.nextInt();

            if(nChoice==1){
                for(i=0;i<4;i++){
                    if(arnTotalEarnings[i]>300){
                        System.out.println(arsNames[i]+"  Total earnings: "+arnTotalEarnings[i]);
                    }
                }
            }
        }catch(FileNotFoundException err){
            System.out.println(err.getMessage());
        }
    }
}
