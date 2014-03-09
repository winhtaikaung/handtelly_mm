package com.example.handtelly_mm;



import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class helpview extends Activity {
		TextView helpcontent;
		@Override
		protected void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.helpactivity);
			sethelpcontent();
		}
		
	    private void sethelpcontent(){
	    	helpcontent=(TextView) findViewById(R.id.helpcontent);
	    	
	    	helpcontent.setText("ပုတီးစိပ္ရန္ အလည္မွအဝိုင္းေလးကိုႏွိပ္ပါ။\n\nအကယ္၍ အသစ္ၿပန္စလိုပါက \"ၿပန္စရန္\" ခလုပ္ေလးကိုႏွိပ္ ၍ အစမွၿပန္၍ပုတီးစိပ္နိုင္ပါသည္။ ");
	    	
	    }
}
