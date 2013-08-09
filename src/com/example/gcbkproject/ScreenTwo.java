package com.example.gcbkproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ScreenTwo extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.screen_two_layout);
	
	
	Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
	ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.income_array, android.R.layout.simple_spinner_item);
	adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinner1.setAdapter(adapter1);
	
	
	Button incomeButton = (Button) findViewById(R.id.income_button);
	incomeButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v){
				//TODO LOGIC
				startActivity(new Intent(getApplicationContext(), ScreenThree.class));
				finish();
			}
		});
}
}
