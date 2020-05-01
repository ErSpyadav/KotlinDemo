package demo.expresso.kotlintest.coroutinedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import demo.expresso.kotlintest.R

class MainActivity2 : AppCompatActivity() {

    lateinit var mainActivity2ViewModel :MainActivity2ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)
        mainActivity2ViewModel = ViewModelProvider(this).get(MainActivity2ViewModel::class.java)

        mainActivity2ViewModel.getUderData()
        mainActivity2ViewModel.user.observe(this , Observer { myUser ->

            myUser.forEach { user ->
                println(" User Name is ${user.name} And Id is :${user.id}")
                println("*************************************")
            }
        })

        /*Using Live Data*/
       // mainActivity2ViewModel.getUderData()
        mainActivity2ViewModel.user.observe(this , Observer { myUser ->

            myUser.forEach { user ->
                println(" User Name is ${user.name} And Id is :${user.id}")
                println("*************************************")
            }
        })


    }

}
