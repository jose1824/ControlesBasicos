package com.example.pc_.controlesbasicos;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    String TAG = "MainActivity";
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Titulo de mi toolbar");
        toolbar.setSubtitle("Subtitulo :3");
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        tabLayout = (TabLayout) findViewById(R.id.main_TabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Pestaña 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Pestaña 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Pestaña 3 "));



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nuevo_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.opc1:
                Toast.makeText(MainActivity.this, "Opcion 1", Toast.LENGTH_LONG).show();
                return true;
            case R.id.opc2:
                Log.e(TAG, "onOptionsItemSelected: " + "opcion 2");
                return true;
            case R.id.opc3:
                Log.i(TAG, "onOptionsItemSelected: " + "opcion 3");
                break;
            case R.id.opc4:
                Log.d(TAG, "onOptionsItemSelected: " + "opcion 4");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
