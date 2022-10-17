import java.util.*;
import java.lang.Integer;

public class CtoF {

    public static void main(String[] args) {

        double celc = 0;
        double far;
        String input = "";
        boolean done = false;

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a valid temperature.");

        do {


            try
            {
                input = String.valueOf(Integer.parseInt(kb.nextLine()));

                celc = Double.parseDouble(input);

                far = ((celc * (1.8)) + 32);

                System.out.println(celc + " degrees Celcius is " + far + " degrees Fahrenheit.");

                done = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("That is not a valid temperature.  Enter a valid temperature: ");

            }
        }
        while (done == false);




    }
}



