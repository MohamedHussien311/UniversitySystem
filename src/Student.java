import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Student extends Person{
    private List<String> enrolledCourses;   // List to store the enrolled courses.
    private Map<String,Integer>courseMarks; // Map to store the marks of the enrolled courses (course name ,course mark).
    // Constructor
    public Student(String name, int age, String address, int phoneNumber, int SSN,int id) {
        super(name, age, address, phoneNumber, SSN,id);
        this.enrolledCourses = new ArrayList<>();
        this.courseMarks = new HashMap<>();
    }
    public List<String> getEnrolledCourses() { // return a list of enrolled Courses
        return enrolledCourses;
    }
    public void enrollInCourse(String course) {  // enroll course to the list
        enrolledCourses.add(course);
    }
    public Map<String, Integer> getMarkForCourse() { // return the courses marks
        return courseMarks;
    }
    public void setMarkForCourse(Course course,int mark) {  // add mark for course
        courseMarks.put(course.getCourseName(),mark);
    }
}
