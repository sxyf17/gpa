public class Course {

    private String courseName;
    private boolean ap;
    private int average;
    private int creditHours;

    public Course(String courseName, boolean ap, int average, int creditHours) {
        this.courseName = courseName;
        this.ap = ap;
        this.average = average;
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isAp() {
        return ap;
    }

    public void setAp(boolean ap) {
        this.ap = ap;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", ap=" + ap +
                ", average=" + average +
                ", creditHours=" + creditHours +
                '}';
    }
}