import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ronni on 17-11-2016.
 */
public class DAO {
    private Scanner input;

    public DAO() throws FileNotFoundException
    {
        input = new Scanner(new File("src/coinflip.txt"));
    }
    public Scanner getData()
    {
        return input;
    }
}