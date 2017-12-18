package lw.com.kotlinandroiddemo.activity

import android.content.Context
import android.content.Intent
import lw.com.kotlinandroiddemo.R
import lw.com.kotlinandroiddemo.base.BaseActivity

/**
 * Created by engle on 2017/12/18.
 */

class ProgressActivity : BaseActivity() {

    override fun onLayoutId(): Int = R.layout.activity_progress

    override fun initWidget() {

    }

    override fun setListener() {

    }

    companion object {
        fun navigateTo(context : Context) {
            val intent : Intent = Intent(context, ProgressActivity::class.java)
            context.startActivity(intent)
        }
    }
}