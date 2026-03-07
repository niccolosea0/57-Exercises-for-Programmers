import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Winner {

    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("\nEnter names to know who is the Winenr! (to stop, do not enter anythin)");
        List<String> list = new ArrayList<String>();
        addPersons(list);

        int size = list.size();
        int randomIndex = new Random().nextInt(size); 

        System.out.println("The winner is... " + list.get(randomIndex));
    }

    private static void addPersons(List<String> personList) {
        while (true) {

            System.out.print("Enter a name: ");
            String personName = scanner.nextLine();

            if (personName.equals("")) {
                break;
            }

            personList.add(personName);
        }
    }
}

