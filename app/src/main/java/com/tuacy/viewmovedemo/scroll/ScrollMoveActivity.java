package com.tuacy.viewmovedemo.scroll;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tuacy.viewmovedemo.R;


public class ScrollMoveActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, ScrollMoveActivity.class));
	}

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scroll_move);
	}
}
