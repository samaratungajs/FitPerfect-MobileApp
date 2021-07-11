package com.example.myshoppingapp.seller;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import com.example.myshoppingapp.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class SellerRegistrationActivityUnitTest {

    @Rule
    public ActivityTestRule<SellerRegistrationActivity> sellerRegActivityTestRule = new ActivityTestRule<SellerRegistrationActivity>(SellerRegistrationActivity.class);
    private SellerRegistrationActivity sellerRegActivity =null;

    @Before
    public void setUp() throws Exception {

        sellerRegActivity=sellerRegActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch(){
        View view=sellerRegActivity.findViewById(R.id.title_seller);

        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {
        sellerRegActivity=null;

    }
}