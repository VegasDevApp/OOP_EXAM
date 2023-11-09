package cls;

import cls.utils.Utilities;

public class Grade {

    private String profession;

    public static final int MIN_SCORE = 40;
    public static final int MAX_SCORE = 100;

    public static final String MATH = "math";
    public static final String CHEMISTRY = "chemistry";
    public static final String GEOGRAPHY = "geography";
    public static final String LITERATURE = "literature";
    public static final String PHYSICS = "physics";
    public static final String SPORTS = "sports";

    public static final String[] PROFESSIONS = {MATH, CHEMISTRY, GEOGRAPHY, LITERATURE, PHYSICS, SPORTS};

    private int score;

    public Grade(String profession, int score) {
        setProfession(profession);
        setScore(score);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        if(Utilities.findInArray(PROFESSIONS, profession) >= 0) {
            this.profession = profession;
        } else {
            this.profession = LITERATURE;
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score < MIN_SCORE) {
            this.score = MIN_SCORE;
        } else if (score > MAX_SCORE) {
            this.score = MAX_SCORE;
        } else {
            this.score = score;
        }
    }

    @Override
    public String toString() {
        return "Grade{" +
                "profession='" + profession + '\'' +
                ", score=" + score +
                "\n\r";
    }
}
