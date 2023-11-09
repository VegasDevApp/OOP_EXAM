import cls.*;
import cls.utils.SchoolUtils;
import cls.utils.Utilities;

public class SchoolStatistics {
    public static void main(String[] args) {

        // Create 5 class rooms
        ClassRoom[] classRooms = new ClassRoom[5];

        for (int i = 0; i < classRooms.length; i++) {

            Teacher teacher = new Teacher(
                    SchoolUtils.getName(),
                    SchoolUtils.getRandom(Teacher.MIN_AGE, Teacher.MAX_AGE),
                    Grade.PROFESSIONS[SchoolUtils.getRandom(0, Grade.PROFESSIONS.length-1)]
            );

            String className = teacher.getName().split(" ")[1] + " " + teacher.getProfession();
            classRooms[i] = new ClassRoom(
                    className,
                    teacher,
                    SchoolUtils.getStudents(15)
            );
        }

        School school = new School(classRooms);
        printSchool(school);
        System.out.println("School average score: " + schoolAVG(school));

        for (String str: classAVG(school)) {
            System.out.println(str);
        }

        int[][] profScoresData = professionAVG(school);
        for (int i = 0; i < profScoresData.length; i++) {
            String prof = Grade.PROFESSIONS[i];
            System.out.println(prof + " average score: " + profScoresData[i][1] / profScoresData[i][0] );
        }
    }

    public static void printSchool(School school){

        for (ClassRoom classroom: school.getClassRooms()) {
            System.out.println(classroom.toString());
        }

    }

    public static int schoolAVG(School school){
        int scoreCount = 0;
        int sumOfScores = 0;
        for (ClassRoom classRoom: school.getClassRooms()) {

            for (Student student: classRoom.getStudents()) {
                Grade[] grades = student.getGrades();
                scoreCount += grades.length;
                for (Grade g :grades) {
                    sumOfScores += g.getScore();
                }
            }

        }

        return sumOfScores / scoreCount;
    }

    public static String[] classAVG(School school){
        String[] result = new String[school.getClassRooms().length];
        ClassRoom[] classRooms = school.getClassRooms();
        for (int i = 0; i < school.getClassRooms().length; i++) {

            int scoreCount = 0;
            int sumOfScores = 0;
            for (Student student: classRooms[i].getStudents()) {
                Grade[] grades = student.getGrades();
                scoreCount += grades.length;
                for (Grade g :grades) {
                    sumOfScores += g.getScore();
                }
            }
            result[i] = String.format("Class: %s\n\rScore Average: %d\n\r", classRooms[i].getName(), sumOfScores / scoreCount);
        }

        return result;
    }

    public static int[][] professionAVG(School school){
        int[][] acc = new int[Grade.PROFESSIONS.length][2];
        ClassRoom[] classRooms = school.getClassRooms();
        for (int i = 0; i < school.getClassRooms().length; i++) {


            for (Student student: classRooms[i].getStudents()) {
                Grade[] grades = student.getGrades();
                for (Grade g :grades) {
                    int index =Utilities.findInArray(Grade.PROFESSIONS, g.getProfession());
                    acc[index][0]++;
                    acc[index][1] += g.getScore();
                }
            }

        }

        return acc;
    }
}
