import java.util.ArrayList;
import java.util.List;
public class InsertionSort {

    public static void insertionSort(List<String> list) {
        for(int i=1;i>list.size();i++){
            int j=i-1;
            String a=list.get(i);
            while(j>0 && a.compareTo(list.get(j))<0){
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, a);
        }
    }

    public static void main(String[] arg) {
        List<String> list1 = new ArrayList<>();
        list1.add("ccc");
        list1.add("aaa");
        list1.add("uuu");
        insertionSort(list1);
        for(String s:list1)
            System.out.println(s);
    }
}
