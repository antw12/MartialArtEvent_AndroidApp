package com.example.martialartsevent;

import com.example.martialartsevent.R.drawable;
import com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails;

import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class AboutKarateActivity extends Activity implements OnClickListener{

	private Button homeButton;
	private RelativeLayout layout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_karate);
		
		homeButton = (Button) findViewById(R.id.homeButton);
		homeButton.setOnClickListener(this);
		
		layout = (RelativeLayout) findViewById(R.id.layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about_karate, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.homeButton){
			Intent i = new Intent(this,MainActivity.class);
			startActivity(i);
		}
	}
	
	public void eventToClick(View view){ 
		switch (view.getId()) {
			case R.id.blue:
				layout.setBackgroundColor(Color.BLUE);
				break;	
			case R.id.red:
				layout.setBackgroundColor(Color.RED);
				break;	
			case R.id.white:
				layout.setBackgroundColor(Color.WHITE);
				break;
		}
	}
}
