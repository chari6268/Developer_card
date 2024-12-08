package com.chari6268.developerdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chari6268.developer_card.UserDetails;
import com.chari6268.developer_card.UserDetailsView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserDetails user = new UserDetails(
                "Srinivasa Chari",
                "2021-2025",
                "https://github.com/chari6268",
                "https://www.linkedin.com/in/perusomula-srinivasa-chari/",
                R.drawable.ic_launcher_background
        );

        UserDetailsView userDetailsView = findViewById(R.id.test);
        UserDetailsView userDetailsView1 = findViewById(R.id.test1);
        userDetailsView.setUserDetails(user,this);
        userDetailsView1.setUserDetails(user,this);
    }
}