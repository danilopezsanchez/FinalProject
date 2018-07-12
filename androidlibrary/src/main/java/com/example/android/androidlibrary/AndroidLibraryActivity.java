package com.example.android.androidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_library_activity);

        Intent intent = getIntent();

        String joke = intent.getStringExtra("joke");

        TextView mTextView = findViewById(R.id.joke_android_library);
        mTextView.setText(joke);

    }
}
