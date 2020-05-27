package mx.edu.ittepic.ladm_u4_practica2_canvassensores_franciscomendez

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo (p:MainActivity): View(p){

    var hDia = true
    var puntero = p
    var posX = 500f
    var posY = 1600f

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        var p = Paint()

        /* p.color = Color.GRAY
         p.textSize = 80f
         c.drawText("Ruben Francisco", 200f,500f,p)*/
    if (hDia) {
        //Sol
        p.color = Color.YELLOW
        c.drawCircle(300f, 400f, 150f, p)

        //Nube
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(570f, 500f, 100f, p)
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(700f, 490f, 100f, p)
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(800f, 500f, 100f, p)
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(900f, 488f, 100f, p)
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(570f, 600f, 100f, p)
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(500f, 600f, 100f, p)
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(700f, 590f, 100f, p)
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(800f, 600f, 100f, p)
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(900f, 588f, 100f, p)

        //Montañas
        p.color = Color.rgb(72, 202, 49)
        c.drawCircle(2160f, 4500f, 3500f, p)
        p.color = Color.rgb(72, 202, 49)
        c.drawCircle(-1080f, 4500f, 3500f, p)
    }else{
        c.drawRGB(39,97,166)
        //Sol alunado
        p.color = Color.WHITE
        c.drawCircle(300f, 400f, 150f, p)

        //Nube nigga
        p.color = Color.rgb(24, 64, 96)
        c.drawCircle(570f, 500f, 100f, p)
        p.color = Color.rgb(24, 64, 96)
        c.drawCircle(700f, 490f, 100f, p)
        p.color = Color.rgb(24, 64, 96)
        c.drawCircle(800f, 500f, 100f, p)
        p.color = Color.rgb(24, 64, 96)
        c.drawCircle(900f, 488f, 100f, p)
        p.color = Color.rgb(24, 64, 96)
        c.drawCircle(570f, 600f, 100f, p)
        p.color = Color.rgb(24, 64, 96)
        c.drawCircle(500f, 600f, 100f, p)
        p.color = Color.rgb(24, 64, 96)
        c.drawCircle(700f, 590f, 100f, p)
        p.color = Color.rgb(24, 64, 96)
        c.drawCircle(800f, 600f, 100f, p)
        p.color = Color.rgb(24, 64, 96)
        c.drawCircle(900f, 588f, 100f, p)

        //Montañas nigga
        p.color = Color.rgb(19, 67, 21)
        c.drawCircle(2160f, 4500f, 3500f, p)
        p.color = Color.rgb(19, 67, 21)
        c.drawCircle(-1080f, 4500f, 3500f, p)

    }

        //troncos
        p.color = Color.rgb(95,59,23)
        c.drawRect(415f,1450f,255f,1800f,p)
        p.color = Color.rgb(95,59,23)
        c.drawRect(915f,1250f,755f,1655f,p)

        //Hojas
        p.color = Color.rgb(66,105,67)
        c.drawCircle(255f,1250f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(280f,1390f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(355f,1250f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(380f,1390f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(455f,1250f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(450f,1390f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(255f,1310f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(280f,1390f,100f,p)

        p.color = Color.rgb(66,105,67)
        c.drawCircle(750f,1200f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(880f,1200f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(955f,1200f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(750f,1100f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(900f,1100f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(960f,1100f,100f,p)
        p.color = Color.rgb(66,105,67)
        c.drawCircle(735f,1150f,100f,p)
        p.color = Color.rgb(155,111,39)
        c.drawCircle(840f,1400f,50f,p)

        /*p.color = Color.rgb(179,163,25)
        c.drawText(""+width+" , "+height,50f,50f,p)*/

        //El pica pica
        c.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.iconopikachu), posX, posY, p)

    }
}