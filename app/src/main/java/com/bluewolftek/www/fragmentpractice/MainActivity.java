package com.bluewolftek.www.fragmentpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements ButtonFragment.OnButtonClickedListener {

    String buttonToast = "You pressed the button!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.container_button_fragment) != null) {
            if (savedInstanceState != null) {
                return;
            }
        }

        ButtonFragment buttonFragment = new ButtonFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_button_fragment, buttonFragment).commit();



    }

    @Override
    public void onButtonClicked(View v) {

    }
}
