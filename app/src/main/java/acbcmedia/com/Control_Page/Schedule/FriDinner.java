package acbcmedia.com.Control_Page.Schedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.Tabs.ActivitySchedule;

//import android.widget.ArrayAdapter;
import android.widget.ImageView;


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
                Intent intent = new Intent(FriDinner.this, ActivitySchedule.class);
                startActivity(intent);
            }
        });


    }

}
