import java.util.HashMap;
import java.util.Map;

public class University {
    private Map<Integer,Person>people; // Map to store peoples in the university (personID,person)
    private Map<Integer,Course>courses; // Map to store courses in the university (courseID,course)
    //Constructor
    public University() {
        this.people = new HashMap<>();
        this.courses = new HashMap<>();
    }
    public void addPerson(Person person){  // add person to the map
        people.put(person.getID(),person);
    }
    public void deletePerson(int id){       // Remove person from the map by his ID
        people.remove(id);
    }
    public void addCourse(Course course){   // add course to the map
        courses.put(course.getCourseID(),course);
    }
    public void deleteCourse(int id){       // Remove course from the map by its ID
        courses.remove(id);
    }
    public Person getPersonByID(int id){    //return person by his ID
        return people.get(id);
    }
    public Course getCourseByID(int courseID){  //return course by his ID
        return courses.get(courseID);
    }
    public void enrollStudentInCource (int id,int couseID){
        Student student = (Student) getPersonByID(id);      // convert the Person type to Student type
        Course course = courses.get(couseID);
        if(student != null && course!= null){       // if the studentID and courseID are valid then enroll the student in the course.
            course.enrolledStudents(student);
            student.enrollInCourse(course.getCourseName());
        }
    }
}
