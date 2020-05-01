package demo.expresso.kotlintest.coroutinedemo.ui.lifecyclescope

import androidx.lifecycle.ViewModelProviders

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope

import demo.expresso.kotlintest.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class LifeCycleScopeFragment : Fragment() {

    private var mViewModel: LifeCycleScopeViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.life_cycle_scope_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(LifeCycleScopeViewModel::class.java)
        // TODO: Use the ViewModel

        lifecycleScope.launch {
            Log.i("MyTag","lifecycle is called")
        }
        lifecycleScope.launchWhenCreated{
            Log.i("MyTag","lifecycle when Create")
        }
        lifecycleScope.launchWhenResumed {
            Log.i("MyTag","lifecycle resume")
        }

    }

    companion object {

        fun newInstance(): LifeCycleScopeFragment {
            return LifeCycleScopeFragment()
        }
    }

}
