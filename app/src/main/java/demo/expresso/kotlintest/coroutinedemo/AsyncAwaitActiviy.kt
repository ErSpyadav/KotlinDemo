package demo.expresso.kotlintest.coroutinedemo

import android.os.Bundle
import android.util.Log

import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

import android.view.View

import demo.expresso.kotlintest.R
import kotlinx.android.synthetic.main.activity_async_await_activiy.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO

class AsyncAwaitActiviy : AppCompatActivity() {

    val TAG =AsyncAwaitActiviy::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_await_activiy)

        /*It perform task one by one. Taking more Time*/
        normalBtn.setOnClickListener {
            CoroutineScope(IO).launch {
                val startTime =System.nanoTime()
                Log.i(TAG,"Calculation normal Way started....")
                val result1 =getStock1();
                val result2 =getStock2()
                Log.i(TAG,"Total :${result1+result2}")

            }
        }

        /*Perform task parrallely. It is taking less time*/
        asyncBtn.setOnClickListener {

           /*Starting CoroutinScop and Asyn in Background */
            CoroutineScope(IO).launch {
                val startTime =System.nanoTime()
                Log.i(TAG,"Calculation using Asyn started....")
                val result1 =async { getStock1() }
                val result2 = async {  getStock2()}
                Log.i(TAG,"Total :${result1.await()+result2.await()}")

            }

            /*Starting CoroutinScop in Main and Asyn in Background */
            CoroutineScope(Dispatchers.Main).launch {
                val startTime =System.nanoTime()
                Log.i(TAG,"Calculation using Asyn started....")
                val result1 =async(IO) { getStock1() }
                val result2 = async(IO) {  getStock2()}
                Log.i(TAG,"Total :${result1.await()+result2.await()}")

            }


        }



    }

    private suspend fun getStock1():Int{
        delay(10000)
        Log.i(TAG,"stock 1 retrun ")
        return 55000
    }

    private suspend fun getStock2():Int{
        delay(8000)
        Log.i(TAG,"stock 2 retrun ")
        return 35000
    }

}


