import java.util.*;

class Student {

    double calculatePercentage(int total, int obtained) {
        return ((double) obtained / total) * 100;
    }
}

class ScholarshipStudent extends Student {
    double calculatePercentage(int total, int obtained) {
        double percentage = ((double) obtained / total) * 100;
        return percentage + 5;
    }
}

public class NeoOverride{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        ScholarshipStudent scholarshipStudent = new ScholarshipStudent();

        int totalMarks = scanner.nextInt();
        int obtainedMarks = scanner.nextInt();

        double studentPercentage = student.calculatePercentage(totalMarks, obtainedMarks);
        double scholarshipStudentPercentage = scholarshipStudent.calculatePercentage(totalMarks, obtainedMarks);

        System.out.printf("Student Percentage: %.2f%%\n", studentPercentage);
        System.out.printf("Scholarship Student Percentage: %.2f%%\n", scholarshipStudentPercentage);

        scanner.close();
    }
}