package yck.moon.the2048.activity

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import timber.log.Timber
import yck.moon.the2048.R
import yck.moon.the2048.activity.utils.DefUtil
import yck.moon.the2048.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {



    var mainBinding: ActivityMainBinding? = null
    var mNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 현재 binding시킨 xml의 variable name
        initKeypadRandomNum()
    }

    fun initKeypadRandomNum() {
        try {
            var randomPadNumArrList = ArrayList<Int>()
            randomPadNumArrList.addAll(DefUtil.getRandomNumForKeyPad(mNumber))
            for (i in 0 until mNumber) {
                val resource_id: Int = resources.getIdentifier("tv_$i", "id", packageName)
                val tv: TextView = findViewById(resource_id)
                if (i == randomPadNumArrList.size) {
                    tv.text = ""
                    return
                }
                if (randomPadNumArrList[i].toString().isNotEmpty()){
                    tv.text = ""
                } else {
                    tv.text = randomPadNumArrList[i].toString()
                }
            }
        } catch(e: Exception) {
            Timber.tag("YCK_LOG").e("${e.message}")
        }
    }
}