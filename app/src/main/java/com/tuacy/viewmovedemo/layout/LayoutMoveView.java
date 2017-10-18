package com.tuacy.viewmovedemo.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class LayoutMoveView extends View {

	public LayoutMoveView(Context context) {
		this(context, null);
	}

	public LayoutMoveView(Context context, @Nullable AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public LayoutMoveView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	private float mLastX;
	private float mLastY;

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		float x = event.getRawX();
		float y = event.getRawY();
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				mLastX = x;
				mLastY = y;
				break;
			case MotionEvent.ACTION_MOVE:
				int offsetX = (int) (x - mLastX);
				int offsetY = (int) (y - mLastY);
				layout(getLeft() + offsetX, getTop() + offsetY, getRight() + offsetX, getBottom() + offsetY);
				break;
			case MotionEvent.ACTION_UP:
				break;
		}
		mLastX = x;
		mLastY = y;
		return true;
	}

	@Override
	protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
		super.onLayout(changed, left, top, right, bottom);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
	}
}
