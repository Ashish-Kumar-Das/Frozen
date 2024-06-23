import java.util.HashSet;
import java.util.Scanner;

public class SmallestMissingPositive {

    public static int findSmallestMissingPositive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        // Populate the HashSet with positive integers from the array
        for (int num : nums) {
            if (num > 0) {
                seen.add(num);
            }
        }
        
        // Find the smallest missing positive integer
        int missing = 1;
        while (seen.contains(missing)) {
            missing++;
        }
        
        return missing;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter the elements of the array separated by spaces:");
        String inputLine = scanner.nextLine();
        
        // Split the input line into strings and convert them to integers
        String[] inputStrings = inputLine.split(" ");
        int[] nums = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            nums[i] = Integer.parseInt(inputStrings[i]);
        }
        
        // Find the smallest missing positive integer
        int result = findSmallestMissingPositive(nums);
        
        // Print the result
        System.out.println("The smallest missing positive integer is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
