import java.util.*;

class Main {

    public static char getGrades(int marks) {
        if(marks >= 90) return 'A';
        else if(marks >= 80 && marks <= 89) return 'B';
        else if(marks >= 70 && marks <= 79) return 'C';
        else if(marks >= 60 && marks <= 69) return 'D';
        else if(marks >= 50 && marks <= 59) return 'E';
        else return 'F';
    }

    public static void main(String[] args) {
        final int totalSubjects = 5;
        int [] marks = new int[totalSubjects];
        char [] grades = new char[totalSubjects];
        String [] subjects = {"English", "Hindi", "Mathematics", "Science", "Social Science"};

        Scanner in = new Scanner(System.in);
        int i = 0;

        for(String subject: subjects) {
            System.out.println("Enter the marks in " + subject);
            marks[i] = in.nextInt();
            grades[i] = getGrades(marks[i]);
            i++;
        }

        long totalMarks = Arrays.stream(marks).sum();
        double averageMarks = (double) totalMarks / totalSubjects;

        System.out.println("===========================");

        System.out.println("Subjects \t Marks \tGrade");
        for(i = 0; i < totalSubjects; i++) {
            System.out.println(subjects[i] + "\t\t" + marks[i] + "\t\t" + grades[i]);
        }

        System.out.println("===========================");

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + averageMarks);
    }
}
