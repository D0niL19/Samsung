package Samsung;


import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Samsung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int in = scanner.nextInt();
        String to_two = Integer.toString(in,2);
        String to_eight = Integer.toString(in,8);
        String to_sixteen = Integer.toString(in,16);
        System.out.println(Integer.toString(in,2));
        System.out.println(Integer.toString(in,8));
        System.out.println(Integer.toString(in,16));

        long size_of_first = to_two.length();
        //System.out.println(size_of_first);
        if (Byte.SIZE > size_of_first) {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        if (Short.SIZE > size_of_first) {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }


}
