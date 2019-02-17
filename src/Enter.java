import java.util.InputMismatchException;
import java.util.Scanner;

public class Enter{
    public int resultInt(){
        Scanner inNumber = new Scanner(System.in);
        try {
            int num = inNumber.nextInt();
            return num;
        }
        catch (InputMismatchException e) {
            return 5;
        }
    }

    public String resultSrt() {
        Scanner inLine = new Scanner(System.in);
        String str = inLine.nextLine();
        return str;
    }
}
