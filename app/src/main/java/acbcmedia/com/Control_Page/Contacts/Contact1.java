package acbcmedia.com.Control_Page.Contacts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import acbcmedia.com.Control_Page.R;
import acbcmedia.com.Control_Page.RecyclerOptionsAdapter;
import acbcmedia.com.Control_Page.Tabs.ActivityContacts;

public class Contact1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact1);

        Toolbar toolbar = findViewById(R.id.toolbar1);

        toolbar.setTitle("ACBC Media Contacts");



    ImageView button = (ImageView) findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Contact1.this, ActivityContacts.class);
                startActivity(intent);
            }
        });

        final List<String> nameList = new ArrayList<>();

        nameList.add("ACBD MEDIA CONTACTS");
        nameList.add("2. Tlangdinga");
        nameList.add("3. Tunga");

        String names[] = new String[]{"1. Pu H", "2. Luaite"};
        String phones[] = new String[]{"678-776-3189","678-345-3119"};
//        phones[0] = "678-776-3189";
//        phones[1] = "678-345-3119";


//        ListView listView = findViewById(R.id.listview_contacts);
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nameList);
//
//        listView.setAdapter(arrayAdapter);

        RecyclerView recyclerView = findViewById(R.id.contacts1);

        RecyclerOptionsAdapter recyclerOptionsAdapter = new RecyclerOptionsAdapter(this, names, phones,false);
//        RecyclerOptionsAdapter recyclerOptionsAdapter = new RecyclerOptionsAdapter(this, names);

        recyclerView.setAdapter(recyclerOptionsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }

}
