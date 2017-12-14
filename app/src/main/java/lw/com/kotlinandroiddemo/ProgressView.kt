package lw.com.kotlinandroiddemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * Created by engle on 2017/12/14.
 */
class ProgressView : View {
    var progress: Int = 0

    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        var paint = Paint()
        paint.strokeWidth = 10f
        paint.strokeCap = Paint.Cap.BUTT


//        canvas?.drawArc(RectF(100f, 100f, 500f, 500f),
//                180f, 90f, false, paint)

        canvas?.drawCircle(200f, 200f, 100f, paint)


    }
}