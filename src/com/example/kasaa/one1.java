package com.example.kasaa;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import org.apache.http.impl.cookie.BestMatchSpecFactory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class one1 extends Activity {
	String s2;
	String s3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.one);
		TextView tv1, tv2;
		tv1 = (TextView) findViewById(R.id.tv11);
		tv2 = (TextView) findViewById(R.id.tv12);
		Button b1 = (Button) findViewById(R.id.button1);
		b1.setVisibility(View.GONE);
		LocationManager l;

		String s = Context.LOCATION_SERVICE;
		l = (LocationManager) getSystemService(s);
		
		/* String provider = LocationManager.NETWORK_PROVIDER;
		 Log.d("ts","pvider="+provider);
		 Location l1=l.getLastKnownLocation(provider);
		 updateWithNewLocation(l1);
		 Log.d("ts","location="+l1.toString());
		 */

		// today
		Criteria c = new Criteria();
		c.setAccuracy(Criteria.ACCURACY_FINE);
		c.setPowerRequirement(Criteria.POWER_LOW);
		c.setAltitudeRequired(false);
		c.setBearingRequired(false);
		c.setSpeedRequired(false);
		c.setCostAllowed(true);

		
		Log.d("tag", "Criteria done");
		List<String> providers = l.getProviders(true);
		Log.d("tttttttt", "list= " + providers);
		String p = l.getBestProvider(c, true);

		Log.d("tag", "got best provider" + p);
		Location l2 = null;
		if (p == null) {
			tv2.setText("No location providers currently available. Check your Network and try again.");

		} else {
			l2 = l.getLastKnownLocation(p);
			updateWithNewLocation(l2);
			Log.d("tag", "update new location done");
			final LocationListener locationListener = new LocationListener() {

				@Override
				public void onLocationChanged(Location location) {
					// TODO Auto-generated method stub
					updateWithNewLocation(location);

				}

				@Override
				public void onProviderDisabled(String arg0) {
				}

				@Override
				public void onProviderEnabled(String arg0) {
				}

				@Override
				public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
				}

			};
			l.requestLocationUpdates(p, 2000, 10, locationListener);
		}
	}

	private void updateWithNewLocation(Location l1) {
		// TODO Auto-generated method stub
		TextView tv1, tv2;
		tv1 = (TextView) findViewById(R.id.tv11);
		tv2 = (TextView) findViewById(R.id.tv12);
		Button btn;
		btn = (Button) findViewById(R.id.button1);
		btn.setVisibility(View.GONE);
		String s1 = "No location found";
		s2 = "Fetching address...please wait";

		Log.d("tag", "In update, fetching");

		if (l1 != null) {
			double lat = l1.getLatitude();
			Log.d("tag", "get latitude works" + lat);

			double lng = l1.getLongitude();
			Log.d("tag", "get lpong works" + lng);

			s1 = "Latitude:" + lat + "\nLongitude:" + lng + "\n\nAddress:";
			Geocoder gc = new Geocoder(this, Locale.getDefault());
			try {
				List<Address> addresses = gc.getFromLocation(lat, lng, 1);
				Log.d("tag", "gc get loc works");

				StringBuilder sb = new StringBuilder();
				if (addresses.size() > 0) {
					Address address = addresses.get(0);

					for (int i = 0; i < address.getMaxAddressLineIndex(); i++) {
						sb.append(address.getAddressLine(i)).append("\n");
					}
					sb.append(address.getLocality()).append("\n");
					sb.append(address.getPostalCode()).append("\n");
					sb.append(address.getCountryCode()).append("\n");

				}
				s2 = sb.toString();
				Log.d("tag", "s2 address" + s2);

			} catch (IOException e) {

			}
		}

		tv1.setText("Your current position is:\n" + s1);
		tv2.setText(s2);
		btn.setVisibility(View.VISIBLE);
		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent sms = new Intent(Intent.ACTION_SENDTO, Uri
						.parse("sms:9449716665"));
				sms.putExtra("sms_body", "Garbage Pile-up at:\n\n" + s2);

				startActivity(sms);

				/*
				 * SmsManager sms1=SmsManager.getDefault(); String
				 * sendto="+919449716665"; sms1.sendTextMessage(sendto, null,
				 * s2, null, null);
				 */
			}
		});

	}
}