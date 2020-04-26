package demo.expresso.kotlintest.Java_practise;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee  {
    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

class NameSorting implements Comparator<Student>{

    @Override
    public int compare(Student student, Student t1) {
       return student.age-t1.age;
    }
}
class AgeDiscending implements Comparator<Student>{

    @Override
    public int compare(Student student, Student t1) {
        return t1.age-student.age;
    }
}

class AgeAscending implements Comparator<Student>{

    @Override
    public int compare(Student student, Student t1) {
        return student.age-t1.age;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        //TreeSet treeSet =new TreeSet(new AgeDiscending());//Age :28,12,10,8
        TreeSet treeSet =new TreeSet(new AgeAscending());//Age :8,10,12,28

        treeSet.add(new Student(28,"Sarayu"));
        treeSet.add(new Student(8,"Rikhi"));
        treeSet.add(new Student(10,"Ujawal"));
        treeSet.add(new Student(12,"Pinku"));

        Iterator iterator =treeSet.iterator();
        while (iterator.hasNext()){
            Student student =(Student)iterator.next();
            System.out.println(student.age);
        }

        System.out.println(treeSet);

    }
}
