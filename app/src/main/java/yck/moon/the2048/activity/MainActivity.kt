package yck.moon.the2048.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.gson.Gson
import timber.log.Timber
import yck.moon.the2048.R
import yck.moon.the2048.activity.adapter.ImageAdapter
import yck.moon.the2048.activity.utils.DefUtil
import yck.moon.the2048.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var mainBinding: ActivityMainBinding? = null
    var mArrList: ArrayList<String> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var ranNums = DefUtil.getRandomNumForKeyPad(9)
        for (number in ranNums) {
            mArrList.add(number.toString())
        }
        mainBinding?.gridView?.adapter = ImageAdapter(this, mArrList)
    }

}