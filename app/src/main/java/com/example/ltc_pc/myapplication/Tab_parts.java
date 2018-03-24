package com.example.ltc_pc.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab_parts extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.tab_parts, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        Tab_parts.SectionsPagerAdapter mSectionsPagerAdapter = new Tab_parts.SectionsPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);

        return view;

    }


    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new frag_parts_mtc();
                case 1:
                    return new frag_parts_egy();
                case 2:
                    return new frag_parts_arab();
                default:
                    return new frag_parts_foreign();
            }

        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "MTC";
                case 1:
                    return "EGY";
                case 2:
                    return "ARAB";
                default:
                    return "FOREIGN";
            }


        }
    }


}
