package com.pri.facebook2;

import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.MediaStore.Images.Media;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePage extends Activity implements OnClickListener {
	TextView displaynametextView;
	Button displaypicbutton;
	ImageView capturedpic;
	TextView nametextView, agetextView, citytextView;
	String enteredusername;
	public static final int CAMERA_CODE = 1313;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		
		displaynametextView = (TextView) findViewById(R.id.textViewdisplayname);
		displaypicbutton = (Button) findViewById(R.id.buttondisplaypic);
		capturedpic = (ImageView) findViewById(R.id.imageViewcapturedpic);
		nametextView = (TextView) findViewById(R.id.textViewname);
		agetextView = (TextView) findViewById(R.id.textViewage);
		citytextView = (TextView) findViewById(R.id.textViewcity);
		
		
		nametextView.setText("Name : Priyankaa");
		agetextView.setText("Age : 23");
		citytextView.setText("City : Bangalore");
		
		displaypicbutton.setOnClickListener(this);
		
		Intent i3 = getIntent();
		Bundle b1 = i3.getExtras();
	
		enteredusername = b1.getString("username1").toString();
		
		displaynametextView.setText(enteredusername);
		
	}

	@Override
	public void onClick(View v)
	{
		Intent i2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		startActivityForResult(i2, CAMERA_CODE);
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
		if(requestCode == CAMERA_CODE)
		{
			if(resultCode == RESULT_OK)
			{
				Bitmap bmap = (Bitmap) data.getExtras().get("data");
				capturedpic.setImageBitmap(bmap);
				
			}
		}
	}
	
}
