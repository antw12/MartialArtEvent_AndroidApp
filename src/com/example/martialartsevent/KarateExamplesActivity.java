package com.example.martialartsevent;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.VideoView;

public class KarateExamplesActivity extends ActionBarActivity implements OnClickListener{

	private Button homeButton;
	private Button playPause1;
	private Button playPause2;
	private Uri uri1;
	private Uri uri2;
	private VideoView videoview;
	private VideoView videoview2;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_karate_examples);

		videoview = (VideoView) findViewById(R.id.videoView1);

		uri1 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.karate);

		videoview.setVideoURI(uri1);
		videoview.start();

		videoview2 = (VideoView) findViewById(R.id.videoView2);

		uri2 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.ksdkarate);

		videoview2.setVideoURI(uri2);
		videoview2.start();

		playPause1 = (Button) findViewById(R.id.playpause1);
		playPause1.setOnClickListener(this);

		playPause2 = (Button) findViewById(R.id.playpause2);
		playPause2.setOnClickListener(this);

		homeButton = (Button) findViewById(R.id.homeButton);
		homeButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.karate_examples, menu);
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

		switch (v.getId()) {

		case R.id.homeButton:
			Intent i = new Intent(this,MainActivity.class);
			startActivity(i);
			break;
		case R.id.playpause1:
			if(videoview.isPlaying()){
			    videoview.pause();
			} else {
			    videoview.start();
			}
			break;
		case R.id.playpause2:
			if(videoview2.isPlaying()){
			    videoview2.pause();
			} else {
			    videoview2.start();
			}
			break;
			
			}
		}
	}
