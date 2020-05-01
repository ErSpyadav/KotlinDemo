package demo.expresso.kotlintest.coroutinedemo

import kotlinx.coroutines.*

class UserDataManager {

    /*Here result was comming only 70. 50 was not comming*/
    suspend fun getTotalUserCount():Int{
        var count=0
        /*retrun before completeting task .return value will zero =0*/
        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            count =50
        }


        val deffer =CoroutineScope(Dispatchers.IO).async {
            delay(1000)
            val i =10/0
            return@async 70

        }
        return count +deffer.await()
    }
}