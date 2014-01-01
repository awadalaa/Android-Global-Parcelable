package com.example.exampleglobalparcelable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class NextActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
		TextView mTitleView = (TextView) findViewById(R.id.firstName);
        
        Bundle b = getIntent().getExtras();
        ObjectA_User objA = b.getParcelable("com.example.exampleglobalparcelable.ObjectA");
        
        mTitleView.setText(objA.getFirstName() + "'s Todo List");
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    

}
