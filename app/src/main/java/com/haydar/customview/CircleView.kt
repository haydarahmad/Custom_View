package com.haydar.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView(ctx:Context,attr: AttributeSet) : View(ctx,attr) {

    //radius untuk view
    private var radius = 100f

    //untuk memberi warna pada tampilan view
    private var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.RED
        canvas?.drawCircle(radius,radius,radius,paint)
    }

    //onFinishedInflate() -> Dipanggil setelah view dan semua turunannya
    //                       berasil di inflate dari xml

    //onMeasure() -> dipanggil untuk menentukan
    //               ukuran view dan semua turunanya

    //onLayout() -> dipanggil ketika view harus menetapkan ukuran dan
    // posisi untuk semua turunanya.


    //onSizeChanged() -> dipanggil ketika ukuran view telah berubah

    //onDraw() -> dipaggil ketika tampilan harus melakukan render kontennya

    //onKeysDown -> dipaggil kerika ada sebuah event key down baru terjadi

    //onKeyUp -> dipanggil kerika event key up terjadi

    //onTrackballEvent -> dipanggil ketika terjadi gerakan pada trackball

    //onTouchEvent() -> dipanggil kerika terjadi sentuhan pada layar
}