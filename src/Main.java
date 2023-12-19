import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        University university = new University();
        Admin admin = new Admin(university);
        Professor prof1 = new Professor("Dr.Ahmed Ali",45,"Menof",112623051,
                1266,20000,15000,"CSE",1000);

        university.addPerson(prof1);
        Professor prof2 = new Professor("Dr.Mohamed Ibrahim",40,"Sadat",102542201,
                20054,20001,12000,"Control",500);
        university.addPerson(prof2);

        Course c1 = new Course(101,"DataBase",prof1.getID());
        university.addCourse(c1);

        Course c2 = new Course(102,"Power Electronic",prof2.getID());

        university.addCourse(c2);

        Course c3 = new Course(103,"OOP",prof1.getID());
        university.addCourse(c3);

        Student st1 = new Student("Mohamed Rafat",23,"Minya",12054872,30271542,2000581);
        university.enrollStudentInCource(2000581,101);
        university.enrollStudentInCource(2000581,103);
        st1.enrollInCourse(c1.getCourseName());
        st1.enrollInCourse(c3.getCourseName());
        st1.setMarkForCourse(c1,80);
        st1.setMarkForCourse(c3,85);

        university.addPerson(st1);

        Student st2 = new Student("Gomaa Shabaan",22,"Alexandria",120548762,300548427,2000582);
        university.enrollStudentInCource(2000582,102);
        st2.enrollInCourse(c2.getCourseName());
        st2.setMarkForCourse(c2,73);
        university.addPerson(st2);

        AssistantProfessor ap = new AssistantProfessor("Mostafa Atlam",30,"Cairo",1524657842,
                290154214,10001,8000,"CSE",300,8,40,150);
        university.addPerson(ap);

        Security security1 = new Security("Taha Said",35,"Tanta",125488762,
                27615421,30002,5000,"Night",true);
        university.addPerson(security1);

        int admin1 = 102030 , admin2 = 203040;   // two IDs for two admins
        Scanner input = new Scanner(System.in);
        System.out.println("Please,Enter your ID");
        int id = input.nextInt();
        if(id == admin1 || id == admin2){       // the entered ID is an adminID
            System.out.println("Welcome admin");
            while(true){                        // infinity loop until the admin exit manually.
                System.out.println("Choice what do you want to do:");
                System.out.println("1-Add Student");
                System.out.println("2-Add Professor");
                System.out.println("3-Add AssistantProfessor");
                System.out.println("4-Add Security guard");
                System.out.println("5-Add Course");
                System.out.println("6-Delete Student");
                System.out.println("7-Delete Professor");
                System.out.println("8-Delete AssistantProfessor");
                System.out.println("9-Delete Security guard");
                System.out.println("10-Delete Course");
                System.out.println("11-View information of course by its ID");
                System.out.println("12-View information of any peron by his ID");
                System.out.println("00-Exit.");     // to exit from the loop.
                int choiceNumber = input.nextInt();
                switch (choiceNumber) {
                    case 1:
                        admin.addStudent();
                        break;
                    case 2:
                        admin.addProfessor();
                        break;
                    case 3:
                        admin.addAssistantProfessor();
                        break;
                    case 4:
                        admin.addSecurityGuard();
                        break;
                    case 5:
                        admin.addCourse();
                        break;
                    case 6:
                        System.out.println("Enter the ID of the student you want to delete : ");
                        int stID = input.nextInt();
                        if(university.getPersonByID(stID) == null) // Check if the studentID is valid
                            System.out.println("Invalid Student ID");
                        else {
                            university.deletePerson(stID);
                            System.out.println("Student with ID = " + stID + " deleted successfully.");
                        }
                        break;
                    case 7:
                        System.out.println("Enter the ID of the professor you want to delete : ");
                        int profID = input.nextInt();
                        if(university.getPersonByID(profID) == null)    // Check if the professorID is valid
                            System.out.println("Invalid Professor ID");
                        else {
                            university.deletePerson(profID);
                            System.out.println("Professor with ID = " + profID +" deleted successfully.");
                        }
                        break;
                    case 8:
                        System.out.println("Enter the ID of the AssistantProfessor you want to delete : ");
                        int apID = input.nextInt();
                        if(university.getPersonByID(apID) == null)      // Check if the assistantProfessorID is valid
                            System.out.println("Invalid AssistantProfessor ID");
                        else {
                            university.deletePerson(apID);
                            System.out.println("AssistantProfessor with ID = " + apID +" deleted successfully.");
                        }
                        break;
                    case 9:
                        System.out.println("Enter the ID of the Security guard you want to delete : ");
                        int sgID = input.nextInt();
                        if(university.getPersonByID(sgID) == null)      // Check if the securityGuardID is valid
                            System.out.println("Invalid Security guard ID");
                        else {
                            university.deletePerson(sgID);
                            System.out.println("Security guard with ID = " + sgID +" deleted successfully.");
                        }
                        break;
                    case 10:
                        System.out.println("Enter the ID of the Course you want to delete : ");
                        int courseID = input.nextInt();
                        if(university.getCourseByID(courseID) == null)  //if the courseID is not valid
                            System.out.println("Invalid Course ID");
                        else {                             // if it is valid, delete the course
                            university.deleteCourse(courseID);
                            System.out.println("The Course with ID = " + courseID +" deleted successfully.");
                        }
                        break;
                    case 11:
                        System.out.println("Enter the courseID which you want to view his information :");
                        int courseid = input.nextInt();
                        admin.displayCourseInformation(courseid);
                        break;
                    case 12:
                        System.out.println("Enter the PersonID which you want to view his information :");
                        int personID = input.nextInt();
                        admin.viewPersonInformation(personID);
                        break;
                }
                System.out.println("***********************************************");
                if(choiceNumber == 00 )
                    break;
            }
        }
        else if(university.getCourseByID(id) != null){   // if the entered ID is a courseID
            admin.displayCourseInformation(id);
        }
        else{       // if the entered ID is not an adminID nor courseID
            admin.viewPersonInformation(id);
        }
    }
}