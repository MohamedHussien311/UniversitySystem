import java.util.ArrayList;
import java.util.List;
public class Course {
    private int courseID;
    private String courseName;
    private int professorID;
    private List<Student>enrolledStudents; // List to store the students who enrolled at each course
    //Constructor
    public Course(int courseID,String courseName, int professorID) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.professorID = professorID;
        this.enrolledStudents = new ArrayList<>();
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCourseID() {
        return courseID;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setProfessorIDofCourse(int professorID) { // Set the id of the professor who teach the course
        this.professorID = professorID;
    }
    public int getProfessorIDofCourse() { // return the id of the professor who teach the course
        return professorID;
    }
    public List<Student> getEnrolledStudents() {    // return a list of the students who enrolled in each course
        return enrolledStudents;
    }
    public void enrolledStudents(Student student) { // add the student who enrolled in the course to the list.
       enrolledStudents.add(student);
    }
}
