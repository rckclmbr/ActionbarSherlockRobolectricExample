package com.plannedproject.absrobolectric;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;


@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void shouldHaveHappySmiles() throws Exception {
        MainActivity activity = Robolectric.buildActivity(MainActivity.class).get();
        String appName = activity.getResources().getString(R.string.app_name);
        Assert.assertEquals("ActionbarSherlockRobolectricExample", appName);
    }
}
