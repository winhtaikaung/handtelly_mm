package com.example.handtelly_mm;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class aboutview extends Activity {
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutactivity);
	}
	
	private void setContent(){
		tv=(TextView) findViewById(R.id.aboutcontent);
		tv.setText("မိုဘိုင္းဖုန္းၿဖင့္ပုတီးစိတ္ရန္");
		
	}
}
