package demo.expresso.kotlintest.coroutinedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import demo.expresso.kotlintest.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //it may be freeze .if we start downloading first. beacuse main thread have very load task
        startCount.setOnClickListener {
            countTxt.text = count++.toString()
        }

        downloadData.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {
                downlaodingData()
            }

            //Performance issue will come if we perform long task in Main Thread
            // downlaodingData()
        }


    }

    private suspend fun downlaodingData() {
        for (i in 1..2000000) {
            //direct setting Ui from background thread is not possible
           // downalodingTxt.text="Downloading ....."

            withContext(Dispatchers.Main){
                downalodingTxt.text="Downloading .....$i"

            }
            /*To make running delay*/
            delay(3000)
        }
    }
}
