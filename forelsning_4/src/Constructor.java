public class Constructor {
    public static void main(String[] args) {
        
        Student student1 = new Student("Jhon", "Doe", 34, "945945");

        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getAge());
        System.out.println(student1.getStudentId());
    }
    
}
