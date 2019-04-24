package com.example.cameraapp;

import android.app.ListActivity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class PhotoList extends ListActivity {


    List<Uri> uriList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_list);

        uriList = ((GlobalList) this.getApplication()).getUriList();


        ArrayAdapter adapter = new ArrayAdapter( this, android.R.layout.simple_list_item_1, uriList);

        setListAdapter(adapter);




    }
}
