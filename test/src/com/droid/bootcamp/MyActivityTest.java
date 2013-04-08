package com.droid.bootcamp;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {
    private EditText firstOperand;
    private Button addButton;
    private TextView result;
    private EditText secondOperand;

    @Before
    public void setUp(){
        MyActivity myActivity = new MyActivity();
        myActivity.onCreate(null);
        firstOperand = (EditText) myActivity.findViewById(R.id.first_operand);
        secondOperand = (EditText) myActivity.findViewById(R.id.first_operand); //TODO: put second operand in main.xml
        addButton = (Button) myActivity.findViewById(R.id.add_button);
        result = (TextView) myActivity.findViewById(R.id.result);
    }
    @Test
    public void shouldHaveCorrectAppName() {
        String appName = new MyActivity().getResources().getString(R.string.app_name);
        assertThat(appName, equalTo("bootcamp"));
    }
    @Test
    public void shouldHaveFirstOperand() {
        assertThat(firstOperand.getVisibility(),equalTo(View.VISIBLE));
        assertThat(firstOperand.getHint().toString(),equalTo("enter the operand"));
    }
    @Ignore
    @Test
    public void shouldHaveSecondOperand() {
        assertThat(secondOperand.getVisibility(),equalTo(View.VISIBLE));
        assertThat(secondOperand.getHint().toString(),equalTo("enter the operand"));
    }

    @Test
    public void shouldHaveOperationButton() {
        assertThat(addButton.getVisibility(),equalTo(View.VISIBLE));
        assertThat(addButton.getText().toString(),equalTo("+"));
    }
    @Test
    public void shouldHaveResultTextView() {
        assertThat(result.getVisibility(),equalTo(View.VISIBLE));
        assertThat(result.getText().toString(),equalTo(""));
    }
    @Test
    public void shouldShowResultOn() {
        firstOperand.setText("22");
        secondOperand.setText("70");
        addButton.performClick();
        assertThat(result.getVisibility(),equalTo(View.VISIBLE));
        assertThat(result.getText().toString(),equalTo("25"));
    }
}

