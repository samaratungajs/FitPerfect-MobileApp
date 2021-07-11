package com.example.myshoppingapp;

import android.app.Activity;
import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityUnitTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mnActivity =null;

    @Before
    public void setUp() throws Exception {
        mnActivity=mainActivityTestRule.getActivity();


    }

    @Test
    public void testLaunch(){
        View view=mnActivity.findViewById(R.id.app_slogan);

        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {
        mnActivity=null;

    }
}