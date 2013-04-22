package com.droid.bootcamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        TextView resultView = (TextView) findViewById(R.id.result);
        resultView.setText(getIntent().getStringExtra("com.droid.bootcamp.result"));
    }

    public void minusTen(View view){
        int value = Integer.parseInt(getIntent().getStringExtra("com.droid.bootcamp.result"));
        Intent intent = new Intent();
        intent.putExtra("com.droid.bootcamp.result",String.valueOf(value-10));
        setResult(RESULT_OK, intent);
        finish();

    }
}
