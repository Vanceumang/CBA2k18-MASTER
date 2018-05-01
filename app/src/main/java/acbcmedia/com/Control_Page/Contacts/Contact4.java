package acbcmedia.com.Control_Page.Contacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.Tabs.ActivityContacts;

public class Contact4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact4);

        ImageView button = (ImageView) findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Contact4.this, ActivityContacts.class);
                startActivity(intent);
            }
        });
    }
}
