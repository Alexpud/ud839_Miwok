/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        final TextView colorsTextView = (TextView) findViewById(R.id.colors);

        // Creating an intent for the colors Activity
        final Intent colorIntent = new Intent(this, ColorsActivity.class);

        colorsTextView.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(colorIntent);
            }
        });

        final TextView familyTextView = (TextView) findViewById(R.id.family);

        // Creating an intent for the family activity
        final Intent familyIntent = new Intent(this, FamilyActivity.class);

        familyTextView.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(familyIntent);
            }
        });

        // Finding the textview
        final TextView numbersTextView = (TextView) findViewById(R.id.numbers);

        // Creating an intent for the numbers Activity
        final Intent numbersIntent = new Intent(this, NumbersActivity.class);

        numbersTextView.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(numbersIntent);
            }
        });

        // Finding the textview
        final TextView phrasesTextView = (TextView) findViewById(R.id.phrases);

        // Creating an intent for the phrases Activity
        final Intent phrasesIntent = new Intent(this, PhrasesActivity.class);

        phrasesTextView.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(phrasesIntent);
            }
        });

    }
}
