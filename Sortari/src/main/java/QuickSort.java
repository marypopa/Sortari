import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void QuickSort(List<String> list, int st, int dr) {
        int i=st;
        int j=dr;
        String a = list.get(i);
        do
        {
            while(list.get(j).compareTo(a)>=0 && i<j)
                j--;
            list.set(i,list.get(j));
            while(list.get(i).compareTo(a)<=0 && i<j)
                i++;
            list.set(j,list.get(i));
        }while(i!=j);

        list.set(i,a);
        if(st<i-1)
            QuickSort(list,st, i-1);
        if(i+1<dr)
            QuickSort(list,i+1, dr);

    }

    public static void main(String[] arg) {
        List<String> list1 = new ArrayList<>();
        list1.add("uuu");
        list1.add("ccc");
        list1.add("abb");
        list1.add("hhh");
        list1.add("aaa");

        QuickSort(list1, 0, 4);
        for(String s:list1)
            System.out.println(s);
    }

}
