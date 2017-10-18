package com.tuacy.viewmovedemo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Px;
import android.util.AttributeSet;
import android.util.Log;


public class TestView extends android.support.v7.widget.AppCompatButton {

	public TestView(Context context) {
		this(context, null);
	}

	public TestView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		Log.d("tuacy", "view onMeasure");
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Log.d("tuacy", "view onDraw");
	}

	@Override
	protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
		super.onLayout(changed, left, top, right, bottom);
		Log.d("tuacy", "view onLayout");
	}

	@Override
	public void layout(@Px int l, @Px int t, @Px int r, @Px int b) {
		super.layout(l, t, r, b);
		Log.d("tuacy", "view layout");
	}
}
