package com.tuacy.viewmovedemo.translation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;


public class TranslationMoveView extends View {

	public TranslationMoveView(Context context) {
		this(context, null);
	}

	public TranslationMoveView(Context context, @Nullable AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public TranslationMoveView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
				Log.d("tuacy", "getLeft() = " + getLeft() + " getX() = " + getX() + " getScrollX() = " + getScrollX());
				setTranslationX(getTranslationX() + offsetX);
				setTranslationY(getTranslationY() + offsetY);
				break;
			case MotionEvent.ACTION_UP:
				break;
		}
		mLastX = x;
		mLastY = y;
		return true;
	}
}
