package com.example.helloworld;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button myButton = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myButton = (Button)findViewById(R.id.myButton);
		myButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.putExtra("textIntent", "123455");
				intent.setClass(MainActivity.this, Other.class);
				MainActivity.this.startActivity(intent);
				
				/*Uri uri = Uri.parse("smsto://08000000123");
				Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
				intent.putExtra("sms_body", "The SMS text");
				startActivity(intent);*/
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
