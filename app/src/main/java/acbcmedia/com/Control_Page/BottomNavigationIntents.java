package acbcmedia.com.Control_Page;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.Menu;
import android.view.MenuItem;

import acbcmedia.com.Control_Page.Tabs.ActivityContacts;
import acbcmedia.com.Control_Page.Tabs.ActivityLeaderships;
import acbcmedia.com.Control_Page.Tabs.ActivityLocations;
import acbcmedia.com.Control_Page.Tabs.ActivitySchedule;
import acbcmedia.com.Control_Page.Tabs.MainActivity;

public class BottomNavigationIntents {
    private Context context;
    private BottomNavigationView bottomNavigationView;
    private String className;
    private int itemNumber;
    private static final String TAG = "BottomNavigationIntents";


    public BottomNavigationIntents(Context context, BottomNavigationView bottomNavigationView, int itemNumber) {
        this.context = context;
        this.bottomNavigationView = bottomNavigationView;
        className = context.getClass().getSimpleName();
        this.itemNumber = itemNumber;

        runIntents();
    }

    private void runIntents() {
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(itemNumber);
        menuItem.setChecked(true);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                switch (item.getItemId()) {
                    case R.id.ic_home:
                        if (className.equalsIgnoreCase("MainActivity")) {
                            break;
                        }
                        intent = new Intent(context, MainActivity.class);
                        context.startActivity(intent);
                        break;

                    case R.id.ic_schedule:
                        if (className.equalsIgnoreCase("ActivitySchedule")) {
                            break;
                        }
                        intent = new Intent(context, ActivitySchedule.class);
                        context.startActivity(intent);
                        break;

                    case R.id.ic_leaderships:
                        if (className.equalsIgnoreCase("ActivityLeaderships")) {
                            break;
                        }
                        intent = new Intent(context, ActivityLeaderships.class);
                        context.startActivity(intent);
                        break;

                    case R.id.ic_locations:
                        if (className.equalsIgnoreCase("ActivityLocations")) {
                            break;
                        }
                        intent = new Intent(context, ActivityLocations.class);
                        context.startActivity(intent);
                        break;

                    case R.id.ic_contacts:
                        if (className.equalsIgnoreCase("ActivityContacts")) {
                            break;
                        }
                        intent = new Intent(context, ActivityContacts.class);
                        context.startActivity(intent);
                        break;
                }

                return false;
            }
        });
    }

}
