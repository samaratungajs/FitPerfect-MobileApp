package com.example.myshoppingapp;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminWClothingUnitTest {

    @Rule
    public ActivityTestRule<AdminWClothing> clothingActivityTestRule = new ActivityTestRule<AdminWClothing>(AdminWClothing.class);
    private AdminWClothing clothingActivity =null;

    @Before
    public void setUp() throws Exception {
        clothingActivity=clothingActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch(){
        View view=clothingActivity.findViewById(R.id.slogan_category);

        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {
        clothingActivity=null;

    }
}