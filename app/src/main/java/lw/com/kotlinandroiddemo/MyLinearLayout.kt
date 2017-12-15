package lw.com.kotlinandroiddemo

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.LinearLayout

/**
 * Created by engle on 2017/12/15.
 */

class MyLinearLayout : LinearLayout {

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        val clickBtn = findViewById<Button>(R.id.click_btn)
        val progressView = findViewById<ProgressView>(R.id.progress_view)

        val animator: ObjectAnimator = ObjectAnimator.ofFloat(progressView, "rotation", 360f)
        animator.duration = 500L
        animator.repeatCount = ValueAnimator.INFINITE
        animator.interpolator = LinearInterpolator()

        clickBtn.setOnClickListener {
            when (clickCount % 2) {
                0 -> animator.start()
                1 -> animator.pause()
            }
            clickCount++
        }
    }

    private var clickCount : Int = 0
}