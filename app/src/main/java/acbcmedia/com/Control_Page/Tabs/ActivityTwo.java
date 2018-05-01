package acbcmedia.com.Control_Page.Tabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import acbcmedia.com.Control_Page.BottomNavigationViewHelper;
import acbcmedia.com.Control_Page.Leaderships.CBA_Mino;
import acbcmedia.com.Control_Page.Leaderships.CBA_Upa;
import acbcmedia.com.Control_Page.R;

/**
Created by VC
 */

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener{

    private CardView hruaitu, mino, nubu, ce, guests;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        //Defining each Tabs(Hruaitu, Mino, Nubu, CE and Guests)
        hruaitu = (CardView) findViewById(R.id.Upa);
        mino = (CardView) findViewById(R.id.Mino);
//        nubu = (CardView) findViewById(R.id.Nubu);
//        ce = (CardView) findViewById(R.id.CE);
//        guests = (CardView) findViewById(R.id.Guest);

        //Add Click listener to the tabs
        hruaitu.setOnClickListener(this);
        mino.setOnClickListener(this);
        nubu.setOnClickListener(this);
        ce.setOnClickListener(this);
        guests.setOnClickListener(this);



        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intent0 = new Intent(ActivityTwo.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_schedule:
                        Intent intent1 = new Intent(ActivityTwo.this, ActivityOne.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_speakers:

                        break;

                    case R.id.ic_history:
                        Intent intent3 = new Intent(ActivityTwo.this, ActivityThree.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_location:
                        Intent intent4 = new Intent(ActivityTwo.this, ActivityFour.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.Upa:
                i = new Intent(this,CBA_Upa.class);
                startActivity(i);
                break;
            case R.id.Mino:
                i = new Intent(this,CBA_Mino.class);
                startActivity(i);
                break;
//            case R.id.Nubu:
//                i = new Intent(this,CBA_Nubu.class);
//                startActivity(i);
//                break;
//            case R.id.CE:
//                i = new Intent(this,CBA_Ce.class);
//                startActivity(i);
//                break;
//            case R.id.Guest:
//                i = new Intent(this,CBA_Guests.class);
//                startActivity(i);
//                break;
                default:break;


        }


    }

}
