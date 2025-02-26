public class Student extends Person{
    private String cycle;
    private int course;

    public Student(String name, String address, String cycle, int course) {
        super(name, address);
        System.out.println("I'm the constructor of class Student");
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public int getCouse() {
        return course;
    }

    public void setCouse(int course) {
        this.course = course;
    }
}
