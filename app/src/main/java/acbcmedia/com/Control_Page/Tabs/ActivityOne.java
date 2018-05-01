package acbcmedia.com.Control_Page.Tabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import acbcmedia.com.Control_Page.BottomNavigationViewHelper;
import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.Schedule.Tab1Fragment;
import acbcmedia.com.Control_Page.Schedule.Tab2Fragment;
import acbcmedia.com.Control_Page.Schedule.Tab3Fragment;
import acbcmedia.com.Control_Page.SectionsPageAdapter;


/**
 * Created by VC 1/13/18
 */

public class ActivityOne extends AppCompatActivity {
    private static final String TAG = "Activity3";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.d(TAG, "onCreate: Starting.");


        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);




        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intent0 = new Intent(ActivityOne.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_schedule:

                        break;

                    case R.id.ic_speakers:
                        Intent intent2 = new Intent(ActivityOne.this, ActivityTwo.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_history:
                        Intent intent3 = new Intent(ActivityOne.this, ActivityThree.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_location:
                        Intent intent4 = new Intent(ActivityOne.this, ActivityFour.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });
    }
    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "MAY 25");
        adapter.addFragment(new Tab2Fragment(), "MAY 26");
        adapter.addFragment(new Tab3Fragment(), "MAY 27");
        //adapter.addFragment();
        viewPager.setAdapter(adapter);

    }

}