public class Main {

    public static void main(String[] args) {
        Student student = new Student("John", 'B', 2);

        student.upGrade();
        System.out.println(student.displayGrade());
        student.upGrade();

        student.downGrade();
        student.downGrade();
        student.downGrade();
        student.downGrade();
        student.downGrade();
        student.downGrade();
        System.out.println(student.displayGrade());

        System.out.println(student.displayName());

        // Student student2 = new Student("Jane", 'Z', 3);
        Student student3 = new Student("Doe", 'E', 6);

    }
}
