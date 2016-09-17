package com.example.martialartsevent;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	private ImageButton aboutKarate;
	private ImageButton aboutClub;
	private ImageButton event;
	private ImageButton website;
	private ImageButton findUsContactUs;
	private ImageButton karateExamples;
	private Intent i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		aboutKarate =  (ImageButton) findViewById(R.id.aboutKarateButton);
		aboutClub =  (ImageButton) findViewById(R.id.aboutClubButton);
		event =  (ImageButton) findViewById(R.id.eventButton);
		website = (ImageButton) findViewById(R.id.websiteButton);
		findUsContactUs =  (ImageButton) findViewById(R.id.findAndContactButton);
		karateExamples =  (ImageButton) findViewById(R.id.karateExampleButton);

		aboutKarate.setOnClickListener(this);
		aboutClub.setOnClickListener(this);
		event.setOnClickListener(this);
		website.setOnClickListener(this);
		findUsContactUs.setOnClickListener(this);
		karateExamples.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
		
		case R.id.aboutKarateButton:
			i = new Intent(this,AboutKarateActivity.class);
			startActivity(i);
			break;
		case R.id.aboutClubButton:
			i = new Intent(this,AboutClubActivity.class);
			startActivity(i);
			break;
		case R.id.eventButton:
			i = new Intent(this,EventActivity.class);
			startActivity(i);
			break;
		case R.id.websiteButton:
			String url = "http://www.kenshudokarate.co.uk";
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(url));
			startActivity(i);
			break;
		case R.id.findAndContactButton:
			i = new Intent(this,FindClubAndContactActivity.class);
			startActivity(i);
			break;
		case R.id.karateExampleButton:
			i = new Intent(this,KarateExamplesActivity.class);
			startActivity(i);
		}
		
	}

}
