package com.droid.bootcamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void add(View view){
        int firstOperand = integerFromEditText(R.id.first_operand);
        int secondOperand = integerFromEditText(R.id.second_operand);
        TextView result = (TextView) findViewById(R.id.result);
        String resultValue = String.valueOf(firstOperand + secondOperand);
        result.setText(resultValue);
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("com.droid.bootcamp.result",resultValue);
        startActivityForResult(intent,999);
    }

    private int integerFromEditText(int operand) {
        EditText view = (EditText) findViewById(operand);
        int firstValue = Integer.parseInt(view.getText().toString());
        return firstValue;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            String value = data.getStringExtra("com.droid.bootcamp.result");
            TextView result = (TextView) findViewById(R.id.result);
            result.setText(value);
        }
    }
}
