package com.example.kasaa;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.widget.Button;
import android.widget.TextView;

public class two extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two);
		TextView a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
		a1 = (TextView) findViewById(R.id.a1);
		a2 = (TextView) findViewById(R.id.a2);
		a3 = (TextView) findViewById(R.id.a3);
		a4 = (TextView) findViewById(R.id.a4);
		a5 = (TextView) findViewById(R.id.a5);
		a6 = (TextView) findViewById(R.id.a6);
		a7 = (TextView) findViewById(R.id.a7);
		a8 = (TextView) findViewById(R.id.a8);
		a9 = (TextView) findViewById(R.id.a9);
		a10 = (TextView) findViewById(R.id.a10);
		a11 = (TextView) findViewById(R.id.a11);
		a12 = (TextView) findViewById(R.id.a12);
		a13 = (TextView) findViewById(R.id.a13);
		a14 = (TextView) findViewById(R.id.a14);
		a15 = (TextView) findViewById(R.id.a15);

		a1.setText("Waste segregation basically means keeping wet and dry wastes separately, so that dry can be recycled and wet waste can be composted\n");
		a2.setText("1. So that it reduces waste that gets landfilled and reduces pollution to air and water\n2. So that different processes- composting, recycling, incineration can be applied to different kinds of waste\n");
		a3.setText("1. Keep separate containers for dry and wet waste in the kitchen \n2. Keep two bags for dry waste collection- paper and plastic , for the rest of the household waste \n3. Keep plastic from the kitchen clean and dry and drop into the dry waste bin. Keep glass* /plastic containers rinsed of food matter \n4. Send wet waste out of the home daily. Store and send dry waste out of the home , once a week.\n5. Keep a paper bag for throwing the sanitary waste\n");
		a4.setText("Paper, plastics, metal, glass, rubber, thermocol, Styrofoam, fabric, leather, rexine, wood – anything that can be kept for an extended period without decomposing\n");
		a5.setText("If they are still in usable condition, they should be given to some organization that collects them. If they are totally unusable, or very damaged, they are still categorized as dry waste. If clothes are soiled with body fluids, they become sanitary waste. If they are soiled with paint, or any chemicals, they are HHW (household hazardous waste).\n");
		a6.setText("Store it in a bag in the utility area after cleaning and drying till it is picked up.\n");
		a7.setText("1. Form a group of like minded people\n2. Explain waste segregation to your family / neighbours in your apartment building.\n3. Get the staff in the apartment building to also understand\n4. Get separate storage drums for storing the dry waste and wet waste.\n. Have the dry waste picked up by the Dry waste collection centre or your local scrap dealer\n");
		a8.setText("E-waste or electronic waste consists of batteries, computer parts, wires, electrical equipment of any kind, electrical and electronic toys, remotes, watches, cellphones, as well as bulbs, tubelights and CFLs.\n");
		a9.setText("Store them in separate container which is kept closed, away from moisture and in which nothing else is put.\n");
		a10.setText("Wet waste consists of kitchen waste - including vegetable and fruit peels and pieces, tea leaves, coffee grounds, eggshells, bones and entrails, fish scales, as well as cooked food (both veg and non-veg).\n");
		a11.setText("If you live in a large apartment building, a community composting system like tank composting or an OWC could be set up for all the wet waste from the residents. If not, the wet waste can be given out every day to the BBMP.\n");
		a12.setText("Before the advent of the bin liner, we would all put our garbage directly in the bin, and wash it everyday. That is what we will have to do now. The bin can be lined with a newspaper liner or a layer of sawdust if you don’t want to put the wet waste directly into it.\n");
		a13.setText("This includes used menstrual cloths, sanitary napkins, disposable diapers, bandages and any material that is contaminated with blood or other body fluids.\n");
		a14.setText("Expired medicines and injections, used syringes come under HHW or household hazardous wastes. They should be stored separate from other categories of waste and given to the BBMP once every quarter. Condoms, soiled cotton, etc come under sanitary waste – they should be wrapped in a newspaper, marked with a red cross, and given everyday to the BBMP.\n");
		a15.setText("HHW or household hazardous wastes include three sub-categories – E-waste; toxic substances such as paints, cleaning agents, solvents, insecticides and their containers, other chemicals; and biomedical wastes like used syringes, expired medicines, thermometers, used cosmetics etc..\n");
	}

}
