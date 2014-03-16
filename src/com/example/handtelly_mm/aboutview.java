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
		setContent();
	}
	
	private void setContent(){
		tv=(TextView) findViewById(R.id.aboutcontent);
		tv.setText("က်ြန္ေတာ္ဒီေဆာ့ဝဲလ္ေလးကို  က်ြန္ေတာ္ရံုးသြားရင္းဘတ္စ္ကားေပၚမွာေတြ ့ေတြ့ေနတဲ့ဦးဦး ေဒၚေဒၚတို့ ေတြေတာ္ေတာ္မ်ားမ်ား digital စိပ္ပုတီးေလးေတြနဲ့ပုတီးစိတ္ေနၾကတာကိုေတြ့ရေတာ့က်ေနာ္စိတ္ကူးရမိတယ္။အဲဒီဦးေလးတို့ေဒၚၾကီးတို့ရဲ့လက္ထဲမွာလည္း ဖုန္းကတဖက္နဲ့ဆိုေတာ့က်ြန္ေတာ္\nသူတို့ကိုဖုန္းနဲ့ပဲပုတီးစိတ္လို့ရေအာင္ကူညီလိုက္ရင္ေကာင္းမလားလို့ေတြးမိရင္းက်ြန္ေတာ္ေရးၿဖစ္တာပါ။အစတုန္းကေတာ့အၾကိမ္ေရရာဂဏန္းထိပဲေရးထားတာပါ က်ြန္ေတာ့အေမကေထာင္ဂဏန္းထိစိပ္ခ်င္ရင္ဘယ္လိုလုပ္မလဲဆိုတာနဲ့က်ြန္ေတာ္ ေထာင္ဂဏန္းထိစိတ္လို့ရေအာင္ၿပင္ေပးထားပါတယ္ \n\nအားလံုးကိုအေထာက္အကူၿပဳမယ္ဆိုရင္\nက်ေနာ္ေရးရက်ိဴးနပ္ပါတယ္။");
		
	}
}
