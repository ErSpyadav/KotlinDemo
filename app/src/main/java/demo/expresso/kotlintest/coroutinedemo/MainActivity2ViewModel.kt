package demo.expresso.kotlintest.coroutinedemo

import androidx.lifecycle.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO

class MainActivity2ViewModel : ViewModel() {

    private val userRepository = UserRepository()


    /*Using live data*/
    var userLive = liveData(IO) {
        val result =userRepository.getUsers()
        emit(result)
    }

    /*Using Mutable Live Data*/
    var user: MutableLiveData<List<User>> = MutableLiveData()
    fun getUderData() {

        viewModelScope.launch {
            var result: List<User>? = null
            /*Since it is long task so wirite code in withContext*/
            withContext(Dispatchers.IO){
                result =userRepository.getUsers()
            }
            user.value =result

        }
    }

    //We can do it using Live Data in very line of Code

}