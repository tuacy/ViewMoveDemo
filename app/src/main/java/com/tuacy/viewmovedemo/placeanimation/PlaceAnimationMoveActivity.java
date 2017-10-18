package com.tuacy.viewmovedemo.placeanimation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import com.tuacy.viewmovedemo.R;


public class PlaceAnimationMoveActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, PlaceAnimationMoveActivity.class));
	}

	private Button mAction;
	private View   mViewMove;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_place_animation_move);
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
				TranslateAnimation anim = new TranslateAnimation(0, 300,
																 0, 300);
				anim.setFillAfter(true);
				mViewMove.startAnimation(anim);
			}
		});
	}

	private void initData() {

	}
}
