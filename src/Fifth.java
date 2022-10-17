import java.io.*;

public class Fifth {

    public static void main(String[] args) {

        int count;
        char asterisk = '*';
        String current = "*";


        for (count = 1; count <= 5; count++)
        {
            System.out.println(current);
            current = current + asterisk;
        }

    }
}
