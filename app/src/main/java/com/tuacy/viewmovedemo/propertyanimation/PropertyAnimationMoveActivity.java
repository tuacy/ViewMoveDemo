package com.tuacy.viewmovedemo.propertyanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tuacy.viewmovedemo.R;


public class PropertyAnimationMoveActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, PropertyAnimationMoveActivity.class));
	}

	private Button mAction;
	private View   mViewMove;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_property_animation_move);
		initView();
		initEvent();
		initData();
	}

	private void initView() {
		mAction = (Button) findViewById(R.id.button_move_action);
		mViewMove = findViewById(R.id.view_move);
	}

	private void initEvent() {
		mAction.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				AnimatorSet animatorSet = new AnimatorSet();
				animatorSet.playTogether(
					ObjectAnimator.ofFloat(mViewMove, "translationX", 300),
					ObjectAnimator.ofFloat(mViewMove, "translationY", 300)
				);
				animatorSet.start();
			}
		});
	}

	private void initData() {

	}
}
