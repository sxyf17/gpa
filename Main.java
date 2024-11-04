import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student name and graduation year
        System.out.print("Student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Graduation Year: ");
        String gradYear = scanner.nextLine();

        // Create an array to hold the courses
        Course[] courses = new Course[4];

        // Prompt for course details
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Course " + (i + 1) + ":");
            System.out.print("Course Name: ");
            String courseName = scanner.nextLine();
            System.out.print("Is AP? (true/false): ");
            boolean isAP = Boolean.parseBoolean(scanner.nextLine());
            System.out.print("Grade: ");
            int grade = Integer.parseInt(scanner.nextLine());
            System.out.print("Credit Hours: ");
            int creditHours = Integer.parseInt(scanner.nextLine());

            // Add the course to the array
            courses[i] = new Course(courseName, isAP, grade, creditHours);
        }

        // Create the student object
        Student student = new Student(studentName, courses, gradYear);

        // Print student information and GPA calculations
        System.out.println("\n" + student.toString());
        System.out.println("GPA: " + student.calcGPA());
        System.out.println("Weighted GPA: " + student.calcWeightedGPA());

        scanner.close();
    }
}