public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student student1 = new Student();

        // Set the properties using setters
        student1.setName("Alice");
        student1.setStudentId(12345);
        student1.setGpa(3.75);
        student1.setNumberOfCredits(45);

        // Get the properties using getters
        String name = student1.getName();
        int studentId = student1.getStudentId();
        double gpa = student1.getGpa();
        int numberOfCredits = student1.getNumberOfCredits();

        // Print out the student information
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
        System.out.println("Number of Credits: " + numberOfCredits);
    }
}

//public class Course {
   // private String topic;
   // private Teacher instructor;
    //private ArrayList<Student> enrolledStudents;
//}
