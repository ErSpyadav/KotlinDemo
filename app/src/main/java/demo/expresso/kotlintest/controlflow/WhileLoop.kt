package demo.expresso.kotlintest.controlflow

class WhileLoop{

}

fun main(args : Array<String>){

    //case 1
    var a =0
    while(a<10){
        print("Number : $a , ")
        a++;
    }

    a=0;
    do{
        print("Num : $a ,")
        a++;
    }
    while (a<10)
}