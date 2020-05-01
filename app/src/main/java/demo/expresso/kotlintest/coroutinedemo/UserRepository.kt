package demo.expresso.kotlintest.coroutinedemo

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers():List<User>{
        delay(8000)
        val users:List<User> = listOf(
            User(101,"Sunita"),
            User(102,"Sarayu"),
            User(103,"Bitu"),
            User(104,"Tutu")

        )
        return users
    }
}