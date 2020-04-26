package demo.expresso.kotlintest.Java_practise;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList list =new ArrayList();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println("Initail:\n"+list);

        Iterator iterator =list.iterator();
        while (iterator.hasNext()){
            Integer i = (Integer) iterator.next();
            System.out.println("Data:"+i);
            if((int)i==8)
                iterator.remove();

        }
        System.out.println("After iteration:\n"+list);

    }
}
