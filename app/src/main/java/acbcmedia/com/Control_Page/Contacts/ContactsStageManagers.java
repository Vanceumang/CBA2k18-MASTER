package acbcmedia.com.Control_Page.Contacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.RecyclerOptionsAdapter;

public class ContactsStageManagers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        Toolbar toolbar = findViewById(R.id.toolbar_main);

//        Toolbar title
        toolbar.setTitle("Stage Managers");

//        Set the toolbar as an actionbar that can contain menus
        setSupportActionBar(toolbar);

//        Enable the home button on the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Set the top textview
        TextView textView = findViewById(R.id.contacts_team_info);

        textView.setText("Stage Managers");

        String names[] = new String[]{"1. Albert Hum", "2. Justin Thang", "3. Saya San No Thuan", "4. Siangte"};
        String emails[] = new String[]{"@mail", "@mail", "@mail", "@mail"};
        String phones[] = new String[]{"678-776-3189", "678-345-3119", "678-345-3119", "770-345-7119"};

        RecyclerView recyclerView = findViewById(R.id.contact_lists);

        RecyclerOptionsAdapter recyclerOptionsAdapter = new RecyclerOptionsAdapter(this, names, emails, phones);

        recyclerView.setAdapter(recyclerOptionsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //        To add the divider lines in between the items
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

    }

}
