package com.tuacy.viewmovedemo.scroll;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class ScrollMoveView extends android.support.v7.widget.AppCompatTextView {

	public ScrollMoveView(Context context) {
		this(context, null);
	}

	public ScrollMoveView(Context context, @Nullable AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public ScrollMoveView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
				((View)getParent()).scrollBy(-offsetX, -offsetY);//scrollBy,scrollTo移动的是内容，所有我们这里用了getParent，Parent的内容是当前View
				break;
			case MotionEvent.ACTION_UP:
				break;
		}
		mLastX = x;
		mLastY = y;
		return true;
	}
}
