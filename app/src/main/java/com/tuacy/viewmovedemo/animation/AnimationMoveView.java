package com.tuacy.viewmovedemo.animation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


public class AnimationMoveView extends View {

	public AnimationMoveView(Context context) {
		this(context, null);
	}

	public AnimationMoveView(Context context, @Nullable AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public AnimationMoveView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}
}
