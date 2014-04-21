package com.example.kasaa;

import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class three extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three);
		Button l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
		l1 = (Button) findViewById(R.id.link1);
		l1.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent("android.intent.action.VIEW");
				i.setData(Uri
						.parse("http://www.youtube.com/watch?v=Kx4OYEMjbcM&feature=relmfu"));
				startActivity(i);
			}
		});

		l2 = (Button) findViewById(R.id.link2);
		l2.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent("android.intent.action.VIEW");
				i.setData(Uri
						.parse("http://www.youtube.com/watch?v=EqJSZzvb9VE"));
				startActivity(i);
			}
		});

		l3 = (Button) findViewById(R.id.link3);
		l3.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent("android.intent.action.VIEW");
				i.setData(Uri
						.parse("http://www.youtube.com/watch?v=uQ4f57dwqGM"));
				startActivity(i);
			}
		});

		l4 = (Button) findViewById(R.id.link4);
		l4.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent("android.intent.action.VIEW");
				i.setData(Uri
						.parse("http://www.youtube.com/watch?v=-7IM5sWl9GY"));
				startActivity(i);
			}
		});

		l5 = (Button) findViewById(R.id.link5);
		l5.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent("android.intent.action.VIEW");
				i.setData(Uri
						.parse("http://www.youtube.com/watch?v=-pOorZZubIc"));
				startActivity(i);
			}
		});

		l6 = (Button) findViewById(R.id.link6);
		l6.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent("android.intent.action.VIEW");
				i.setData(Uri
						.parse("http://www.youtube.com/watch?v=m0wcXdbfvs0"));
				startActivity(i);
			}
		});

		l7 = (Button) findViewById(R.id.link7);
		l7.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent("android.intent.action.VIEW");
				i.setData(Uri
						.parse("http://www.youtube.com/watch?v=YMRukWPr0d0"));
				startActivity(i);
			}
		});

		l8 = (Button) findViewById(R.id.link8);
		l8.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent("android.intent.action.VIEW");
				i.setData(Uri
						.parse("http://www.youtube.com/watch?v=yfsmi15cAGo"));
				startActivity(i);
			}
		});

		l9 = (Button) findViewById(R.id.link9);
		l9.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent("android.intent.action.VIEW");
				i.setData(Uri
						.parse("http://www.youtube.com/watch?v=Pl9ahf9qSJQ"));
				startActivity(i);
			}
		});

		l10 = (Button) findViewById(R.id.link10);
		l10.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent("android.intent.action.VIEW");
				i.setData(Uri
						.parse("http://www.youtube.com/watch?v=Oa_i28mkHhs"));
				startActivity(i);
			}
		});

	}

}
