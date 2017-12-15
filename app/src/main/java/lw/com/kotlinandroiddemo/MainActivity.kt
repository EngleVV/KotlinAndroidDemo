package lw.com.kotlinandroiddemo

import android.animation.ObjectAnimator
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

/**
 * Created by engle on 2017/12/14.
 */

class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initWidget()
    }

    private fun initWidget() {
        var clickBtn = findViewById<Button>(R.id.click_btn)
        var progressView = findViewById<ProgressView>(R.id.progress_view)

        clickBtn.setOnClickListener {
            // todo("这种方法不生效，待解决")
            val animator: ObjectAnimator = ObjectAnimator.ofFloat(progressView, "progress", 65f)
            animator.duration = 500L
            animator.start()
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
        }
    }
}