package com.pri.intents;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Second extends Activity {
	
	TextView displaymsgtextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		displaymsgtextView = (TextView) findViewById(R.id.textViewdisplaymsg);
		
		Intent i2 = getIntent();
		Bundle b1 = i2.getExtras();
		String recmsg = b1.getString("key1").toString();
		
		displaymsgtextView.setText(recmsg);
	}
	

}

