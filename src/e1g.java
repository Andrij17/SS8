/*g) Write a program that will READ the following information about bank customers with the following structure:
Customer's Name  Number of Cheques Written

A customer may write 5 cheques without charge. The bank charges $0.15 for every cheque written after the first 5 free
ones. Output the customer's names and how much each owes the bank.*/


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e1g {
    public static void main(String args[])throws IOException {
        int arnNumofCheques[]=new int[5], i;
        double arnDebt[]=new double[5];
        String arsNames[]=new String[5];

        Scanner sin = new Scanner(new FileReader("81gIN.txt"));
        for (i = 0; i < 5; i++) {
            arsNames[i] = sin.next();
            arsNames[i]+=" ";
            arsNames[i] += sin.next();
            arnNumofCheques[i] = sin.nextInt();
        }
        sin.close();

        for(i=0;i<5;i++){
            if(arnNumofCheques[i]<6) arnDebt[i]=0;
            else{
                arnNumofCheques[i]-=5;
                arnDebt[i]=arnNumofCheques[i]*0.15;
            }
        }

        for(i=0;i<5;i++){
            System.out.println(arsNames[i]+" debt: $"+arnDebt[i]);
        }
    }
}
