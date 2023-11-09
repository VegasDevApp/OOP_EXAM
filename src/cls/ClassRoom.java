package cls;

import java.util.Arrays;

public class ClassRoom {
    private String name;
    private Teacher teacher;
    private Student[] students = new Student[15];

    public ClassRoom(String name, Teacher teacher, Student[] students) {
        setName(name);
        setTeacher(teacher);
        setStudents(students);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        for (int i = 0; i < this.students.length; i++) {
            this.students[i] = students[i];
        }
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + Arrays.toString(students) +
                "}\n\r";
    }
}
