//b) Have the program read a series of names from an input file: both first and last name. Only send to the output file
// those names that are properly entered: First letter capitalized. The rest in lower casing.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class e1b {
    public static void main(String args[]) {
        String sFName, sLName;
        try {
            Scanner sin = new Scanner(new FileReader("81bIN"));
            for (int i = 0; i < 6; i++) {// read in 6 lines of names.
                sFName = sin.next();
                sLName = sin.next();
                if (!isGood(sFName) || !isGood(sLName)) {
                    continue;
                }
                System.out.print(sFName + " " + sLName);
                System.out.println();
            }
            sin.close();
        } catch (FileNotFoundException err) {
            System.out.println(err.getMessage());
        }

    }

    public static boolean isGood(String sName) {
        int i;
        char ch;
        ch = sName.charAt(0);
        if (!Character.isAlphabetic(ch)) return false;
        if (Character.isLowerCase(ch)) return false;
        for (i = 1; i < sName.length(); i++) {
            ch = sName.charAt(i);
            if (!Character.isAlphabetic(ch)) return false;
            if (Character.isUpperCase(ch)) return false;
        }
        return true;
    }
}
