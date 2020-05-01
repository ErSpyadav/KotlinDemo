package demo.expresso.kotlintest.coroutinedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import demo.expresso.kotlintest.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class UnstructureActivity : AppCompatActivity() {

    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unstructure)

        //it may be freeze .if we start downloading first. beacuse main thread have very load task
        startCount.setOnClickListener {
            countTxt.text = count++.toString()
        }

        downloadData.setOnClickListener {

            CoroutineScope(Dispatchers.Main).launch {

                /**/
                //downalodingTxt.text =UserDataManager().getTotalUserCount().toString()
                downalodingTxt.text =UserDataManager2().getTotalUserCount().toString()

            }
        }


    }

}
