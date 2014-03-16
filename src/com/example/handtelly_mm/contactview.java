package com.example.handtelly_mm;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class contactview extends Activity {
		TextView txtme;
	@Override
	protected void onCreate(Bundle SavedInstanceState ){
		
		super.onCreate(SavedInstanceState);
		setContentView(R.layout.contact_layout);
		makeupview();
	}
	
	private void makeupview(){
		txtme=(TextView) findViewById(R.id.txtabtme);
		txtme.setText("အမည္  ၀င္းထိုက္ေအာင္\n\nဆက္သြယ္ရန္  09-43052276\n\nအီးေမးလ္  winhtaikaung28@hotmail.com" );
		
		
	}
}
