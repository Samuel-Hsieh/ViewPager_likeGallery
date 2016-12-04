package com.example.taaze.viewpager_test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import deerlight.com.viewpagerlikegallerylibrary.Layouts;
import deerlight.com.viewpagerlikegallerylibrary.MyPageAdapter;
import deerlight.com.viewpagerlikegallerylibrary.MyPageTransformer;

public class MainActivity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		/** Sample*/
		ViewPager mViewPager = (ViewPager)findViewById(R.id.mViewPager);
		LayoutInflater inflater = getLayoutInflater().from(this);
		int[] mlayoutsArray = new int[]{R.layout.layout_test1, R.layout.layout_test2
				, R.layout.layout_test3, R.layout.layout_test4, R.layout.layout_test5
				, R.layout.layout_test6};
		int mCenterInLayouts = mlayoutsArray.length/2;
		/** 使用自製library*/
		Layouts mLayouts = new Layouts(inflater,mlayoutsArray);
		mViewPager.setAdapter(new MyPageAdapter(mLayouts.LayoutList()));
		mViewPager.setCurrentItem(mCenterInLayouts);
		mViewPager.setPageTransformer(true, new MyPageTransformer());
		mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

			}

			@Override
			public void onPageSelected(int position) {

			}

			@Override
			public void onPageScrollStateChanged(int state) {
				switch (state){

				}
			}
		});

		FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
						.setAction("Action", null).show();
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
