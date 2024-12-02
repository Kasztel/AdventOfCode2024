import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class Day1_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers.in");
        Scanner scanner = new Scanner(file);
        ArrayList<Integer> firstNums = new ArrayList<>();
        ArrayList<Integer> secondNums = new ArrayList<>();

        while (scanner.hasNextLine()) {
            firstNums.add(scanner.nextInt());
            secondNums.add(scanner.nextInt());
        }

        Collections.sort(firstNums);
        Collections.sort(secondNums);
        int distance = 0;

        ArrayList<Integer> distances = new ArrayList<>();
        for (int i = 0; i < firstNums.size(); i++) {
            int num1 = firstNums.get(i);
            int num2 = secondNums.get(i);
            distance += Math.abs(num1 - num2);
        }

        System.out.println(distance);

    }
}
