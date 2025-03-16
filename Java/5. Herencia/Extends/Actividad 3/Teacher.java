import java.util.HashSet;

public class Teacher extends Person{
    private HashSet<String> subjects;

    public Teacher(String name, String address, String subjects) {
        super(name, address);
        this.subjects = new HashSet<String>();
        System.out.println("I'm the constructor of class Teacher");
    }

    public boolean addSubject(String suject) {
        boolean add = subjects.add(suject);
        return add;
    }

    public boolean removeSubject(String suject) {
        boolean remove = subjects.remove(suject);
        return remove;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subjects=" + subjects +
                '}';
    }
}