import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSearch {

    public static int cautareSecventiala(int a, List<Integer> lista) {

            int i=0;
            while(a>lista.get(i) && i<lista.size()) {
                i++;
            }
            return i;
    }

    public static void main(String[] arg) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println(cautareSecventiala(a, lista));
    }
}
