public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30, "123456789");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birth Number: " + person.getBirthNumber());

        UnitConverter unitConverter = new UnitConverter();
        double result = unitConverter.convert(1000, "meters", "kilometers");
        System.out.println("1000 meters is " + result + " kilometers");
    }
}
