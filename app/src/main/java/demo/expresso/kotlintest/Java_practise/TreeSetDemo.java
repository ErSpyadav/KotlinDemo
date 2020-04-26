package demo.expresso.kotlintest.Java_practise;

import java.sql.SQLOutput;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
/*For Empty TreeSet as the 1st Element null Insertion is Possible. But after inserting that null
if we are trying to Insert any Element we will get NullPointerException.
 For Non- Empty TreeSet if we are trying to Insert null we will get NullPointerException*/

        TreeSet treeSet = new TreeSet();
        //System.out.println(treeSet.add(null));//Exception
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(19);
        treeSet.add(9);
        System.out.println(treeSet.add(9));//false
        System.out.println(treeSet);//[1,3,9,19]
        // System.out.println(treeSet.add(null));//Exception
        // System.out.println(treeSet.add("sp"));
        //Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
    }
}
