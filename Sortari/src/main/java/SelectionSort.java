import java.util.ArrayList;
import java.util.List;
public class SelectionSort {

    public static void selectionSort(List<String> list){
        int min = 0;
        for(int j=0;j<list.size();j++) {
            min=j;
            for (int i = j+1; i < list.size(); i++)
                if (list.get(j).compareTo(list.get(i)) > 0) {
                    min = i;
                }

                String aux = list.get(j);
                list.set(j, list.get(min));
                list.set(min, aux);
        }
    }

    public static void main(String[] arg) {
        List<String> list1 = new ArrayList<>();
        list1.add("ccc");
        list1.add("aaa");
        list1.add("uuu");
        selectionSort(list1);
        for(String s:list1)
            System.out.println(s);
    }
}
