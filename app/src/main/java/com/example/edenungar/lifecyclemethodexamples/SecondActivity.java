package com.example.edenungar.lifecyclemethodexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //links variable to ui element
        finishButton = findViewById(R.id.finish_button);

        //method to set listener
        setListener();
    }

    private void setListener() {
        //sets listener for the finishButton
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //closes this activity, goes back to main (previous) activity
                finish();
            }
        });
    }
}
