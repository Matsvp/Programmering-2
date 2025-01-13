public class BacicConsept {
    public static void main(String[] args) throws Exception {
        
        // Variabel and Datatypes
        int number = 10;

        System.out.println("Whole number:" + number);

        double decimal = 5;
        System.out.println("Decimal number" + decimal);

        boolean bool = true;
        System.out.println("Boolean value" + bool);

        String text = "You shall not pass!";

        System.out.println(text);

        //calculation
        System.out.println("\n---Calculation---");


        int sum1 = number + 20;
        System.out.println("int calculation:" + sum1);

        double sum2 = number + decimal;
        System.out.println("int and double calclation " + sum2);

        int sum3 = (int)(number + decimal);
        System.out.println("typecasting from doubel to int " + sum3);

        int divisjon1 = number / 3;
        System.out.println("Division with whole numbers " + divisjon1);

        double divisjon2 = number / 3.0;
        System.out.println("Typical division " + divisjon2);

        //Assigment
        System.out.println("\n ---Assignment");
        int variabel1 = 42;
        int variabel2 = variabel1;
        System.out.println("Varkable 1:" + variabel1);
        System.out.println("Varkable 2:" + variabel2);

        variabel1 = 123;

        System.out.println("Varkable 1 after change: " + variabel1);
        System.out.println("Varkable 2 after change: " + variabel2);
    }
}
