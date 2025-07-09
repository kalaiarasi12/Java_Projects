package project2java;
//Interface
interface ProgressTrackable {
	 void trackProgress();
	}
//Abstract Class
abstract class User
{
 private String name;
 private String email;
 private String userId;

 public User(String name, String email, String userId) 
 {
     this.name = name;
     this.email = email;
     this.userId = userId;
 }

 public String getName() 
 { 
	 return name; 
	 }
 public String getEmail()
 { 
	 return email;
 }
 
 public String getUserId() 
 { 
	 return userId;
 }

 public void setName(String name) { 
	 this.name = name;
	 }
 public void setEmail(String email) {
	 this.email = email; 
	 }
 public void setUserId(String userId) { 
	 this.userId = userId;
	 }

 
 public abstract void viewProfile();

 public final void displayWelcome() {
     System.out.println("Welcome to EduSmart LMS!" + " " + userId );
 }
}

//Student Class
class Student extends User implements ProgressTrackable {
 private String enrolledCourse1;
 private String enrolledCourse2;

 public Student(String name, String email, String userId) {
     super(name, email, userId);
 }

 public void enrollCourse(String courseName) {
     if (enrolledCourse1 == null) {
         this.enrolledCourse1 = courseName;
     } else if (enrolledCourse2 == null) {
         this.enrolledCourse2 = courseName;
     } else {
         System.out.println("Cannot enroll in more than 2 courses.");
     }
 }

 @Override
 public void viewProfile() {
     System.out.println("Student Profile: " + getName() + ", Email: " + getEmail());
 }

 @Override
 public void trackProgress() {
     System.out.println(getName() + " is tracking progress for enrolled courses.");
 }
}

//Instructor Class
class Instructor extends User {
 private String createdCourse1;
 private String createdCourse2;

 public Instructor(String name, String email, String userId) {
     super(name, email, userId);
 }

 public void createCourse(String courseName) {
     if (createdCourse1 == null) {
         this.createdCourse1 = courseName;
     } else if (createdCourse2 == null) {
         this.createdCourse2 = courseName;
     } else {
         System.out.println("Cannot create more than 2 courses.");
     }
 }

 @Override
 public void viewProfile() {
     System.out.println("Instructor Profile: " + getName() + ", Email: " + getEmail());
 }
}

//Admin Class
class Admin extends User {
 public Admin(String name, String email, String userId) {
     super(name, email, userId);
 }

 public void removeUser(User user) {
     System.out.println("Admin removed user: " + user.getName());
 }

 @Override
 public void viewProfile() {
     System.out.println("Admin Profile: " + getName() + ", Email: " + getEmail());
 }
}

//Course Class
class Course {
 private String title;
 private int durationInHours;
 private final int maxStudents;

 // Overloaded Constructor 1
 public Course(String title, int durationInHours, int maxStudents) {
     this.title = title;
     this.durationInHours = durationInHours;
     this.maxStudents = maxStudents;
 }

 // Overloaded Constructor 2
 public Course(String title) {
     this(title, 0, 0);
 }

 public void showCourseDetails() {
     System.out.println("Course: " + title + ", Duration: " + durationInHours + " hrs, Max Students: " + maxStudents);
 }
}

//Main Class
public class EduSmartMain {
 public static void main(String[] args) {
     // Create Students
     Student s1 = new Student("Kalai", "kalai123@email.com", "S01");
     Student s2 = new Student("Nandhu", "Nandhu@email.com", "S02");

     // Create Instructors
     Instructor i1 = new Instructor("Sandesh", "san23@email.com", "I01");
     Instructor i2 = new Instructor("Shivam", "shiv34@email.com", "I02");

     // Create Admin
     Admin admin = new Admin("Admin One", "admin@email.com", "A01");

     // Instructors create courses
     i1.createCourse("Java Basics");
     i1.createCourse("OOP Concepts");
     i2.createCourse("Data Structures");
     i2.createCourse("Algorithms");

     // Create Courses
     Course c1 = new Course("Java Basics", 20, 50);
     Course c2 = new Course("Data Structures", 30, 40);
     Course c3 = new Course("Algorithms");

     // Students enroll
     s1.enrollCourse("Java Basics");
     s1.enrollCourse("OOP Concepts");
     s2.enrollCourse("Data Structures");

     // Display Profiles
     s1.displayWelcome();
     s1.viewProfile();
     s2.viewProfile();
     i1.viewProfile();
     i2.viewProfile();
     admin.viewProfile();

     // Track Progress
     s1.trackProgress();
     s2.trackProgress();

     // Admin removes a user
     admin.removeUser(s2);

     // Show Course Details
     c1.showCourseDetails();
     c2.showCourseDetails();
     c3.showCourseDetails();
 }
}
