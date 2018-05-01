package acbcmedia.com.Control_Page.Tabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import acbcmedia.com.Control_Page.BottomNavigationIntents;
import acbcmedia.com.Control_Page.Contacts.Contact1;
import acbcmedia.com.Control_Page.Contacts.Contact2;
import acbcmedia.com.Control_Page.Contacts.Contact3;
import acbcmedia.com.Control_Page.Contacts.Contact4;
import acbcmedia.com.Control_Page.Contacts.Contact5;
import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.RecyclerOptionsAdapter;
import acbcmedia.com.Control_Page.RecyclerTouchListener;


public class ActivityContacts extends AppCompatActivity {

    //declaration of Items for the listView
    private String items[] = new String[]{"ACBC Media", "Catering", "Communication", "Hotels", "Hospitality", "Transportation"};

    private static final String TAG = "ActivityContacts";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        RecyclerView recyclerView = findViewById(R.id.contacts);

        RecyclerOptionsAdapter recyclerOptionsAdapter = new RecyclerOptionsAdapter(this, items);

        recyclerView.setAdapter(recyclerOptionsAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Log.d(TAG, "onCreate: " + this.getLocalClassName());

//        Use this instead of the previous listView listener
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this, recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent myIntent;
                switch (position) {
                    case 0:
                        myIntent = new Intent(ActivityContacts.this, Contact1.class);
                        startActivityForResult(myIntent, 0);
                        break;
                    case 1:
                        myIntent = new Intent(view.getContext(), Contact2.class);
                        startActivityForResult(myIntent, 1);
                        break;
                    case 2:
                        myIntent = new Intent(view.getContext(), Contact3.class);
                        startActivityForResult(myIntent, 2);
                        break;
                    case 3:
                        myIntent = new Intent(view.getContext(), Contact4.class);
                        startActivityForResult(myIntent, 3);
                        break;
                    case 4:
                        myIntent = new Intent(view.getContext(), Contact5.class);
                        startActivityForResult(myIntent, 4);
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

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav_Bar);

        new BottomNavigationIntents(this, bottomNavigationView,4);


//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.ic_home:
//                        Intent intent0 = new Intent(ActivityContacts.this, MainActivity.class);
//                        startActivity(intent0);
//                        break;
//
//                    case R.id.ic_schedule:
//                        Intent intent1 = new Intent(ActivityContacts.this, ActivitySchedule.class);
//                        startActivity(intent1);
//                        break;
//
//                    case R.id.ic_speakers:
//                        Intent intent2 = new Intent(ActivityContacts.this, ActivityLeaderships.class);
//                        startActivity(intent2);
//                        break;
//
//                    case R.id.ic_history:
//                        Intent intent3 = new Intent(ActivityContacts.this, ActivityLocations.class);
//                        startActivity(intent3);
//                        break;
//
//                    case R.id.ic_location:
//                        break;
//                }
//
//                return false;
//            }
//        });
    }



//    public static interface ClickListener{
//        public void onClick(View view, int position);
//        public void onLongClick(View view, int position);
//    }

//    class RecyclerTouchListener implements RecyclerView.OnItemTouchListener{
//        private ClickListener clickListener;
//        private GestureDetector gestureDetector;
//
//        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final ClickListener clickListener) {
//            this.clickListener = clickListener;
//            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
//                @Override
//                public boolean onSingleTapUp(MotionEvent e) {
//                    return true;
//                }
//
//                @Override
//                public void onLongPress(MotionEvent e) {
//                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
//
//                    if (child != null && clickListener != null) {
//                        clickListener.onLongClick(child, recyclerView.getChildAdapterPosition(child));
//                    }
//                }
//            });
//
//        }
//
//        @Override
//        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
//            View child = rv.findChildViewUnder(e.getX(), e.getY());
//
//            if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
//                clickListener.onClick(child,rv.getChildAdapterPosition(child));
//            }
//
//            return false;
//        }
//
//        @Override
//        public void onTouchEvent(RecyclerView rv, MotionEvent e) {
//
//        }
//
//        @Override
//        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//
//        }
//    }
}
