import java.util.LinkedList;
import java.util.List;

/**
 * ==============================================================
 * MAIN CLASS - UseCase4TrainConsistMgmnt
import java.util.HashSet;
import java.util.Set;

/**
 * ==============================================================
 * MAIN CLASS - UseCase3TrainConsistMgmnt
 * ==============================================================
 * Use Case 3: Track Unique Bogie IDs
 * * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 * * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 * * This maps uniqueness validation using Set.
 * * @author Developer
 * @version 3.0
 */
public class  TrainConsistManagementApp{

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==============================================\n");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        trainConsist.add(2, "Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed...");
        // Display header
        System.out.println("==============================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==============================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        // add() inserts bogie IDs into the set
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries will be ignored internally by HashSet
        bogies.add("BG101"); // Duplicate entry
        bogies.add("BG102"); // Duplicate entry

        // Display the results
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies + "\n");

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}