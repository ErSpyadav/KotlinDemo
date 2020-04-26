package demo.expresso.kotlintest.Java_practise;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumeratorDemo {

    public static void main(String[] args) {
        Vector v =new Vector();
        for(int i=1;i<=10;i++){
            v.addElement(i);
        }

        Enumeration enumeration =v.elements();//It does not have remove method
        while (enumeration.hasMoreElements()){
            Integer num = (Integer) enumeration.nextElement();
            System.out.println(num);

        }
    }
}
