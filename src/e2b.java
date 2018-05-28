/*b) Write a program that will determine what the longest word in a file is. The program will display the word and its
length.*/


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e2b {
    public static void main(String args[])throws IOException {
        String arsWords[]=new String[50], sLongestWord;
        int i=1;

        Scanner sin = new Scanner(new FileReader("82bIN.txt"));
        arsWords[0]=sin.next();
        sLongestWord=arsWords[0];
        while(true){
            if(!sin.hasNext()) break;
            arsWords[i]=sin.next();
            if(arsWords[i].length()>sLongestWord.length())  sLongestWord=arsWords[i];
            i++;
        }
        sin.close();

        System.out.println("The longest word is "+sLongestWord);
    }
}
