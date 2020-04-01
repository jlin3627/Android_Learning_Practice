// Copyright 2016 Google Inc.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//      http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.googleio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity
{
    private Button _btnMenu;       // Menu button
    private RelativeLayout  _rlMenu; // Relative layout Menu
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_done);
        viewDidLoad();
        setupClick();
    }

    private void viewDidLoad()
    {
        _btnMenu   = findViewById(R.id.btnMenu);
        _rlMenu    = findViewById(R.id.MenuActivity);


    }

    private void setupClick()
    {
        _btnMenu.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                //Method 1: create new intent activity
                // Problem: the layout will be a new screen covering the whole screen
                //Intent myIntent = new Intent(view.getContext(), MenuActivity.class);
                //startActivityForResult(myIntent, 0);

                //Method 2: Set the menu visible and use include in layout xml
                // Problem: layout will be overlay by other contents
                _rlMenu.setVisibility(View.VISIBLE);

                //Method 3: create new
                //This will show in center
                //MenuActivity2 MenuLayout = new MenuActivity2(MainActivity.this);
                //MenuLayout.show();
            }
        });
    }
}
