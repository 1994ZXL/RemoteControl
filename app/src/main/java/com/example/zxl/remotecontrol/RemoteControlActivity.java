package com.example.zxl.remotecontrol;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class RemoteControlActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote_control);

        Fragment fragment;
        FragmentManager fm = getFragmentManager();
        fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (null == fragment) {
            fragment = new RemotControlFragment();
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
    }
}
