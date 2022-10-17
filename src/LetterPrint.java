public class LetterPrint {

    public static void main(String[] args) {

        String top = "********************";
        String middle = "        ****    ";
        String bottom1 = "****    ****";
        String bottom2 = "************";
        int count;

        for (count = 0; count < 3; count++)
        {
            System.out.println(top);
        }

        for (count = 0; count < 8; count++)
        {
            System.out.println(middle);
        }

        for (count = 0; count < 4; count++)
        {
            System.out.println(bottom1);
        }

        for (count = 0; count < 2; count++)
        {
            System.out.println(bottom2);
        }


    }
}
