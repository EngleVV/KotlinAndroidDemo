package lw.com.kotlinandroiddemo.widget

/**
 * Created by engle on 2017/12/15.
 */

class MyLinearLayout : android.widget.LinearLayout {

    constructor(context: android.content.Context?) : super(context)

    constructor(context: android.content.Context?, attrs: android.util.AttributeSet?) : super(context, attrs)

    constructor(context: android.content.Context?, attrs: android.util.AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        val clickBtn = findViewById<android.widget.Button>(lw.com.kotlinandroiddemo.R.id.click_btn)
        val progressView = findViewById<ProgressView>(lw.com.kotlinandroiddemo.R.id.progress_view)

        val animator: android.animation.ObjectAnimator = android.animation.ObjectAnimator.ofFloat(progressView, "rotation", 360f)
        animator.duration = 500L
        animator.repeatCount = android.animation.ValueAnimator.INFINITE
        animator.interpolator = android.view.animation.LinearInterpolator()

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