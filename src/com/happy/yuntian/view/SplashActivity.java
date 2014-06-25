package com.happy.yuntian.view;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.happy.yuntian.R;
import com.happy.yuntian.utils.shimmer.Shimmer;
import com.happy.yuntian.utils.shimmer.ShimmerTextView;

public class SplashActivity extends Activity {

	private ShimmerTextView tv;
	private Shimmer shimmer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		tv = (ShimmerTextView) findViewById(R.id.shimmer_tv);
		shimmer = new Shimmer();
		shimmer.setRepeatCount(0);
		shimmer.setDuration(1200);
		shimmer.setStartDelay(300);
		shimmer.setDirection(0);
        shimmer.start(tv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
