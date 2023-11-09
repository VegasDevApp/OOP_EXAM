package cls;

public class Person {
    protected String name;
    protected int age;

    public static final int MIN_AGE = 20;
    public static final int MAX_AGE = 120;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < MIN_AGE){
            this.age = MIN_AGE;
        } else if (age > MAX_AGE) {
            this.age = MAX_AGE;
        }
        this.age = age;
    }
}
