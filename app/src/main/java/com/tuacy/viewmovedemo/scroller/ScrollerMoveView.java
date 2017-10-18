package com.tuacy.viewmovedemo.scroller;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;


public class ScrollerMoveView extends View {

	private Scroller mScroller;

	public ScrollerMoveView(Context context) {
		this(context, null);
	}

	public ScrollerMoveView(Context context, @Nullable AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public ScrollerMoveView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		mScroller = new Scroller(getContext());
	}

	@Override
	public void computeScroll() {
		if (mScroller.computeScrollOffset()) {
			((View)getParent()).scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
			postInvalidate();
		}
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
				mScroller.startScroll(getScrollX(), getScrollY(), 0, 0);
				invalidate();
				break;
		}
		mLastX = x;
		mLastY = y;
		return true;
	}
}
