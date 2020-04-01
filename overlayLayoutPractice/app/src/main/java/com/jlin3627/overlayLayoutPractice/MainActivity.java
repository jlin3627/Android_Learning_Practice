package com.jlin3627.overlayLayoutPractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Button _btnMenu;       // Menu button
    private Button _btnTipCalc;
    private Button _btnHideMenu;
    private LinearLayout _llMenu; // Relative layout Menu
    private LinearLayout   _llCoverMenu; // Linear layout cover menu
    //private FrameLayout _frame_main_layout;  //Main Layout


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewDidLoad();
        setupClick();
    }

    private void viewDidLoad()
    {
        _btnMenu   = findViewById(R.id.btnMenu);
        _btnHideMenu = findViewById(R.id.btnHideMenu);
        _llMenu    = findViewById(R.id.llMenu);
        _llCoverMenu = findViewById(R.id.llCoverMenu);
        _btnTipCalc = findViewById(R.id.btnTipCalc);
    }

    private void setupClick()
    {
        _btnMenu.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                //Method 1: create new intent activity
                // Problem: the layout will be a new screen covering the whole screen
                // Remove the include code
                //Intent myIntent = new Intent(view.getContext(), MenuActivity.class);
                //startActivityForResult(myIntent, 0);

                //Method 2: Set the menu visible and use include in layout xml
                // Problem: layout will be overlay with other contents
                // Problem2: Doesn't call
                _llCoverMenu.setVisibility(View.INVISIBLE);
                _llMenu.setVisibility(View.VISIBLE);

                //Method 3: create new
                //This will show in center
                //MenuActivity2 MenuLayout = new MenuActivity2(MainActivity.this);
                //MenuLayout.show();
            }
        });

        _btnHideMenu.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                _llMenu.setVisibility(View.INVISIBLE);
                _llCoverMenu.setVisibility(View.VISIBLE);
            }
        });

        _btnTipCalc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                //Method 1: create new intent activity
                // Problem: the layout will be a new screen covering the whole screen
                // Remove the include code
                Intent myIntent = new Intent(view.getContext(), TipCalculatorActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
