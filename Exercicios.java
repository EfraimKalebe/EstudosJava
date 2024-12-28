public class Exercicios {

    public static void main(String[] args) {
      
        String prodoct1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double prince1 = 21000.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.println(prodoct1 + ", which price is " + prince1);
        System.out.println(product2 + ", wich price is  " + price2 );


        System.out.println( "Record:  " +  age + " years old, code " + code + " and gender" + gender );

    
        System.out.println("Measue with eight decima places: " + measure);
        System.out.printf("Rouded (three decima places):  " + "%.3f%n", measure);
        System.out.printf("Us decimal point: " + "%.3f%n", measure);
        
    
    }

}