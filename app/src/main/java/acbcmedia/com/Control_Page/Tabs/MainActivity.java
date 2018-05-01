package acbcmedia.com.Control_Page.Tabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import acbcmedia.com.Control_Page.BottomNavigationViewHelper;
import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.SectionsPageAdapter;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView locate = (ImageView) findViewById(R.id.location);
        locate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://www.google.com/maps/dir/''/infinite+energy+forum/@33.9895659,-84.1637424,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x88f5bd49d678ee55:0x5f1aa689ef9a04f6!2m2!1d-84.0937023!2d33.9895857"));
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_home:

                        break;

                    case R.id.ic_schedule:
                        Intent intent1 = new Intent(MainActivity.this, ActivityOne.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_speakers:
                        Intent intent2 = new Intent(MainActivity.this, ActivityTwo.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_history:
                        Intent intent3 = new Intent(MainActivity.this, ActivityThree.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_location:
                        Intent intent4 = new Intent(MainActivity.this, ActivityFour.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });

    }


}
