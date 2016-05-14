package com.udacity.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onSetUpEventHandler();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_popular_movie:
                showToast(getString(R.string.app_button_msg1) + getString(R.string.app_button_popular_movies));
                break;
            case R.id.button_stock_hawk:
                showToast(getString(R.string.app_button_msg1) + getString(R.string.app_button_stock_hawk));
                break;

            case R.id.button_build_it_bigger:
                showToast(getString(R.string.app_button_msg1) + getString(R.string.app_button_build_it_bigge));
                break;

            case R.id.button_material:
                showToast(getString(R.string.app_button_msg1) + getString(R.string.app_button_material));
                break;

            case R.id.button_go_ubiquitous:
                showToast(getString(R.string.app_button_msg1) + getString(R.string.app_button_go_ubiquitous));
                break;

            case R.id.button_capstone:
                showToast(getString(R.string.app_button_msg1) + getString(R.string.app_button_capstone));
                break;
        }
    }

    public void onSetUpEventHandler() {

        // code below was used in android-basic-samples

        final int[] CLICKABLES = new int[] {
                R.id.button_popular_movie,R.id.button_stock_hawk,R.id.button_build_it_bigger, R.id.button_material,
                R.id.button_go_ubiquitous, R.id.button_capstone
        };

        for (int i : CLICKABLES) {
            findViewById(i).setOnClickListener(this);
        }
    }

    private void showToast(String msg) {
        Toast.makeText(this, msg,
                Toast.LENGTH_SHORT).show();
    }
}
