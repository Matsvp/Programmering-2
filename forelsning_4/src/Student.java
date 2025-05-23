public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;
    private String birthNumber = "12345678910";

    public Student(){

    }

    public Student(String firstName, String lastName, int age, String studentId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }

    public String getBirthNumber(){
        return birthNumber;
    }
    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else if (age > 120) {
            this.age = 120;
        } else {
            this.age = age;
        }
    }

    // Getter and Setter for studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}