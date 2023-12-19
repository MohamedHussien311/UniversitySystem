import java.util.Scanner;
public class Admin {
    private University university;
    //Constructor
    public Admin(University university) {
        this.university = university;
    }
    Scanner input = new Scanner(System.in);
    //Display the information of the input ID.
    public void viewPersonInformation(int id){
        Person person = university.getPersonByID(id);
        if(person != null){
            System.out.println("Name : " + person.getName());
            System.out.println("ID : " + person.getID());
            System.out.println("Age : " + person.getAge());
            System.out.println("Address : " + person.getAddress());
            System.out.println("Phone Number : " + person.getPhoneNumber());
            System.out.println("SSN : " + person.getSSN());
        }
        if(person instanceof Student)                   // if the entered ID is a studentID
          displayStudentInformation((Student) person);
        else if(person instanceof Professor)            // if the entered ID is a ProfessorID
            displayProfessorInformation((Professor) person);
        else if(person instanceof AssistantProfessor)   // if the entered ID is an AssistantProfessorID
             displayAssistantProfessorInformation((AssistantProfessor) person);
        else if(person instanceof Security)             // if the entered ID is a SecurityGuardID
            displaySecurityInformation((Security) person);
        else                                            // if the entered ID is invalid (Does not exist).
            System.out.println("Person with ID : " + id + " not found.");
    }
    public void displayStudentInformation(Student student){
        System.out.println("Enrolled Courses : " + student.getEnrolledCourses());
        System.out.println("Course Marks : " + student.getMarkForCourse());
    }
    public void displayProfessorInformation(Professor professor){
        System.out.println("Department : " + professor.getDepartment());
        System.out.println("Bonus = " + professor.getBonus());
        System.out.println("Salary = " + professor.getSalary());
    }
    public void displayAssistantProfessorInformation(AssistantProfessor ap){
        System.out.println("Number Of OverTime Hours = " + ap.getNumberOfHours());
        System.out.println("Hour Price = " + ap.getHourPrice());
        System.out.println("Deduction = " + ap.getDeduction());
        System.out.println("Total Salary = " + ap.getSalary());
    }
    public void displaySecurityInformation(Security security){
        System.out.println("Shift : " + security.getShift());
        System.out.println("Armed : " + security.isArmed());
    }
    public void displayCourseInformation(int courseID){
        Course course = university.getCourseByID(courseID);
        if(course != null){
            System.out.println("Course Name : " + course.getCourseName());
            System.out.println("Course ID : " + course.getCourseID());
            System.out.println("ProfessorID of this course : " + course.getProfessorIDofCourse());
        }
        else
            System.out.println("Course with ID = "+ courseID + " Not found.");
    }
    public void addStudent(){       // Method to add student
        System.out.println("Enter Student Name : ");
        String name = input.nextLine();
        System.out.println("Enter Student ID : ");
        int id = input.nextInt();
        System.out.println("Enter Student Age : ");
        int age = input.nextInt();
        System.out.println("Enter Student address : ");
        String address = input.next();
        System.out.println("Enter Student SSN : ");
        int ssn = input.nextInt();
        System.out.println("Enter Student Phone Number : ");
        int PN = input.nextInt();
        Student st = new Student(name,age,address,PN,ssn,id);
        System.out.println("Student added successfully.");
        university.addPerson(st);
        System.out.println("Enter the courseID which this student enrolled in :");
        int courseID = input.nextInt();
        if(courseID == 101 || courseID == 102 || courseID == 103){
            university.enrollStudentInCource(id,courseID);
            System.out.println("Student enrolled in this course successfully.");
        }
        else
            System.out.println("Invalid courseID");
    }
    public void addProfessor(){
        System.out.println("Enter Professor Name : ");
        String name = input.nextLine();
        System.out.println("Enter Professor ID : ");
        int id = input.nextInt();
        System.out.println("Enter Professor Age : ");
        int age = input.nextInt();
        System.out.println("Enter Professor address : ");
        String address = input.next();
        System.out.println("Enter Professor SSN : ");
        int ssn = input.nextInt();
        System.out.println("Enter Professor Phone Number : ");
        int PN = input.nextInt();
        System.out.println("Enter Professor department : ");
        String department = input.next();
        System.out.println("Enter Professor bonus : ");
        double bonus = input.nextDouble();
        System.out.println("Enter Professor salary : ");
        double salary = input.nextDouble();
        Professor prof = new Professor(name,age,address,PN,ssn,id,salary,department,bonus);
        System.out.println("Professor added successfully");
        university.addPerson(prof);
    }
    public void addAssistantProfessor(){
        System.out.println("Enter AssistantProfessor Name : ");
        String name = input.nextLine();
        System.out.println("Enter AssistantProfessor ID : ");
        int id = input.nextInt();
        System.out.println("Enter AssistantProfessor Age : ");
        int age = input.nextInt();
        System.out.println("Enter AssistantProfessor address : ");
        String address = input.next();
        System.out.println("Enter AssistantProfessor SSN : ");
        int ssn = input.nextInt();
        System.out.println("Enter AssistantProfessor Phone Number : ");
        int PN = input.nextInt();
        System.out.println("Enter AssistantProfessor department : ");
        String department = input.next();
        System.out.println("Enter AssistantProfessor bonus : ");
        double bonus = input.nextDouble();
        System.out.println("Enter AssistantProfessor salary : ");
        double salary = input.nextDouble();
        System.out.println("Enter AssistantProfessor deduction : ");
        double deduction = input.nextDouble();
        System.out.println("Enter AssistantProfessor numberOfOvertimeHours : ");
        int numberOfOvertimeHours = input.nextInt();
        System.out.println("Enter AssistantProfessor hourPrice : ");
        double hourPrice = input.nextDouble();
        AssistantProfessor ap = new AssistantProfessor(name,age,address,PN,ssn,id,salary,department
                ,bonus,numberOfOvertimeHours,hourPrice,deduction);
        System.out.println("AssistantProfessor added successfully");
        university.addPerson(ap);
    }
    public void addSecurityGuard(){
        System.out.println("Enter SecurityGuard Name : ");
        String name = input.nextLine();
        System.out.println("Enter SecurityGuard ID : ");
        int id = input.nextInt();
        System.out.println("Enter SecurityGuard Age : ");
        int age = input.nextInt();
        System.out.println("Enter SecurityGuard address : ");
        String address = input.next();
        System.out.println("Enter SecurityGuard SSN : ");
        int ssn = input.nextInt();
        System.out.println("Enter SecurityGuard Phone Number : ");
        int PN = input.nextInt();
        System.out.println("Enter SecurityGuard shift : ");
        String shift = input.next();
        System.out.println("Enter SecurityGuard salary : ");
        double salary = input.nextDouble();
        System.out.println("Enter SecurityGuard deduction : ");
        double deduction = input.nextDouble();
        System.out.println("Is the SecurityGuard armed : ");
        boolean isArmed = input.hasNext();
        Security security = new Security(name,age,address,PN,ssn,id,salary,shift,isArmed);
        university.addPerson(security);
    }
    public void addCourse(){
        System.out.println("Enter Course name : ");
        String name = input.nextLine();
        System.out.println("Enter Course ID : ");
        int courseID = input.nextInt();
        System.out.println("Enter the professorID for this course : ");
        int profID = input.nextInt();
        if(university.getPersonByID(profID) != null){
            Course course = new Course(courseID,name,profID);
            university.addCourse(course);
            System.out.println("Course added successfully");
        }
         else
            System.out.println("Professor ID is not valid.");
    }
}
