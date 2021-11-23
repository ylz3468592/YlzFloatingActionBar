package com.ylz.ylzDragFloatingActionBar;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ylz.ylzfloatingactionbar.AnimationUtil;
import com.ylz.ylzfloatingactionbar.FloatingDraftButton;

public class MainActivity extends AppCompatActivity {
    FloatingDraftButton floatingDraftButton;

    FloatingActionButton liveness;
    FloatingActionButton floatingActionButton2;
    FloatingActionButton floatingActionButton3;
    FloatingActionButton floatingActionButton4;
    FloatingActionButton floatingActionButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        floatingDraftButton = findViewById(R.id.floatingActionButton);
        liveness = findViewById(R.id.floatingActionButton_liveness);
        floatingActionButton2 = findViewById(R.id.floatingActionButton_2);
        floatingActionButton3 = findViewById(R.id.floatingActionButton_3);
        floatingActionButton4 = findViewById(R.id.floatingActionButton_4);
        floatingActionButton5 = findViewById(R.id.floatingActionButton_5);
        floatingDraftButton.registerButton(liveness);
        floatingDraftButton.registerButton(floatingActionButton2);
        floatingDraftButton.registerButton(floatingActionButton3);
        floatingDraftButton.registerButton(floatingActionButton4);
        floatingDraftButton.registerButton(floatingActionButton5);

        floatingDraftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimationUtil.slideButtons(MainActivity.this, floatingDraftButton);
            }
        });
        liveness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimationUtil.slideButtons(MainActivity.this, floatingDraftButton);
                Toast.makeText(getApplicationContext(), "liveness", Toast.LENGTH_SHORT).show();
            }
        });

    }
}