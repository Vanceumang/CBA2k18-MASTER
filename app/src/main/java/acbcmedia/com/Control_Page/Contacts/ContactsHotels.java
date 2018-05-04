package acbcmedia.com.Control_Page.Contacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.RecyclerOptionsAdapter;

public class ContactsHotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        Toolbar toolbar = findViewById(R.id.toolbar_main);

//        Toolbar title
        toolbar.setTitle("Hotels");

//        Set the toolbar as an actionbar that can contain menus
        setSupportActionBar(toolbar);

//        Enable the home button on the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Set the top textview
        TextView textView = findViewById(R.id.info_text);

        textView.setText("Hotel Team Contacts");
        textView.setTextSize(25);

//        The names and phone numbers
        String names[] = new String[]{"Za Hleih Lyan (Hleihte)", " Mai Mary Aung"};
        String phones[] = new String[]{"678-776-3189","678-345-3119"};

        RecyclerView recyclerView = findViewById(R.id.contact_lists);

        RecyclerOptionsAdapter recyclerOptionsAdapter = new RecyclerOptionsAdapter(this, names, phones);

        recyclerView.setAdapter(recyclerOptionsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
