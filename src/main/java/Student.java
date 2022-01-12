public class Student {

    private String name;
    private char grade;
    private int group;
    private final String SECRETNICKNAME = "MySecretNickName";

    public Student(String name, char grade, int group) {

        if (grade > 70 || grade < 65) {
            throw new IllegalArgumentException("The grade must be between A and F");
        }

        if (group > 5 || group < 1) {
            throw new IllegalArgumentException("The group must be between 1 and 5");
        }

        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public char displayGrade() {
        return grade;
    }

    public String displayName() {
        return name;
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
