public class ClassesAndObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        

        student1.firstName = "Mats";
        student1.lastName = "Vik Pettersen";
        student1.age = 20;
        student1.studentId = "12345678";

        System.out.println(student1.firstName);
        System.out.println(student1.lastName);
        System.out.println(student1.age);
        System.out.println(student1.studentId);

        System.out.println("---Student 2---");
        Student student2 = new Student();
        student2.firstName = "ola";
        student2.lastName = "nordman";
        student2.age = 20;
        student2.studentId = "12348";

        System.out.println(student2.firstName);
        System.out.println(student2.lastName);
        System.out.println(student2.age);
        System.out.println(student2.studentId);

        System.out.println();
        System.out.println(student1.firstName + " " + student1.lastName);
    }
    
}
