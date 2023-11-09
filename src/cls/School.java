package cls;

public class School {
    private ClassRoom[] classRooms = new ClassRoom[5];

    public School(ClassRoom[] classRooms) {
        setClassRooms(classRooms);
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        for (int i = 0; i < this.classRooms.length; i++) {
            this.classRooms[i] = classRooms[i];
        }
    }
}
