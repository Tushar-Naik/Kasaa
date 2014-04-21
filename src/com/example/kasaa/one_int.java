package com.example.kasaa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class one_int extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.one_int);
		TextView t;
		t = (TextView) findViewById(R.id.textView1);
		String s = "Instructions:\n\n Make sure that your internet connections are on, and that your GPS is off.\n\nWalk to the location of the garbage pile-up and press GET ADDRESS";
		t.setText(s);
		Button b2 = (Button) findViewById(R.id.ok);
		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				startActivity(new Intent(one_int.this, one.class));

			}
		});

	}

}
