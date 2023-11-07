package com.getskn.sakar_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Dashboard extends AppCompatActivity {
    TextView greeting;
    RecyclerView recyclerView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
        greeting=findViewById(R.id.greeting);
        String getGreeting = getGreetingMessage();
        greeting.setText(getGreeting);
        recyclerView=findViewById(R.id.recycleI);

    }
    private String getGreetingMessage() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH", Locale.getDefault());
        String currentTime = sdf.format(new Date());
        int hourOfDay = Integer.parseInt(currentTime);

        if (hourOfDay > 0 && hourOfDay < 12) {
            return "Good Morning";
        } else if (hourOfDay >= 12 && hourOfDay < 17) {
            return "Good Afternoon";
        } else if (hourOfDay >= 17 && hourOfDay < 21) {
            return "Good Evening";
        } else {
            return "Good Night";
        }
    }
}