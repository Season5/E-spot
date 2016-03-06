package com.espot.ent.entertainmentspot;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Movies extends ListActivity {


    String [] movies = {





    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.movies);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, movies));
    }

    public void onListItemClick(
            ListView parent, View v, int position, long id)
    {
        Toast.makeText(this, "Your Choice is "+ movies[position], Toast.LENGTH_LONG).show();
    }


}
