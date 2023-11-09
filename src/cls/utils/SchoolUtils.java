package cls.utils;

import cls.Grade;
import cls.Person;
import cls.Student;

public class SchoolUtils {


    // This array was generated automatically ~
    // I sure that is okay to use automatic tool for such needs
    public static String[] firstNames = {
            "Alice", "Bob", "Charlie", "David", "Eva",
            "Frank", "Grace", "Henry", "Ivy", "Jack",
            "Kate", "Liam", "Mia", "Noah", "Olivia",
            "Peter", "Quinn", "Rose", "Samuel", "Taylor",
            "Uma", "Victor", "Wendy", "Xander", "Yara",
            "Zane", "Abby", "Ben", "Cora", "Dylan",
            "Emma", "Felix", "Gina", "Hugo", "Iris",
            "Jake", "Kara", "Leo", "Molly", "Nathan",
            "Olive", "Perry", "Quincy", "Riley", "Sophia",
            "Thomas", "Unity", "Violet", "Wyatt", "Zoe"
    };

    // This array was generated automatically ~
    // I sure that is okay to use automatic tool for such needs
    public static String[] lastNames = {
            "Anderson", "Baker", "Carter", "Davis", "Evans",
            "Fisher", "Garcia", "Hill", "Irwin", "Jones",
            "Keller", "Lopez", "Martinez", "Nguyen", "Owens",
            "Perez", "Quinn", "Rodriguez", "Smith", "Taylor",
            "Upton", "Vargas", "Williams", "Xu", "Young",
            "Zhang", "Adams", "Brown", "Cooper", "Dixon",
            "Edwards", "Fletcher", "Gibson", "Harris", "Ingram",
            "Johnson", "Kaplan", "Lee", "Mitchell", "Nelson",
            "Owens", "Parker", "Reyes", "Scott", "Thomas",
            "Underwood", "Vasquez", "Walker", "Xiong", "Young",
            "Zimmerman"
    };

    public static Student[] getStudents(int numOfStudents) {
        Student[] result = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {

            result[i] = new Student(
                    getName(),
                    getRandom(Person.MIN_AGE, Person.MAX_AGE),
                    getGradesForStudent());
        }
        return result;
    }

    public static Grade[] getGradesForStudent() {
        Grade[] result = new Grade[Grade.PROFESSIONS.length];
        for (int i = 0; i < Grade.PROFESSIONS.length; i++) {
            result[i] = new Grade(Grade.PROFESSIONS[i], getRandom(Grade.MIN_SCORE, Grade.MAX_SCORE));
        }
        return result;
    }

    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min +1)) + min;
    }

    public static String getName(){
        String fName = firstNames[getRandom(0, firstNames.length - 1)];
        String lName = lastNames[getRandom(0, lastNames.length - 1)];
        return fName + " " + lName;
    }
}
