package com.example.martialartsevent;

import gif.decoder.GifRun;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class EventActivity extends Activity implements OnClickListener{

	private Button homeButton;
	private ImageButton website;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event);
		SurfaceView v = (SurfaceView) findViewById(R.id.surfaceView1);
		
		GifRun w = new GifRun();
		w.LoadGiff(v,this,R.drawable.appgif);
		
		homeButton = (Button) findViewById(R.id.homeButton);
		homeButton.setOnClickListener(this);
		
		website = (ImageButton) findViewById(R.id.websitelink);
		website.setOnClickListener(this);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event, menu);
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
		switch (v.getId()){
		case R.id.homeButton:
			Intent i = new Intent(this,MainActivity.class);
			startActivity(i);
			break;
		case R.id.websitelink:
			String url = "http://www.kenshudokarate.co.uk";
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setData(Uri.parse(url));
			startActivity(intent);
			break;
		}	
	}
}
