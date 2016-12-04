package deerlight.com.viewpagerlikegallerylibrary;

import android.os.Build;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

/**
 * Created by taaze on 2016/12/1.
 */
public class MyPageTransformer implements ViewPager.PageTransformer {

	private float MIN_SCALE = 0.75f;

	@Override
	public void transformPage(View page, float position) {
		//解決下一頁不見的問題
		Log.v("position","position: "+position);
		if (position < -1) {
			position = -1;
		} else if (position > 1) {
			position = 1;
		}
		//頁面縮放
		page.setTranslationX(0);
		float scaleFactor = MIN_SCALE + (1 - MIN_SCALE)
				* (1 - Math.abs(position));
		page.setScaleX(scaleFactor);
		page.setScaleY(scaleFactor);
		if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
			page.getParent().requestLayout();
		}
	}
}
