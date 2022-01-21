package ir.omidrezabagherian.myappone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import ir.omidrezabagherian.myappone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        /*supportFragmentManager.commit {
            val myHead = HeadFragment()
            add(R.id.containerHead, myHead)
            setReorderingAllowed(true)
        }

        supportFragmentManager.commit {
            val myBody = BodyFragment()
            add(R.id.containerBody, myBody)
            setReorderingAllowed(true)
        }*/

        supportFragmentManager.commit {
            val myLogs = LogsFragment()
            add(R.id.containerLags, myLogs)
            setReorderingAllowed(true)
        }


    }

    fun addImageInContainerHead() {

    }
}