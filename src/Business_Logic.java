import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ronni on 17-11-2016.
 */
public class Business_Logic {
    private static final double DRAW = 50.0;
    public void coinFlip() throws FileNotFoundException
    {
        DAO dao = new DAO();
        Scanner input = dao.getData();
        while(input.hasNextLine())
        {
            String word = "";
            String wordUpper = "";
            char upper;
            int count = 0;
            int headsCount = 0;
            double percent = 0.0;

            word = input.nextLine();
            wordUpper = word.toUpperCase();

            for(int i = 0; i < wordUpper.length(); i++)
            {
                upper = wordUpper.charAt(i);

                if(upper == ' ')
                {
                    count--;
                }

                else if(upper == 'H')
                {
                    headsCount++;
                }
                count++;
            }
            percent = ((double)headsCount / (double)count) * 100;
            System.out.printf("%d heads (%2.2f%%)\n", headsCount, percent);
            if(percent > DRAW)
            {
                System.out.println("You win!");
            }
            System.out.println();
        }
    }
}
