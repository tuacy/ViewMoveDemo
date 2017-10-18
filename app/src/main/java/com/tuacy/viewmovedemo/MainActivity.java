package com.tuacy.viewmovedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.tuacy.viewmovedemo.widget.TestLayout;
import com.tuacy.viewmovedemo.widget.TestView;

public class MainActivity extends AppCompatActivity {

	private TestLayout mTestView;
	private Button     mButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initEvent();
		initData();
	}

	private void initView() {
		mTestView = (TestLayout) findViewById(R.id.test_view);
		mButton = (Button) findViewById(R.id.click_view);
	}

	private void initEvent() {
		mTestView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.d("tuacy", "text view on click");
			}
		});
		mButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mTestView.setX(mTestView.getX() + 10);
			}
		});
	}

	private void initData() {

	}
}
