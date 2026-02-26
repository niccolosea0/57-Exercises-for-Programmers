import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class MagicBall {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Yes");
        list.add("No");
        list.add("Maybe");
        list.add("Ask again later");

        System.out.print("What is your question? ");
        String question = scanner.nextLine();

        int index = new Random().nextInt(list.size());
        System.out.println("Random number: " + index);
        System.out.println(list.get(index));
         
    }
}
