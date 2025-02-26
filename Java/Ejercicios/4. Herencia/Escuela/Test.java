public class Test {
    public static void main(String[] args) {
        Student student = new Student("Mateo", "Mallorca","DAW",2);
        Teacher teacher = new Teacher("Laura", "Montgat","English");
        InternationalStudent is = new InternationalStudent("Steven","Badalona","DAM",1,"Italy");
        Person parent =new Person("Luis", "Ibarra");

        teacher.addSubject("Catalan");
        System.out.println(teacher);
        teacher.removeSubject("Catalan");
        System.out.println(teacher);

    }

}
