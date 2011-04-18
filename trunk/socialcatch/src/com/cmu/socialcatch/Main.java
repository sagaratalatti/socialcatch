package com.cmu.socialcatch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.facebook.socialcatch.*;
import com.phonegap.*;

public class Main extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
    
    
}