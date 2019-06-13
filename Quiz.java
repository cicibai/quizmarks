import java.util.Scanner;
import java.io.*;

public class Quiz {
    public static void main(String[]args) {
        File f = new File ("quiz responses.csv");
        try {
            Scanner input = new Scanner(f);
            String zero = input.nextLine();
            String ans = input.nextLine();
            String[]ans1 = ans.split(",");

            while(input.hasNext()) {
                String rep = input.nextLine();
                String[]rep1 = rep.split(",");
                int mark = 0;
                for (int i = 1; i <= 8; i++) {
                    if (rep1[i].equals(ans1[i])) mark++;
                }
                System.out.print(rep1[0] + " " + mark + "/8");
                System.out.println();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}