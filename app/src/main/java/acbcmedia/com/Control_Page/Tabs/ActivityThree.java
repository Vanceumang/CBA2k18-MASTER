package acbcmedia.com.Control_Page.Tabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import acbcmedia.com.Control_Page.BottomNavigationViewHelper;
import acbcmedia.com.Control_Page.Locations.Location1;
import acbcmedia.com.Control_Page.Locations.Location2;
import acbcmedia.com.Control_Page.Locations.Location3;
import acbcmedia.com.Control_Page.Locations.Person;
import acbcmedia.com.Control_Page.R;


/**
 * Created by VC on 1/16/18.
 */

public class ActivityThree extends AppCompatActivity {
    private static final String TAG = "ActivityThree";

    //declaration of Items for the listView
    String names[] = new String [] { "", "", "", "", ""};
//"Recommended Food Places", "Recommended Places to Visit", "Hotels Information", "Atlanta Chin Baptist Church", "Infinite Energy Forum"
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);


        ListView list = (ListView) findViewById(R.id.theList);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_layout, names);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.google.com/maps/dir/''/atlanta+chin+baptist+church/@33.9006282,-84.2742941,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x88f5a69483ae119b:0x22d254e0010fb203!2m2!1d-84.204254!2d33.900648"));
                    startActivityForResult(myIntent,0);
                    // Intent myIntent = new Intent(view.getContext(), Location1.class);
                    // startActivityForResult(myIntent,0);
                }
                if(position == 1){
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.exploregwinnett.org/chinbaptist"));
                    startActivityForResult(myIntent,1);
                }
                if(position == 2){
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.infiniteenergycenter.com/venues/detail/forum"));
                    startActivityForResult(myIntent,2);
                    //Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://vanceumang.github.io/#home"));
                    //startActivityForResult(myIntent,2);
                }

                if(position == 3){
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.citypass.com/atlanta/things-to-do-atlanta"));
                    startActivityForResult(myIntent,3);

                }
            }
        });

/*
        Button button = (Button) findViewById(R.id.browser);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("http://www.google.com"));
                startActivity(intent);
            }
        }); */

        //TextView title = (TextView) findViewById(R.id.activityTitle3);
        //title.setText("This is Activity Three");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intent0 = new Intent(ActivityThree.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_schedule:
                        Intent intent1 = new Intent(ActivityThree.this, ActivityOne.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_speakers:
                        Intent intent2 = new Intent(ActivityThree.this, ActivityTwo.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_history:
                        break;

                    case R.id.ic_location:
                        Intent intent4 = new Intent(ActivityThree.this, ActivityFour.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });
    }
}

