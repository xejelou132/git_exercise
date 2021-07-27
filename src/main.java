import model.Student;

public class main {

    public static void main(String[] args) {
        Student student = new Student();

        student.setAge(26);
        student.setIdNo(123);
        student.setGender("Male");
        student.setName("Darlen Kitz Suizo");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getIdNo());
        System.out.println(student.getGender());


    }
}
