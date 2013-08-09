package com.example.gcbkproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeScreen extends Activity {
	//the home screen

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen_four_layout);
		Button transactionButton, settingsButton, forcastButton, graphButton;
		transactionButton = (Button) findViewById(R.id.transaction_button);
		settingsButton = (Button) findViewById(R.id.settings_button);
		forcastButton = (Button) findViewById(R.id.modify_forcast_button);
		graphButton = (Button) findViewById(R.id.graph_button);
		
		//ADD LISTENERS FOR THE BUTTON EVENTS
		graphButton.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplicationContext(), GraphScreen.class));
			}
		});
        transactionButton.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplicationContext(), TransactionScreen.class));
			}
		});
        
        forcastButton.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplicationContext(), ModifyScreen.class));
			}
		});
        
        settingsButton.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplicationContext(), SettingsScreen.class));
			}
		});
		
		
	}
}
