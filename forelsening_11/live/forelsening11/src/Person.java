public class Person {
    
    private String firstName;
    private String lastName;
    private int age;
    private final String birthNumber;

    public Person(String birthNumber){
        this.birthNumber = birthNumber;
    }
    
    public Person(String firstName, String lastName, int age, String birthNumber){
        this.firstName= firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthNumber = birthNumber;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for birthNumber
    public String getBirthNumber() {
        return birthNumber;
    }
}
