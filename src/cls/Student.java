package cls;

import java.util.Arrays;

public class Student extends Person {

    private Grade[] grades = new Grade[6];

    public Student(String name, int age, Grade[] grades) {
        super(name, age);
        setGrades(grades);
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        for (int i = 0; i < this.grades.length; i++) {
            this.grades[i] = grades[i];
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grades=" + Arrays.toString(grades) +
                "\n\r";
    }
}
