package lw.com.kotlinandroiddemo.activity

import lw.com.kotlinandroiddemo.R
import lw.com.kotlinandroiddemo.base.BaseActivity

/**
 * Created by engle on 2017/12/14.
 */

class MainActivity : BaseActivity() {

    private var mProgressBtn : android.widget.Button? = null

    override fun onLayoutId(): Int = R.layout.activity_entrance

    override fun initWidget() {
        mProgressBtn = findViewById(R.id.goto_progress_view)
    }

    override fun setListener() {
        mProgressBtn?.setOnClickListener {
            ProgressActivity.navigateTo(mContext!!)
        }
    }
}