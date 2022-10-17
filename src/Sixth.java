import java.lang.StringBuilder;

public class Sixth {

    public static void main(String[] args) {


            int count;
            char asterisk = '*';
            String current = "******";

            StringBuilder newString = new StringBuilder(current);

            for (count = 5; count >= 0; count--)
            {

                newString.deleteCharAt(count);
                System.out.println(newString);
            }

        }


    }

