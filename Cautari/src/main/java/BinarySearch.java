import java.util.ArrayList;
import java.util.List;

public class BinarySearch {


    public static int classicBinarySearch(String a, List<String> list, int start, int end) {
        if(end<start)
            return -1;
        if(a.compareTo(list.get(start))==0) {
            return start;
        }
        int mid = (start+end)/2;
        if(a.compareTo(list.get(mid))>0)
            return classicBinarySearch(a, list, mid+1, end);
        else
            return classicBinarySearch(a, list,start, mid);

    }

    public static void binarySearch(String a, List<String> lista, int start, int end) {
        String b = lista.get(end);
        if(b.compareTo(a)<=0)
        {
            lista.add(a);
            return;
        }
        if(lista.get(start).compareTo(a)>=0){
            lista.add(start, a);
            return;
        }
        int mid=(start+end)/2;
        if(lista.get(mid).compareTo(a)<=0 && lista.get(mid+1).compareTo(a)>=0)
        {
            lista.add(mid+1, a);
            return;
        }
        if(lista.get(mid).compareTo(a)>0)
            binarySearch(a,lista, start, mid);
        if(lista.get(mid).compareTo(a)<0)
            binarySearch(a, lista, mid+1, end);
    }

    public static void main(String[] arg){
        List<String > list = new ArrayList<>();
        list.add("am");
        list.add("bbb");
        list.add("ccc");
        list.add("coo");
        list.add("ddd");
        list.add("eee");

        binarySearch("cpp", list, 0, 4);
        for(String s : list) {
            System.out.println(s);
        }
      //  System.out.println(classicBinarySearch("uu", list, 0, 4));
    }
}
