package acbcmedia.com.Control_Page.Tabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import acbcmedia.com.Control_Page.BottomNavigationViewHelper;
import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.RecyclerOptionsAdapter;
import acbcmedia.com.Control_Page.RecyclerTouchListener;


/**
 * Created by VC on 1/16/18.
 */

public class ActivityLocations extends AppCompatActivity {
    private static final String TAG = "ActivityLocations";

    //declaration of Items for the listView
    String names[] = new String[]{"Atlanta Chin Baptist Church", "Hotels Information", "Infinite Energy Forum", "Recommended Places to Visit"};

    //"Recommended Food Places", "Recommended Places to Visit", "Hotels Information", "Atlanta Chin Baptist Church", "Infinite Energy Forum"
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        TextView textView = findViewById(R.id.main);

        textView.setText("Locations");

//        ListView list = (ListView) findViewById(R.id.theList);
//        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_layout, names);
//        list.setAdapter(adapter);

        RecyclerView recyclerView = findViewById(R.id.contacts);

        RecyclerOptionsAdapter recyclerOptionsAdapter = new RecyclerOptionsAdapter(this, names);

        recyclerView.setAdapter(recyclerOptionsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //        Use this instead of the previous listView listener
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this, recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent myIntent;
                switch (position) {
                    case 0:
                        myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.google.com/maps/dir/''/atlanta+chin+baptist+church/@33.9006282,-84.2742941,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x88f5a69483ae119b:0x22d254e0010fb203!2m2!1d-84.204254!2d33.900648"));
                        startActivityForResult(myIntent, 0);
                        break;
                    case 1:
                         myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.exploregwinnett.org/chinbaptist"));
                        startActivityForResult(myIntent, 1);
                        break;
                    case 2:
                        myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.infiniteenergycenter.com/venues/detail/forum"));                        startActivityForResult(myIntent, 2);
                        break;
                    case 3:
                        myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.citypass.com/atlanta/things-to-do-atlanta"));
                        startActivityForResult(myIntent, 3);
                        break;

                    default:
                        break;
                }

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

//        To add the divider lines in between the items
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                if (position == 0) {
//                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.google.com/maps/dir/''/atlanta+chin+baptist+church/@33.9006282,-84.2742941,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x88f5a69483ae119b:0x22d254e0010fb203!2m2!1d-84.204254!2d33.900648"));
//                    startActivityForResult(myIntent, 0);
//                    // Intent myIntent = new Intent(view.getContext(), Location1.class);
//                    // startActivityForResult(myIntent,0);
//                }
//                if (position == 1) {
//                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.exploregwinnett.org/chinbaptist"));
//                    startActivityForResult(myIntent, 1);
//                }
//                if (position == 2) {
//                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.infiniteenergycenter.com/venues/detail/forum"));
//                    startActivityForResult(myIntent, 2);
//                    //Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://vanceumang.github.io/#home"));
//                    //startActivityForResult(myIntent,2);
//                }
//
//                if (position == 3) {
//                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.citypass.com/atlanta/things-to-do-atlanta"));
//                    startActivityForResult(myIntent, 3);
//
//                }
//            }
//        });

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

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_home:
                        Intent intent0 = new Intent(ActivityLocations.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_schedule:
                        Intent intent1 = new Intent(ActivityLocations.this, ActivitySchedule.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_speakers:
                        Intent intent2 = new Intent(ActivityLocations.this, ActivityLeaderships.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_history:
                        break;

                    case R.id.ic_location:
                        Intent intent4 = new Intent(ActivityLocations.this, ActivityContacts.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });
    }
}

