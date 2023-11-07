package yck.moon.the2048.activity.adapter

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import yck.moon.the2048.R

class ImageAdapter(private val context: Context, val mArrList: ArrayList<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return mArrList.size
    }

    override fun getItem(position: Int): Any {
        return mArrList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val tView: TextView
        if (convertView == null) {
            tView = TextView(context)
            tView.setBackgroundColor(context.resources.getColor(R.color.white,null))
            tView.layoutParams = ViewGroup.LayoutParams(200, 200) // Set the image size
            tView.gravity = Gravity.CENTER
            tView.setPadding(8, 8, 8, 8)
        } else {
            tView = convertView as TextView
        }
        tView.setText(mArrList.get(position))
        tView.setBackgroundColor(context.resources.getColor(R.color.white,null))
        return tView
    }
}
