package lw.com.kotlinandroiddemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View

/**
 * Created by engle on 2017/12/14.
 */
class ProgressView(context: Context) : View(context) {
    var progress: Int = 0

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        var paint: Paint = Paint()

    }
}