import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void mergeSort(List<String> list, int n){
        if(n<2)
            return;
        int mid = n/2;
        List<String> l = new ArrayList<>();
        List<String> r = new ArrayList<>();
        for (int i=0;i<mid;i++)
            l.add(list.get(i));
        for(int i=mid;i<n;i++)
            r.add(list.get(i));
        mergeSort(l,mid);
        mergeSort(r,n-mid);
        merge(list,l,r,mid,n-mid);

    }
    public static void merge(List<String> list, List<String> l, List<String> r, int mid, int n) {
        list.clear();
        int i=0,j=0,k=0;
        while(i<mid && j<n) {
            if(l.get(i).compareTo(r.get(j))<0){
                list.add(l.get(i));
                i++;
            }
            else {
                if(l.get(i).compareTo(r.get(j))>0){
                    list.add(r.get(j));
                    j++;
                }
                else {
                    list.add(l.get(i));
                    i++;
                    j++;
                }
            }

        }
        while(i<mid)
        {
            list.add(l.get(i));
            i++;
        }
        while(j<n){
            list.add(r.get(j));
            j++;
        }
    }

    public static void main(String[] arg) {
        List<String> list1 = new ArrayList<>();
        list1.add("ccc");
        list1.add("aaa");
        list1.add("bbb");
        list1.add("uuu");
        mergeSort(list1, 4);
        for(String s:list1)
            System.out.println(s);
    }

}
