package acbcmedia.com.Control_Page;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import acbcmedia.com.Control_Page.Tabs.ActivityContacts;
import acbcmedia.com.Control_Page.Tabs.ActivitySchedule;
import acbcmedia.com.Control_Page.Tabs.ActivityLocations;
import acbcmedia.com.Control_Page.Tabs.ActivityLeaderships;
import acbcmedia.com.Control_Page.Tabs.MainActivity;

public class BottomNavigationIntents {
    private Context context;
    private BottomNavigationView bottomNavigationView;
    private String className;
    private static final String TAG = "BottomNavigationIntents";


    public BottomNavigationIntents(Context context, BottomNavigationView bottomNavigationView) {
        this.context = context;
        this.bottomNavigationView = bottomNavigationView;
        className = context.getClass().getSimpleName();

        runIntents();
    }

    private void runIntents() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                switch (item.getItemId()) {
                    case R.id.ic_home:
                        intent = new Intent(context, MainActivity.class);
                        context.startActivity(intent);
                        break;

                    case R.id.ic_schedule:
                        intent = new Intent(context, ActivitySchedule.class);
                        context.startActivity(intent);
                        break;

                    case R.id.ic_speakers:
                        intent = new Intent(context, ActivityLeaderships.class);
                        context.startActivity(intent);
                        break;

                    case R.id.ic_history:
                        intent = new Intent(context, ActivityLocations.class);
                        context.startActivity(intent);
                        break;

                    case R.id.ic_location:
                        intent = new Intent(context, ActivityContacts.class);
                        context.startActivity(intent);
                        Log.i(TAG, "onNavigationItemSelected: "+ className);
                        break;
                }

                return false;
            }
        });
    }

}
