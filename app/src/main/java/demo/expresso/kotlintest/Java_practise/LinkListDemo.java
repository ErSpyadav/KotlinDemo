package demo.expresso.kotlintest.Java_practise;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListDemo {

    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.addFirst(10);
        for(int i=1;i<=5;i++)
            list.add(i);
        list.addLast(20);

        ListIterator listIterator =list.listIterator();
        while (listIterator.hasNext()){
            Integer num = (Integer) listIterator.next();
            System.out.println(num);
            if(num==5)
                listIterator.remove();
            if(num==3)
                listIterator.add(66);
        }
        System.out.println(list);

    }
}
