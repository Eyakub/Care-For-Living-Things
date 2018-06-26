package com.example.mdeyakubsorkar.careforlivingthings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnVetActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVetActivity = findViewById(R.id.vetButton);
        btnVetActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToVetListActivity();
            }
        });
    }

    private void goToVetListActivity() {
        Intent intent = new Intent(this, ListOfVetActivity.class);
        startActivity(intent);
    }
}
