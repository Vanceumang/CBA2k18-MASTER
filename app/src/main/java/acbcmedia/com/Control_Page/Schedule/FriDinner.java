package acbcmedia.com.Control_Page.Schedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

import acbcmedia.com.Control_Page.Contacts.Contact4;
import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.Tabs.ActivityFour;
import acbcmedia.com.Control_Page.Tabs.ActivityOne;

import android.util.Log;
//import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class FriDinner extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fri_dinner);

        ImageView button = (ImageView) findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriDinner.this, ActivityOne.class);
                startActivity(intent);
            }
        });


    }

}
