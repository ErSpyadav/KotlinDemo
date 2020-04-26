package demo.expresso.kotlintest.Java_practise;


import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
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


    @Override
    public int compareTo(Student student) {
        if (age >student.age)
            return 1;
        else {
            return -1;
        }
    }
}

    public class ComparableDemo {
        public static void main(String[] args) {
            TreeSet treeSet =new TreeSet();
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
