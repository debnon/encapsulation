public class Student {

    private String name;
    private char grade;
    private int group;
    private final String SECRETNICKNAME = "MySecretNickName";

    public Student(String name, char grade, int group) {
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
