/*a) Write a program that counts and displays on screen the number of words in an input file. All words in the file are
separated by blank spaces or ends of lines.*/


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e2a {
    public static void main(String args[])throws IOException {
        String arsWords[]=new String[50];
        int nNumofWords=0, i=0;

        Scanner sin = new Scanner(new FileReader("82aIN.txt"));
        while(sin.hasNext()){
            arsWords[i]=sin.next();
            nNumofWords++;
            i++;
        }
        sin.close();

        System.out.println(nNumofWords);
    }
}