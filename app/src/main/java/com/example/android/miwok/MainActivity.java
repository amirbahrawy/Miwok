package com.example.android.miwok;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    ViewPager y;
    TabLayout x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x =(TabLayout) findViewById(R.id.tab1);
        y=(ViewPager)findViewById(R.id.view1);
        y.setAdapter(new myown(getSupportFragmentManager()));
        x.setupWithViewPager(y);
        x.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                y.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    public void open_numbers_list(View view) {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);

    }

    public class myown extends FragmentPagerAdapter {
        String s[] = {"Numbers", "Family", "Colors", "Phrases"};

        public myown(FragmentManager fm) {
            super(fm);
        }


        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            if(position==0)
                return new NumbersActivity();
            if (position==1)
                return new FamilyActivity();
            if(position==2)
                return new ColorsActivity();
            if(position==3)
                return new PhrasesActivity();

            return null;
        }

        @Override
        public int getCount() {
            return s.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return s[position];
        }
    }
}
