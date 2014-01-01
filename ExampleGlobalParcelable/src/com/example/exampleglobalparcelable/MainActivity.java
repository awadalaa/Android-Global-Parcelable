package com.example.exampleglobalparcelable;


import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
		// Values for User class
		private ObjectA_User user;
		private String mUsername;
		private String mFirstName;
		private Date mCreatedOn;

		// UI references.
		private EditText mUsernameView;
		private EditText mFirstNameView;
		
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		mUsernameView = (EditText) findViewById(R.id.username);
		mFirstNameView = (EditText) findViewById(R.id.firstName);
		Button nextBtn = (Button) findViewById(R.id.btn_next);
		nextBtn.setOnClickListener(new OnClickListener() {
	         @Override
	         public void onClick(View v) {
	             goToNextPage();
	         }
		});
    }

    private void goToNextPage() {
        Log.i("clicks","You Clicked Next Button on ManActivity");
		
        mUsername =  mUsernameView.getText().toString();
		if (mUsername == "") mUsername = "anyonymous";
		
		mFirstName =  mFirstNameView.getText().toString();
		if (mFirstName == "") mFirstName = "anyonymous";
		
		mCreatedOn = new Date();
		
		user = new ObjectA_User(mUsername,mFirstName,mCreatedOn);
		
		// pass user to NextActivity through Intent
		Intent intent = new Intent(getBaseContext(), NextActivity.class);
		intent.putExtra("com.example.exampleglobalparcelable.ObjectA", user);
		startActivity(intent);
	}
  
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
