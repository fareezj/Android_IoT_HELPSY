package com.fareez.helpsy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rey.material.widget.TextView;

public class AdminHomeActivity extends AppCompatActivity {

    private CardView publishEvent, manageEvent, publishNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        publishEvent = findViewById(R.id.admin_publish_event);
        manageEvent = findViewById(R.id.admin_manage_events);
        publishNews = findViewById(R.id.admin_donation_list);

        publishEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHomeActivity.this, AdminPublishEventActivity.class);
                startActivity(intent);
            }
        });

        manageEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHomeActivity.this, AdminManageEventListActivity.class);
                startActivity(intent);
            }
        });

        publishNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHomeActivity.this, AdminPublishNewsActivity.class);
                startActivity(intent);
            }
        });
    }
}
