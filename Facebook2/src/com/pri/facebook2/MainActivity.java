package com.pri.facebook2;

import java.io.ObjectOutputStream.PutField;
import java.security.PublicKey;
import java.util.Set;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	TextView fbtextview;
	Button signinbutton, signupbutton;
	EditText entereduname, enteredpwd;
	
	String saveduname = "root";
	String savedpwd = "admin";
	
	String entuname, entpwd;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        fbtextview = (TextView) findViewById(R.id.textViewfb);
        
        signinbutton = (Button) findViewById(R.id.buttonsignin);
        signupbutton = (Button) findViewById(R.id.buttonsignup);
        
        signinbutton.setOnClickListener(this);
        signupbutton.setOnClickListener(this);
      
        entuname = entereduname.getText().toString();
		entpwd = enteredpwd.getText().toString();

    }
    
    public void onClick(View v)
    {
    	switch(v.getId())
    	{
    	
    	case R.id.buttonsignin: 
    		
    		if(entuname.equalsIgnoreCase(saveduname) && entpwd.equalsIgnoreCase(savedpwd))
    		{
    			Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
    			Intent i1 = new Intent(MainActivity.this,HomePage.class);
    			i1.putExtra("username1",entuname);
    			startActivity(i1);
    		}
    		break;
    		
    		default: break;
    	}
		
	}


}