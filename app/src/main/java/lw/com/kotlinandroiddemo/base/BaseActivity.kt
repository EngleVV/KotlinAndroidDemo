package lw.com.kotlinandroiddemo.base

import android.app.Activity
import android.content.Context
import android.os.Bundle

/**
 * Created by engle on 2017/12/18.
 */

abstract class BaseActivity : Activity() {

    protected var mContext : Context? = null

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(onLayoutId())

        mContext = this

        initWidget()
        setListener()
    }

    protected abstract fun initWidget()

    protected abstract fun setListener()

    protected abstract fun onLayoutId() : Int

}