package com.scorpio.mergecanseek;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Ayush Bansal on 10-02-2017.
 */

public class AirTube extends View {

    Paint aPaint,wPaint;
    Canvas aCanvas;
    int width,height;
    int left,right,bottom,top;
    int top2;
    int widthOfRect = 300;
    Rect rAir,rWater;
    float CONS;
    public AirTube(Context context) {
        super(context);
        init();
    }

    public AirTube(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AirTube(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        aPaint = new Paint();
        wPaint = new Paint();
        wPaint.setColor(Color.BLUE);
        aPaint.setColor(Color.RED);
        aPaint.setStrokeWidth(2.0f);
        aPaint.setStyle(Paint.Style.STROKE);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        top2 = bottom;
        top2 = (int )((float)top2 - (float)MainActivity.k*10);
        //System.out.println(""+bottom);
        rWater.set(left,top2,right,bottom);
        canvas.drawRect(rAir,aPaint);
        canvas.drawRect(rWater,wPaint);
        invalidate();

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = w;
        height = h;
        top2 = height-350;
        left = width/2-widthOfRect/2;
        right = width/2 + widthOfRect/2;
        top = 350;
        bottom = height-350;
        rAir = new Rect(left,top,right,bottom);
        rWater = new Rect();
        CONS = rAir.height()/100;
        System.out.println("CONS"+CONS);
    }
}
