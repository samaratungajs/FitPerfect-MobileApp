package com.example.myshoppingapp;

import android.app.Activity;
import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;


public class AdminMenClothingUnitTest {

    @Rule
    public ActivityTestRule<AdminMenClothing> menclothingActivityTestRule = new ActivityTestRule<AdminMenClothing>(AdminMenClothing.class);
    private AdminMenClothing menclothingActivity =null;

    @Before
    public void setUp() throws Exception {
        menclothingActivity=menclothingActivityTestRule.getActivity();



    }


    @Test
    public void testLaunch(){
        View view=menclothingActivity.findViewById(R.id.slogan_category);

        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {

        menclothingActivity=null;

    }
}