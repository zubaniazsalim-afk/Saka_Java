public class Main {

    public static Student getTopStudent(Student[] arr) {
        Student top = arr[0];
        for (Student s : arr) {
            if (s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int sum = 0;
        for (Student s : arr) {
            sum += s.getCredits();
        }
        return sum;
    }

    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("Ali Khan", "S001", "IT");
        students[1] = new Student("Amina Nur", "S002", "CS");
        students[2] = new Student("Dias Bek", "S003", "SE");
        students[3] = new Student("Madina A.", "S004", "IT");
        students[4] = new Student("Nurlan T.", "S005", "CS");

        students[0].updateGPA(3.8);
        students[1].updateGPA(3.2);
        students[2].updateGPA(3.9);
        students[3].updateGPA(2.9);
        students[4].updateGPA(3.6);

        students[0].addCredits(90);
        students[1].addCredits(70);
        students[2].addCredits(110);
        students[3].addCredits(60);
        students[4].addCredits(95);

        System.out.println("=== STUDENTS ===");
        for (Student s : students) {
            System.out.println(s);
        }

        Course course = new Course("OOP Java", "Dr. Smith", 5);
        for (int i = 0; i < students.length; i++) {
            course.addStudent(students[i], i);
        }

        System.out.println("\n=== COURSE INFO ===");
        System.out.println(course);
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Highest credit student: " + course.highestCreditStudent());

        System.out.println("\n=== ARRAY TASKS ===");
        System.out.println("Top GPA student: " + getTopStudent(students));
        System.out.println("Honors students count: " + countHonors(students));
        System.out.println("Total credits: " + totalCredits(students));
    }
}
