import java.io.*;
import java.util.Scanner;

public class AddStudent {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Roll Number: ");
            String roll = scanner.nextLine();

            System.out.print("Enter Marks: ");
            int marks = Integer.parseInt(scanner.nextLine());

            // Save student details to file
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.text", true));
            writer.write(name + "," + roll + "," + marks);
            writer.newLine();
            writer.close();

            System.out.println("✅ Student details saved successfully!");
        } catch (NumberFormatException e) {
            System.out.println("❌ Error: Marks must be a number.");
        } catch (IOException e) {
            System.out.println("❌ File error: " + e.getMessage());
        }

        scanner.close();
    }
}
