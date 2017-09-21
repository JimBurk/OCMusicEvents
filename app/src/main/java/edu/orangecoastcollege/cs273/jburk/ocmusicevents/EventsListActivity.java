package edu.orangecoastcollege.cs273.jburk.ocmusicevents;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EventsListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_events_list);

        //Define a built-in list adaptor
        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, MusicEvent.titles));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String title = MusicEvent.titles[position];
        String details = MusicEvent.details[position];

        Intent detailsIntent = new Intent(this, EventsDetailActivity.class);
        detailsIntent.putExtra("title", title);
        detailsIntent.putExtra("details", details);

        startActivity(detailsIntent);
    }
}
