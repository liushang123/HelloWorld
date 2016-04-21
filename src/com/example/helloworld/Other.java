package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Other extends Activity {
	
	private TextView myTextView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);
		Intent intent = getIntent();
		String value  = intent.getStringExtra("textIntent");
		myTextView = (TextView)findViewById(R.id.myTextView);
		myTextView.setText(value);
	}
	
}
