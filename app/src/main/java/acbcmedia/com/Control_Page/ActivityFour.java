package acbcmedia.com.Control_Page;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import acbcmedia.com.Control_Page.Contacts.Contact1;
import acbcmedia.com.Control_Page.Contacts.Contact2;

/**
 * Created by User on 4/15/2017.
 */

public class ActivityFour extends AppCompatActivity {

    //declaration of Items for the listView
    String items[] = new String [] { "Hotel", "Transportation", "Food", "CBANA Youth", "ACBC Media",""};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        /*Button button = (Button) findViewById(R.id.browserLocation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("http://www.google.com"));
                startActivity(intent);
            }
        });
        */


        ListView list = (ListView) findViewById(R.id.contacts);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_layout4, items);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    Intent myIntent = new Intent(view.getContext(), Contact1.class);
                    startActivityForResult(myIntent,0);
                }
                if(position == 1){
                    Intent myIntent = new Intent(view.getContext(), Contact2.class);
                    startActivityForResult(myIntent,1);
                }
                if(position == 2){
                    Intent myIntent = new Intent(view.getContext(), Contact1.class);
                    startActivityForResult(myIntent,2);
                }
                if(position == 3){
                    Intent myIntent = new Intent(view.getContext(), Contact1.class);
                    startActivityForResult(myIntent,3);
                }
                if(position == 4){
                    Intent myIntent = new Intent(view.getContext(), Contact1.class);
                    startActivityForResult(myIntent,4);
                }





            }
        });


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intent0 = new Intent(ActivityFour.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_schedule:
                        Intent intent1 = new Intent(ActivityFour.this, ActivityOne.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_speakers:
                        Intent intent2 = new Intent(ActivityFour.this, ActivityTwo.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_history:
                        Intent intent3 = new Intent(ActivityFour.this, ActivityThree.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_location:
                        break;
                }

                return false;
            }
        });
    }
}
