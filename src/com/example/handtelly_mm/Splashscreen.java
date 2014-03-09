package com.example.handtelly_mm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Splashscreen extends Activity {
	final Context context=this;
    TextView programname;
	private static int SPLASH_TIME_OUT=5000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				Intent i=new Intent(Splashscreen.this,Mainview.class);
				startActivity(i);
				
				finish();
			}
		}, SPLASH_TIME_OUT);
		
		
	}
	
	
	
	
	
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
	}
}
