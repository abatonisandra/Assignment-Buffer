import java.io.*;

public class ViewStudents {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            String line;
            System.out.println("\n--- Student Records ---");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    System.out.println("Name: " + parts[0] +
                            ", Roll No: " + parts[1] +
                            ", Marks: " + parts[2]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ No records found. File does not exist yet.");
        } catch (IOException e) {
            System.out.println("❌ File error: " + e.getMessage());
        }
    }
}
