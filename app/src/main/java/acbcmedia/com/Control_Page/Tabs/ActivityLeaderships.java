package acbcmedia.com.Control_Page.Tabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import acbcmedia.com.Control_Page.BottomNavigationIntents;
import acbcmedia.com.Control_Page.Leaderships.CBA_Ce;
import acbcmedia.com.Control_Page.Leaderships.CBA_Guests;
import acbcmedia.com.Control_Page.Leaderships.CBA_Mino;
import acbcmedia.com.Control_Page.Leaderships.CBA_Nubu;
import acbcmedia.com.Control_Page.Leaderships.CBA_Upa;
import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.RecyclerOptionsAdapter;
import acbcmedia.com.Control_Page.RecyclerTouchListener;

/**
 * Created by VC
 */

public class ActivityLeaderships extends AppCompatActivity {

    private String[] speakerTop = new String[]{"Christian", "Culture", "Development", "Minister", "Mission", "Officers", "Women", "Youth"};
    private String[] speakerBottom = new String[]{"Education", "Literature", "Department", "Council", "Department", "Council", "Department", "Department"};
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderships);

//        Toolbar toolbar = findViewById(R.id.toolbar_main);
//
//        toolbar.setTitle("Leaderships");

        RecyclerView recyclerView = findViewById(R.id.recycler_card);

        RecyclerOptionsAdapter adapter = new RecyclerOptionsAdapter(this, speakerTop, speakerBottom, true);

        recyclerView.setAdapter(adapter);

        layoutManager = new GridLayoutManager(this, 2);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this, recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(ActivityLeaderships.this, CBA_Upa.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(ActivityLeaderships.this, CBA_Mino.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(ActivityLeaderships.this, CBA_Nubu.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(ActivityLeaderships.this, CBA_Ce.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(ActivityLeaderships.this, CBA_Guests.class);
                        startActivity(intent);
                        break;
                    default:
                        break;

                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav_Bar);
        new BottomNavigationIntents(this, bottomNavigationView, 2);

    }


}
