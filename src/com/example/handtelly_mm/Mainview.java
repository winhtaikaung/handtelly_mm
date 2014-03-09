package com.example.handtelly_mm;

import android.R.drawable;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;

import android.os.Bundle;


import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;


public class Mainview extends Activity {

	 
	  int u1=0;
	  int u2=0;
	  int u3=0;
	  int u4=0;

	
	/*Declaring Button*/
	
	Button btncount;
	Button btnreset;
	
	/*testing Buttons*/
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button mnuhelp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainview);
			Initialize();
			makecount();
		
		
	}
	
	public void makemyanmartxt(Button btn,int i){
		
		switch(i){
		
			case 0:btn.setText("ဝ");break;
			case 1:btn.setText("၁");break;
			case 2:btn.setText("၂");break;
			case 3:btn.setText("၃");break;
			case 4:btn.setText("၄");break;
			case 5:btn.setText("၅");break;
			case 6:btn.setText("၆");break;
			case 7:btn.setText("၇");break;
			case 8:btn.setText("၈");break;
			case 9:btn.setText("၉");break;
			
			default:btn.setText("ဝ");break;
		}
	}
	
public void make_englishtext(Button btn,int i){
		
		switch(i){
		
			case 0:btn.setText("0");break;
			case 1:btn.setText("1");break;
			case 2:btn.setText("2");break;
			case 3:btn.setText("3");break;
			case 4:btn.setText("4");break;
			case 5:btn.setText("5");break;
			case 6:btn.setText("6");break;
			case 7:btn.setText("7");break;
			case 8:btn.setText("8");break;
			case 9:btn.setText("9");break;
			
			default:btn.setText("0");break;
		}
	}
	/*Making Effect for touch*/
	
	
	
	public void controller(final Button btn){
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String btn_name;
				btn_name=	((Button) arg0).getText().toString();
				if(btn_name.equals(btn.getText().toString())){
					counting_logic();
				}
				
				if(btn_name.equals(btnreset.getText().toString())){
					make_reset();
					
				}
				
				
				
				
				
			}
		});
		
	}
	
	
	
	
	public void Initialize(){
		btn1=(Button) findViewById(R.id.btn1);
		btn2=(Button) findViewById(R.id.btn2);
		btn3=(Button) findViewById(R.id.btn3);
		btn4=(Button) findViewById(R.id.btn4);
		btncount=(Button) findViewById(R.id.btncount);
		btnreset=(Button) findViewById(R.id.btnreset);
		mnuhelp=(Button) findViewById(R.id.help);
		
	}
	
	public void makecount(){
		
		
		
		controller(btncount);
		controller(btnreset);
		
		
	}
	
	
	
	private void make_reset(){
		u1=0;
		u2=0;
		u3=0;
		u4=0;
		
		btn1.setText("ဝ");
		btn2.setText("ဝ");
		btn3.setText("ဝ");
		btn4.setText("ဝ");
	}
	
	private void counting_logic(){
		
		u1=u1+1;
		//check the 
		if(u1<=9){
	//			Toast.makeText(getApplicationContext(),"U1="+u1+"",Toast.LENGTH_SHORT).show();
			
			//btn1.setText(""+u1+"");
			makemyanmartxt(btn1, u1);
		}
		else if(u1>9)				
		{
				u2=u2+1;
				
				
				
				u1=0;
				//btn1.setText(""+u1+"");
				makemyanmartxt(btn1, u1);
						if(u2<=9){
							
							//btn2.setText(""+u2+"");
							makemyanmartxt(btn2, u2);
							
						}
						else if(u2>9)
						{//increament here
							u3=u3+1;							
							u2=0;
							//btn2.setText(""+u2+"");
							makemyanmartxt(btn2, u2);
							
								if(u3<=9){
									
									//btn3.setText(""+u3+"");
									makemyanmartxt(btn3, u3);
								}else if(u3>9){
									u4=u4+1;
									
									u3=0;
									makemyanmartxt(btn3, u3);
										if(u4<=9){
											makemyanmartxt(btn4, u4);
											
										}else if(u4>9){
											u4=0;
											makemyanmartxt(btn4, u4);
										}
									
								}
						}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mainview, menu);
		
		return true;
	}
	
	public void launchActivity(Class<?> cls){
		Intent intent=new Intent(getApplicationContext(), cls);
		startActivity(intent);
		
	}
	
	
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId())
		{
		case R.id.help:
				launchActivity(helpview.class);return true;
		case R.id.about:
			launchActivity(aboutview.class);return true;
		case R.id.contact:
			launchActivity(contactview.class);return true;
		default:
			return true;
		}
		
		
	}

}
