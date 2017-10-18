package com.tuacy.viewmovedemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tuacy.viewmovedemo.animation.AnimationMoveActivity;
import com.tuacy.viewmovedemo.draghelper.DragHelperMoveActivity;
import com.tuacy.viewmovedemo.layout.LayoutMoveActivity;
import com.tuacy.viewmovedemo.offset.OffsetMoveActivity;
import com.tuacy.viewmovedemo.params.ParamsMoveActivity;
import com.tuacy.viewmovedemo.scroll.ScrollMoveActivity;
import com.tuacy.viewmovedemo.scroller.ScrollerMoveActivity;
import com.tuacy.viewmovedemo.translation.TranslationMoveActivity;


public class MainActivity extends AppCompatActivity {

	private Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
		initView();
		initEvent();
		initData();
	}

	private void initView() {

	}

	private void initEvent() {
		findViewById(R.id.button_layout).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				LayoutMoveActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_offset).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				OffsetMoveActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_translation).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				TranslationMoveActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_params).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ParamsMoveActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_scroll).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ScrollMoveActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_scroller).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ScrollerMoveActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_helper).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DragHelperMoveActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_animation).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				AnimationMoveActivity.startUp(mContext);
			}
		});
	}

	private void initData() {

	}
}
