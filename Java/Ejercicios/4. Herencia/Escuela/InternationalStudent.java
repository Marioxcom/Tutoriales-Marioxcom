public class InternationalStudent extends Student{
    private String country;

    public InternationalStudent(String name, String address, String cycle, int course, String country) {
        super(name, address, cycle, course);
        System.out.println("I'm the constructor of class InternationalStudent");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
