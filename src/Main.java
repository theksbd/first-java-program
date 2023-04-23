public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Student student = new Student("John", "123", 20);

        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getAge());

        student.setName("John Doe");
        student.setId("456");
        student.setAge(21);

        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getAge());
    }
}