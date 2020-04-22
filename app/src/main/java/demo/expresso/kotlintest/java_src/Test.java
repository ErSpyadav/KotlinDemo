package demo.expresso.kotlintest.java_src;

public class Test<T> {


    public  void add(T t1,T t2){
        T val1 = t1;
        T val2 =t2;
        System.out.println(val1);
        System.out.println(val2);
    }

    public static void main(String[] args) {
        Test<Integer> t=new Test<Integer>();
        t.add(10,10);

        Test<String> t1=new Test<String>();
        t1.add("Sarayu","Yadav");
    }
}
