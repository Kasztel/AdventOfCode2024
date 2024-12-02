import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Day1_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers.in");
        Scanner scanner = new Scanner(file);
        ArrayList<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> occurences = new HashMap<>();

        while (scanner.hasNextLine()) {
            numbers.add(scanner.nextInt());
            int temp = scanner.nextInt();
            occurences.put(temp, occurences.getOrDefault(temp, 0) + 1);
        }

        int similarityScore = 0;
        for (int ele : numbers) {
            if (occurences.containsKey(ele)) {
                similarityScore += ele * occurences.get(ele);
            }
        }
        System.out.println(similarityScore);


    }
}
