package com.example.kasaa;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class five extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.five);
		TextView tv, h1, h2, h3, h4, h5, c1, c2, c3, c4, c5;
		tv = (TextView) findViewById(R.id.textView1);
		h1 = (TextView) findViewById(R.id.h1);
		h2 = (TextView) findViewById(R.id.h2);
		h3 = (TextView) findViewById(R.id.h3);
		h4 = (TextView) findViewById(R.id.h4);
		h5 = (TextView) findViewById(R.id.h5);
		c1 = (TextView) findViewById(R.id.c1);
		c2 = (TextView) findViewById(R.id.c2);
		c3 = (TextView) findViewById(R.id.c3);
		c4 = (TextView) findViewById(R.id.c4);
		c5 = (TextView) findViewById(R.id.c5);

		h1.setText("1.Pile Locator\n");
		c1.setText("The main idea behind this section is to help BBMP be aware of any local pile-up.\nThis tool helps you inform BBMP about any garbage near your locality.\n User has to walk towards the garbage (switch on Internet, switch off GPS) and use this tool.\n The tool automatically extracts the current location, and gives the user an option to send it as an SMS.\n Your location will be displayed,which can be sent as an SMS by the click of a button to BBMP.\n\n");
		h2.setText("2.Educator\n");
		c2.setText("This section tells you all you want to know about the different kinds of waste and methods to dispose them.\n	Awareness is the first step towards change.\n");
		h3.setText("3.Video Library\n");
		c3.setText("This section links you to videos of fellow citizens of Bangalore  and their experiences with waste management.\n");
		h4.setText("4.Contact\n	");
		c4.setText("This section consists of all the information you need of the required authorities-BBMP officials and NGO's.\n\n\n");
		h5.setText("Developers:\n");
		c5.setText("Suhas.V\nTushar K Naik\nVamanan T S\nRNS Institute of Technology,Bangalore");
	}

}
