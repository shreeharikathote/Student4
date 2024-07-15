import java.util.ArrayList;

public class studentcourses {
    private ArrayList<String> courseInfo; // ArrayList to store course info

    public studentcourses() {
        courseInfo = new ArrayList<>();
    }

    public void addCourse(String courseName, int marksObtained) {
        courseInfo.add(courseName + ": " + marksObtained);
    }

    public void displayCourseInfo() {
        for (String info : courseInfo) {
            System.out.println(info);
        }
    }

    public static void main(String[] args) {
        studentcourses studentCourses = new studentcourses();
        studentCourses.addCourse("Mathematics", 85);
        studentCourses.addCourse("Physics", 90);
        studentCourses.addCourse("Computer Science", 88);
        studentCourses.addCourse("English", 75);

        studentCourses.displayCourseInfo();
    }
}

