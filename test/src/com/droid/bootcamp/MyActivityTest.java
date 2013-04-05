package com.droid.bootcamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {

    @Test
    public void shouldHaveCorrectAppName() {
        String appName = new MyActivity().getResources().getString(R.string.app_name);
        assertThat(appName, equalTo("bootcamp"));

    }
}
