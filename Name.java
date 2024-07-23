import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: String Concatenation
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        String fullName = lastName + ", " + firstName + " " + middleName;
        System.out.println("Concatenated Full Name: " + fullName);

        // Part 2: String Comparison
        System.out.println("Enter another full name: ");
        String anotherFullName = scanner.nextLine();

        if (fullName.equalsIgnoreCase(anotherFullName)) {
            System.out.println("The names are the same.");
        } else {
            System.out.println("The names are different.");
        }

        // Part 3: String Modification
        String modifiedFullName = fullName.replace('a', '@').replace('e', '3').toUpperCase();
        System.out.println("Modified Full Name: " + modifiedFullName);

        // Part 4: String Splitting
        String[] nameParts = fullName.split(", ");
        String lastNamePart = nameParts[0];
        String[] firstAndMiddleNames = nameParts[1].split(" ");

        System.out.println("Last Name: " + lastNamePart);
        System.out.println("First Name: " + firstAndMiddleNames[0]);
        System.out.println("Middle Name: " + firstAndMiddleNames[1]);

        // Part 5: String Trimming
        System.out.println("Enter a string with leading and trailing spaces: ");
        String stringWithSpaces = scanner.nextLine();
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: " + trimmedString);

        // Part 6: Additional Manipulations
        int vowelCount = 0;
        for (char c : fullName.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the concatenated full name: " + vowelCount);

        scanner.close();
    }
}


