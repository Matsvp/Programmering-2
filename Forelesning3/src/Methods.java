
public class Methods {
    public static void main(String[] args) throws Exception {
    
        boolean result = ageIsLeagal(20);
        System.out.println("20 is a legal age: " + result);

        boolean result2 = ageIsLeagal(15);
        System.out.println("15 is a leagal age: " + result2);

        //---void method---
        System.out.println("---Void method---");

        countTo(11);
    }

    public static boolean ageIsLeagal(int age){
        if(age >= 18 ) {
            return true;
        }
        return false;
    }

    public static void countTo(int number){
        for (int x = 1; x <= number; x++){
            System.out.println(x);
        }
    }
}
