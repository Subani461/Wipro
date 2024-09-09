package package1;


import java.util.Scanner;

public class BookTitlesFormatter {
    public static String toTitleCase(String str) {
        String[] titles = str.split(";");
        StringBuilder result = new StringBuilder();

        for (String title : titles) {
            String[] words = title.trim().split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
            result.append(String.join(" ", words)).append("; ");
        }

        // Remove the trailing semicolon and space
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of book titles separated by semicolons:");
        String input = scanner.nextLine();
        
        String output = toTitleCase(input);
        System.out.println("Formatted Titles:");
        System.out.println(output);
        
        scanner.close();
    }
}