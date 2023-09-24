package com.firstapp.campusbuddyv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //Button map_button = (Button) findViewById(R.id.map_button);
       Button route_button = (Button) findViewById(R.id.route_button);

        route_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //New Activity - opens route me page
                Intent intent = new Intent(HomePageActivity.this, RouteActivity.class);
                startActivity(intent);

            }
        });



    }
}