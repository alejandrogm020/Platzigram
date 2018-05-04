package com.alejandrogm020.platzigram.view;

import android.support.design.widget.BaseTransientBottomBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.alejandrogm020.platzigram.R;
//import com.roughike.bottombar.BottomBar;


public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        //BottomBar bottomBar = (BottomBar) findViewById(R.id.bottombar);
    }
}
