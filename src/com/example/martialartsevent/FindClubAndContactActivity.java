package com.example.martialartsevent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class FindClubAndContactActivity extends FragmentActivity implements
		OnClickListener {

	private GoogleMap map;
	private final LatLng LOCATION_KARATE_CLUB = new LatLng(53.545277, -2.290295);
	private Button homeButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_find_club_and_contact);

		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
				.getMap();
		map.addMarker(new MarkerOptions().position(LOCATION_KARATE_CLUB).title(
				"Find Us Here"));
		map.setMyLocationEnabled(true);
		
		CameraUpdate centre = CameraUpdateFactory.newLatLng(new LatLng(53.545277, -2.290295));
		CameraUpdate zoom =CameraUpdateFactory.zoomTo(15);
		map.moveCamera(centre);
		map.animateCamera(zoom);
		homeButton = (Button) findViewById(R.id.homeButton);
		homeButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.find_club_and_contact, menu);
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
		if (v.getId() == R.id.homeButton) {
			Intent i = new Intent(this, MainActivity.class);
			startActivity(i);
		}
	}
}
