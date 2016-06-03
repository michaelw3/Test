package org.zpto.wernerprogs.test;
import android.content.*;
import android.support.v4.app.*;

public class PagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] { "Tab1", "Tab2" };
    private Context context;

    public PagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
		this.mNumOfTabs = NumOfTabs;
	}

	@Override
	public Fragment getItem(int position) {

		switch (position) {
			case 0:
				TabItem1 tab1 = new TabItem1();
				return tab1;
			case 1:
				TabItem1 tab2 = new TabItem1();
				return tab2;
			default:
				return null;
		}
	}

	@Override
	public int getCount() {
		return mNumOfTabs;
	}
    

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
