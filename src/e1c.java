//c) The program will read one-line sentences from the input file. The program will display the number of words, and the
// length of the each word, as well as the number of “e’s” in the sentence.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class e1c {
    public static void main(String args[]) {
        String arsWords[]=new String[100];
        int i=0, j, nECount=0, arnLengths[]=new int[100];
        try {
            Scanner sin = new Scanner(new FileReader("81bIN"));
            while(true){
                if(!sin.hasNext()) break;
                arsWords[i]=sin.next();
                arnLengths[i]=arsWords[i].length();
                for(j=0;j<arsWords[i].length();j++){
                    char ch=arsWords[i].charAt(j);
                    if(ch=='e') nECount++;
                    if(!Character.isAlphabetic(ch)) arnLengths[i]--;
                }
                i++;
            }
            System.out.println("There are "+i+" words, ");
            for(j=0;j<i;j++){
                int k=j+1;
                System.out.println("Word #"+k+" is "+arnLengths[j]+" characters long.");
            }
            System.out.println("There are "+nECount+" 'e's in the sentence.");
        }catch(FileNotFoundException err){
            System.out.println(err.getMessage());
        }
    }
}
