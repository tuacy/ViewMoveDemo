package com.tuacy.viewmovedemo.draghelper;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;


public class DragHelperMoveViewGroup extends FrameLayout {

	private ViewDragHelper mViewDragHelper;
	private View           mDragView;

	public DragHelperMoveViewGroup(Context context) {
		this(context, null);
	}

	public DragHelperMoveViewGroup(Context context, @Nullable AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public DragHelperMoveViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		mViewDragHelper = ViewDragHelper.create(this, 1.0f, new ViewDragHelperCallBack());
	}

	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		mDragView = getChildAt(0);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		return mViewDragHelper.shouldInterceptTouchEvent(ev);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		mViewDragHelper.processTouchEvent(event);
		return true;
	}

	@Override
	public void computeScroll() {
		if (mViewDragHelper.continueSettling(true)) {
			invalidate();
		}
	}

	private class ViewDragHelperCallBack extends ViewDragHelper.Callback {

		@Override
		public boolean tryCaptureView(View child, int pointerId) {
			return child == mDragView;
		}

		@Override
		public int clampViewPositionHorizontal(View child, int left, int dx) {
			return left;
		}

		@Override
		public int clampViewPositionVertical(View child, int top, int dy) {
			return top;
		}

	}
}
