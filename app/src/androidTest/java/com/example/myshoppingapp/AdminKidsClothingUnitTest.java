package com.example.myshoppingapp;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminKidsClothingUnitTest {
    @Rule
    public ActivityTestRule<AdminKidsClothing> kidsclothingActivityTestRule = new ActivityTestRule<AdminKidsClothing>(AdminKidsClothing.class);
    private AdminKidsClothing kidsclothingActivity =null;

    @Before
    public void setUp() throws Exception {
        kidsclothingActivity=kidsclothingActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch(){
        View view=kidsclothingActivity.findViewById(R.id.kslogan_category);

        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {
        kidsclothingActivity=null;

    }
}