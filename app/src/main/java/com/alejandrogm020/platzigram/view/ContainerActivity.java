package com.alejandrogm020.platzigram.view;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.alejandrogm020.platzigram.view.fragment.HomeFragment;
import com.alejandrogm020.platzigram.view.fragment.ProfileFragment;
import com.alejandrogm020.platzigram.view.fragment.SearchFragment;
import com.alejandrogm020.platzigram.R;


public class ContainerActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        final android.support.v4.app.Fragment homeFragment = new HomeFragment();
        final android.support.v4.app.Fragment profileFragment = new ProfileFragment();
        final android.support.v4.app.Fragment searchFragment = new SearchFragment();

        if(savedInstanceState == null){
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentContainer, homeFragment).commit();
        }

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottombar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

                if(item.getItemId() == R.id.home_item){
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, homeFragment).commit();

                }else if(item.getItemId() == R.id.search_item){
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, profileFragment).commit();

                }else if(item.getItemId() == R.id.profile_item){
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, searchFragment).commit();
                }
                return false;
            }
        });

    }
}
