import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;
public class Interclasare {

    public static List<String> interclasare(List<String> list1, List<String> list2) {
        List<String> list = new ArrayList<>();
        int i=0;
        int j=0;
        while (i<list1.size() && j<list2.size()) {
            if(list1.get(i).compareTo(list2.get(j))<0) {
                list.add(list1.get(i));
                i++;
            }
            else {
                if(list1.get(i).compareTo(list2.get(j))==0) {
                    list.add(list1.get(i));
                    i++;
                    j++;
                }else {
                    list.add(list2.get(j));
                    j++;
                }
            }
        }

        while(i<list1.size()) {
            list.add(list1.get(i));
            i++;
        }
        while(j<list2.size()) {
            list.add(list2.get(j));
            j++;
        }
        return list;
    }

    public static void main(String[] arg) {
            List<String> list1 = new ArrayList<>();
            list1.add("aaa");
            list1.add("ccc");
            list1.add("uuu");
        List<String> list2 = new ArrayList<>();
        list2.add("bbb");
        list2.add("ccc");
        list2.add("eee");
        for(String s:interclasare(list1,list2))
            System.out.println(s);
    }
}
