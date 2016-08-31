package com.success.sonpham.democustomimageview;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
/**
 * Created by SonPham on 8/30/2016.
 */
public class ArcView extends View {

    float width;

    float height;
    final RectF oval = new RectF();
    float center_x, center_y;
    float left, right;

    public ArcView(Context context) {
        super(context);
    }
    public ArcView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        width = (float) getWidth();
        height = (float) getHeight();

        float  strokeWidth=25;

        float radius;

        if (width > height) {
            radius = (height / 2)-strokeWidth; // Dad strokeWidth


        } else {
            radius = (width / 2)-strokeWidth;
        }

        Paint paint = new Paint();
        paint.setAntiAlias(true);
       // paint.setColor(0xffd2c8b6);
        paint.setColor(Color.parseColor("#BAB399"));
        paint.setStrokeWidth(strokeWidth);

        paint.setStyle(Paint.Style.STROKE);

        //center_x = width / 2;
        center_x =0;
        center_y =height / 2;

        left = center_x - radius;
        float top = center_y - radius;
        right = center_x + radius;
        float bottom = center_y + radius;

        oval.set(left, top, right, bottom);

        //this is the background arc, it remains constant
        canvas.drawArc(oval, 270,180, false, paint);

    }

}