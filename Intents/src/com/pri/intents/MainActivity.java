package com.pri.intents;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText msgeditText;
	Button nextpagebutton;
	String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        msgeditText =(EditText) findViewById(R.id.editTextmsg);
        nextpagebutton = (Button) findViewById(R.id.buttonnextpage);
        
         
        
        nextpagebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				msg = msgeditText.getText().toString();
				Intent i1 = new Intent(MainActivity.this,Second.class);
				i1.putExtra("key1", msg);
				startActivity(i1);
				
			}
		});
    }


}
