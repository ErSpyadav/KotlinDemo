package demo.expresso.kotlintest.Java_practise;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet set =new HashSet();
        for(int i=10;i>0;i--)
            set.add(i);
        System.out.println(set);

        ArrayList list =new ArrayList();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(8);

        HashSet hashSet=new HashSet(list);
        System.out.println(hashSet);



    }


}
