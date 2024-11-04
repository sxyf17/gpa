import java.util.Arrays;

public class Student {

    private String name;
    private String gradYear;
    private Course[] courses;

    public Student(String name, Course[] courses, String gradYear) {
        this.name = name;
        this.courses = courses;
        this.gradYear = gradYear;
    }

    // Calculates unweighted GPA
    public double calcGPA() {
        double totalPoints = 0;

        for (Course course : courses) {
            totalPoints += convertToGPA(course.getAverage()); // Convert average to GPA scale
        }

        // Average GPA across courses and round to 2 decimals
        double gpa = courses.length == 0 ? 0 : totalPoints / courses.length;
        return Math.round(gpa * 100.0) / 100.0;
    }

    // Calculates weighted GPA using credit hours
    public double calcWeightedGPA() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (Course course : courses) {
            double gpaEquivalent = convertToGPA(course.getAverage()); // Convert average to GPA scale
            totalPoints += gpaEquivalent * course.getCreditHours();   // Weighted by credit hours
            totalCredits += course.getCreditHours();                  // Sum of credit hours
        }

        // Calculate weighted GPA and round to 2 decimals
        double weightedGPA = totalCredits == 0 ? 0 : totalPoints / totalCredits;
        return Math.round(weightedGPA * 100.0) / 100.0;
    }

    // Helper method to convert percentage grades to a 4.0 scale
    private double convertToGPA(double average) {
        if (average >= 93) return 4.0;
        else if (average >= 90) return 3.7;
        else if (average >= 87) return 3.3;
        else if (average >= 83) return 3.0;
        else if (average >= 80) return 2.7;
        else if (average >= 77) return 2.3;
        else if (average >= 73) return 2.0;
        else if (average >= 70) return 1.7;
        else if (average >= 67) return 1.3;
        else if (average >= 65) return 1.0;
        else return 0.0;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradYear='" + gradYear + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}