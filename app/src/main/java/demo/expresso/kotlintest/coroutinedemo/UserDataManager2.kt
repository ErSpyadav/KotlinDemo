package demo.expresso.kotlintest.coroutinedemo

import kotlinx.coroutines.*

class UserDataManager2 {

    var count=0
    lateinit var deferred: Deferred<Int>

    /* Here return value will come 50+70 =120*/
    suspend fun getTotalUserCount():Int {

        coroutineScope {
            launch(Dispatchers.IO) {
                delay(3000)
                count = 50
            }

            deferred = async(Dispatchers.IO) {
                delay(1000)
                return@async 70

            }

        }

        return count + deferred.await()
    }
}