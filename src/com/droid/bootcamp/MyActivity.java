package com.droid.bootcamp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void add(View view){
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("25");
    }
}
