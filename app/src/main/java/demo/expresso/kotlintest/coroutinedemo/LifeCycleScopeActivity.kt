package demo.expresso.kotlintest.coroutinedemo

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.lifecycleScope

import demo.expresso.kotlintest.R
import demo.expresso.kotlintest.coroutinedemo.ui.lifecyclescope.LifeCycleScopeFragment
import kotlinx.android.synthetic.main.life_cycle_scope_activity.*
import kotlinx.android.synthetic.main.life_cycle_scope_fragment.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LifeCycleScopeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.life_cycle_scope_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LifeCycleScopeFragment.newInstance())
                .commitNow()
        }
      lifecycleScope.launch {
          delay(5000)
          progressBar.visibility = View.VISIBLE
          delay(10000)
          progressBar.visibility =View.GONE
      }

        lifecycleScope.launch (IO){
            Log.i("MyTag","lifecycle is called")
        }
    }
}
