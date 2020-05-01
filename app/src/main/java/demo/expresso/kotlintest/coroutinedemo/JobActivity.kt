package demo.expresso.kotlintest.coroutinedemo

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import demo.expresso.kotlintest.R
import kotlinx.android.synthetic.main.activity_job.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class JobActivity : AppCompatActivity() {

    val TAG =JobActivity::class.java.simpleName
    lateinit var job1 : Job
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job)

        job1 =CoroutineScope(Dispatchers.Main).launch {

            downalodData()
        }




        //it may be freeze .if we start downloading first. beacuse main thread have very load task
        cancelBtn.setOnClickListener {
           job1.cancel()
        }

        statusBtn.setOnClickListener {
           if(job1.isActive){
               jobStatus.text ="Active"
           }
            else if (job1.isCancelled){
               jobStatus.text ="Cancelled"
           }
           else if (job1.isCompleted){
               jobStatus.text ="Completed"
           }
        }

        resumeBtn.setOnClickListener {
            if (job1.isCancelled){

            }
        }
    }

    private suspend fun downalodData(){
        withContext(Dispatchers.Main){
          /*in stead of creating loop. we just created repeat*/
           repeat(30){
               delay(1000)
               Log.i(TAG,"Repeating.....$it")
           }

        }
    }

}
