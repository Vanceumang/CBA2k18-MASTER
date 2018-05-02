package acbcmedia.com.Control_Page.Contacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.RecyclerOptionsAdapter;

public class ContactsACBC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        Toolbar toolbar = findViewById(R.id.toolbar_main);

        toolbar.setTitle("ACBC Media Contacts");

        setSupportActionBar(toolbar);

//        Home button on the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        Logo on the toolbar
//        getSupportActionBar().setLogo(R.mipmap.ic_cbana_round);
//        getSupportActionBar().setDisplayUseLogoEnabled(true);


        String names[] = new String[]{"1. Pu Hu", "2. Luaite", "3. Salai Hute", "4. Dinga"};
        String phones[] = new String[]{"678-776-3189","678-345-3119", "678-345-3119", "770-345-7119"};

        RecyclerView recyclerView = findViewById(R.id.contact_lists);

        RecyclerOptionsAdapter recyclerOptionsAdapter = new RecyclerOptionsAdapter(this, names, phones);

        recyclerView.setAdapter(recyclerOptionsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
