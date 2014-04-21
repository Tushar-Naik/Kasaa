package com.example.kasaa;

import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class four extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.four);

		//
		String n[] = { "1:BBMP", "2:Waste Wise Trust (WWT)", "3:Saahas",
				"4:Ash Recyclers", "5:Samarthanam Parisara" };
		String p[] = {
				"08022221188\nbbmp.gov.in",
				"91 80 2545 9363\nwastewisetrust@gmail.com\nwww.wwt.co.in",
				"+ 91 80 41689889\nhttp://saahas.org/\nresponse@saahas.org",
				"99459 80181\nhttp://www.ashrecyclers.in/\nsyed@ashrecyclers.com",
				"+91 9449864680\nhttp://www.parisara.org/" };
		TextView name1, name2, name3, name4, name5, add1, add2, add3, add4, add5, ph1, ph2, ph3, ph4, ph5, d1, d2, d3, d4, d5;
		name1 = (TextView) findViewById(R.id.name1);
		name2 = (TextView) findViewById(R.id.name2);
		name3 = (TextView) findViewById(R.id.name3);
		name4 = (TextView) findViewById(R.id.name4);
		name5 = (TextView) findViewById(R.id.name5);

		add1 = (TextView) findViewById(R.id.add1);
		add2 = (TextView) findViewById(R.id.add2);
		add3 = (TextView) findViewById(R.id.add3);
		add4 = (TextView) findViewById(R.id.add4);
		add5 = (TextView) findViewById(R.id.add5);

		ph1 = (TextView) findViewById(R.id.ph1);
		ph2 = (TextView) findViewById(R.id.ph2);
		ph3 = (TextView) findViewById(R.id.ph3);
		ph4 = (TextView) findViewById(R.id.ph4);
		ph5 = (TextView) findViewById(R.id.ph5);

		d1 = (TextView) findViewById(R.id.d1);
		d2 = (TextView) findViewById(R.id.d2);
		d3 = (TextView) findViewById(R.id.d3);
		d4 = (TextView) findViewById(R.id.d4);
		d5 = (TextView) findViewById(R.id.d5);

		name1.setText(n[0]);
		add1.setText("BBMP Head office, Corporation circle,\nHudson Circle,Bangalore-560002");
		ph1.setText(p[0]);
		d1.setText("The Bruhat Bengaluru Mahanagara Palike (BBMP) is the administrative body responsible for the civic and infrastructural assets of the Greater Bangalore metropolitan area. The BBMP represents the third level of government, (the Central government and State Government being the first two levels). Bruhat Bengaluru Mahanagara Palike is run by a city council. The city council comprises elected representatives, called \"corporators\", one from each of the wards (localities) of the city. Elections to the council are held once every 5 years, with results being decided by popular vote. Members contesting elections to council represent one of more of the state's political parties. First elections to the newly-created body was held on 28 March 2010, after the delays due to delimitation of wards and finalising voter lists.");

		name2.setText(n[1]);
		add2.setText("Waste Wise Resource Center\nC/O Mythri Sarva Seva Samithi\n51/2, 5th Main, 3rd 'A' Cross,\nOMBR Layout, Lal Bahadur Nagar,\nBengaluru - 560 043,INDIA.");
		ph2.setText(p[1]);
		d2.setText("Waste Wise Trust (WWT) is a non-profit organization (founded in 2003) that provides socially and environmentally responsible solid waste management services to the corporate sector and residential communities in Bangalore. We have more than 20 years of experience working on behalf of informal waste pickers and their families, and promoting environmental sustainability through integral solid waste management. Together with our parent organization Mythri Sarva Sava Samithi, we are part of the network of important national and international organizations in the field, like WASTE (The Netherlands), Fem Italia Onlus and Citynet (Japan). We are also a member of city based group Solid Waste Management Round Table, Bangalore. Waste Wise Trust promotes participation in civic cleanliness, waste segregation, waste minimization and recycling. WWT mainly works towards the development of people involved in waste picking activities.");

		name3.setText(n[2]);
		add3.setText("#431, 8th cross,\nJayanagar I Block,\nBengaloru\n Karnataka 560011 India");
		ph3.setText(p[2]);
		d3.setText("Over the last six years, Saahas has worked closely with several partners including the Karnataka State Pollution Control Board, GTZ and EMPA to study various issues related to generation of e-Waste  as also its flow, recycling and final disposal. In 2006, For this first time in India,  Saahas along with other partners including WeP Peripherals and  E-Parisaraa, an authorised e-Waste recycler,  set up a collection system for frequently generated e-Waste  products like dry cell batteries, CDs and floppies. The material collected is sent to E-Parisaraa wherein plastic and metal components are retrieved for recycling and the  hazardous content is  stored for disposal in the hazardous waste facility which is currently being set up close to Tumkur, near Bangalore. In order for the recycling to be viable, these items have to be collected in large volumes. Thus there is a requirement for a collection system to be established by reaching out to all users of these products. Saahas has around 200 collection receptacles set up in public locations, schools, apartments and corporate offices");

		name4.setText(n[3]);
		add4.setText("Ash Recyclers,\n94, Thimmiah Road,\nBangalore –560051");
		ph4.setText(p[3]);
		d4.setText("ASH RECYCLERS is located in the heart of Indian Information Technology corridor- Bangalore city to serve the needs of the technology industry by providing the most cost and time efficient ways of recycling all forms of electronic waste from devices such as computers, monitors, printers, copiers, circuit boards, servers and most other electronic gadgets.");

		name5.setText(n[4]);
		add5.setText("#1129 19th Main Road\nJ.P. Nagar 2nd Phase\n560078 Bangalore");
		ph5.setText(p[4]);
		d5.setText("Samarthanam Parisara, a waste management programme was initiated in the year 2003 by Samarthanam Trust for the Disabled. It has emerged as a reliable waste management partner for individuals, apartments, educational institutes and corporate houses in Bangalore because of prompt service, the state of the art waste management technologies and transport and handling equipments. Samarthanam Parisara is in agreement with leading recycle companies authorized by Karnataka State Pollution Control Board.");

		/*
		 * PackageManager pm=getPackageManager(); Intent i1=new
		 * Intent(Intent.ACTION_VIEW,Uri.parse("www.google.com")); boolean
		 * b1=i1.resolveActivity(pm)!=null; if(b1) { int
		 * flags=Pattern.CASE_INSENSITIVE; Pattern
		 * pa=Pattern.compile("\\[a-zA-Z0-9]\\",flags); Linkify.addLinks(ph1,
		 * pa, "www.google.com"); }
		 */
	}
}
