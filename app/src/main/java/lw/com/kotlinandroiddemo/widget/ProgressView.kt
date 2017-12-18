package lw.com.kotlinandroiddemo.widget

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

/**
 * Created by engle on 2017/12/14.
 */
class ProgressView : View {

    private var progress: Int = 10

    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        var paint = Paint()
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 20f
        paint.strokeCap = Paint.Cap.ROUND
        paint.isAntiAlias = true

        paint.color = Color.LTGRAY
        canvas?.drawCircle(300f, 300f, 200f, paint)

        paint.color = Color.DKGRAY
        canvas?.drawArc(RectF(100f, 100f, 500f, 500f),
                180f, 360*(progress)/100f, false, paint)

        //canvas?.drawCircle(200f, 200f, 100f, paint)
    }

    fun setProgress(progress: Int){
        this.progress = progress
        invalidate()
    }

}