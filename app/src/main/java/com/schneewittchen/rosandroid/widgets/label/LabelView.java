package com.schneewittchen.rosandroid.widgets.label;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

import com.schneewittchen.rosandroid.R;
import com.schneewittchen.rosandroid.widgets.base.BaseView;

import javax.annotation.Nullable;

public class LabelView extends BaseView {
    public  static final String TAG = "LabelView";

    TextPaint textPaint;
    Paint backgroundPaint;
    StaticLayout staticLayout;

    public LabelView(Context context) {
        super(context);
        init();
    }

    public  LabelView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        backgroundPaint = new Paint();
        backgroundPaint.setColor(Color.BLACK);
        backgroundPaint.setStyle(Paint.Style.FILL_AND_STROKE);

        textPaint = new TextPaint();
        textPaint.setColor(Color.WHITE);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setTextSize(20 * getResources().getDisplayMetrics().density);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();

        canvas.drawRect(new Rect(0,0,(int)width,(int)height),backgroundPaint);

        staticLayout = new StaticLayout(widgetEntity.text,
                textPaint,
                (int) getWidth(),
                Layout.Alignment.ALIGN_CENTER,
                1.0f,
                0,
                false);
        canvas.save();
        canvas.rotate(widgetEntity.rotation,width / 2,height / 2);
        canvas.translate( ((width / 2)-staticLayout.getWidth()/2), height / 2 - staticLayout.getHeight() / 2);
        staticLayout.draw(canvas);
        canvas.restore();
    }
}