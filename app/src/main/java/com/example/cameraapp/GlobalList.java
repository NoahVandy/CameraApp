package com.example.cameraapp;

import android.app.Application;
import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class GlobalList extends Application {

    List<Uri> uriList = new ArrayList<Uri>();

    public GlobalList(){
        this.uriList = new ArrayList<Uri>();
    }


    public List<Uri> getUriList() {
        return uriList;
    }

    public void setUriList(List<Uri> uriList) {
        this.uriList = uriList;
    }
}
