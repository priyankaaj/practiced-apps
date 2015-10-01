package com.pri.TestingAndroid;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class WhatsUp extends Activity implements OnClickListener 
{
	String stusername = "user1";
	String stpassword = "1234";

	String entusername, entpassword;

	Button loginbutton, cancelbutton;
	CheckBox checkboxrmbrpwd;
	EditText usernameedittext, passwordedittext;



	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_whats_up);

		//getting reference for views from R.java

		loginbutton = (Button) findViewById(R.id.loginbutton);
		cancelbutton = (Button) findViewById(R.id.cancelbutton);
		usernameedittext = (EditText) findViewById(R.id.edittextusername);
		passwordedittext = (EditText) findViewById(R.id.edittextpassword);
		checkboxrmbrpwd = (CheckBox) findViewById(R.id.rmbrpwdcheckbox);
		
		loginbutton.setOnClickListener(this);
		cancelbutton.setOnClickListener(this);
	}
	public void onClick(View v)
	{
		switch (v.getId())
		{
		case R.id.loginbutton:
			entusername = usernameedittext.getText().toString();
			entpassword = passwordedittext.getText().toString();
			
			if(stusername.equalsIgnoreCase(entusername) && stpassword.equalsIgnoreCase(entpassword))
			{
				Log.d("[DEBUG]", "login successful");
			}
			else
			{
				Log.d("[DEBUG]", "invalid username or password");
			}
			
			break;
		case R.id.cancelbutton:
			usernameedittext.setText("");
			passwordedittext.setText("");
			break;
			
		default: 
			break;
		}
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.whats_up, menu);
		return true;
	}

	public void testusername (View v) 
	{
		entusername = usernameedittext.getText().toString();
		entusername = passwordedittext.getText().toString();

		if(stusername.equalsIgnoreCase(entusername) && stpassword.equalsIgnoreCase(entpassword))
		{
			Log.d("[DEBUG]", "login successful");
		}
		else
		{
			Log.d("[DEBUG]", "invalid username or password");
		}
	}
	checkboxrmbrpwd.setOnClickListener(new onClickListener()) 
	{
		public void onClick(View v)
		{
			
		}
	}
	
}