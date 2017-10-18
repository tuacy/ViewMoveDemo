package com.tuacy.viewmovedemo.draghelper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tuacy.viewmovedemo.R;


public class DragHelperMoveActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, DragHelperMoveActivity.class));
	}

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_draghelper_move);
	}
}
