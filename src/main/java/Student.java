public class Student {

    private final String NAME;
    private char grade;
    private final int GROUP;
    private final String SECRETNICKNAME = "MySecretNickName";

    public Student(String NAME, char grade, int GROUP) {

        if (grade > 70 || grade < 65) {
            throw new IllegalArgumentException("The grade must be between A and F");
        }

        if (GROUP > 5 || GROUP < 1) {
            throw new IllegalArgumentException("The GROUP must be between 1 and 5");
        }

        this.NAME = NAME;
        this.grade = grade;
        this.GROUP = GROUP;
    }

    public char displayGrade() {
        return grade;
    }

    public String displayName() {
        return NAME;
    }
    
    public void upGrade() {
        if (Character.toString(grade).equals("A")) {
            System.out.println("The grade is already the highest possible!");
        } else {
            grade -= 1;
        }
    }

    public void downGrade() {
        if (Character.toString(grade).equals("F")) {
            System.out.println("The grade is already the lowest possible!");
        } else {
            grade += 1;
        }
    }

}
