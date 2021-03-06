package com.hypherweb.www.asscky.Adaptor;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hypherweb.www.asscky.R;
import com.hypherweb.www.asscky.View.Fragments.CreateBoardFragment;
import com.hypherweb.www.asscky.View.Fragments.JoinBoardFragment;
import com.hypherweb.www.asscky.View.Fragments.ProfileFragment;

/**
 * Created by AirUnknown on 2016-10-20.
 */

public class HomePageAdaptor extends FragmentPagerAdapter {

    Context mContext;

    public HomePageAdaptor(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CreateBoardFragment();
        } else if (position == 1) {
            return new JoinBoardFragment();
        } else {
            return new ProfileFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.fragment_title_create_board);
        } else if (position == 1) {
            return mContext.getString(R.string.fragment_title_join_board);
        } else {
            return mContext.getString(R.string.fragment_title_profile);
        }

    }
}
