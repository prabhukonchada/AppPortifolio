package com.prabhukonchada.appportifolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Prabhu Konchada on 25/03/16
 * for FanStation
 * you can contact me at : prabhukonchada@gmail.com
 * git lab link for more details on the project : https://github.com/prabhukonchada/AppPortifolio
 * or visit www.prabhukonchada.com
 */

public class MainActivity extends AppCompatActivity {

    TextView headerTitle;
    Button openPopularMoviesApp;
    Button openStockHawkApp;
    Button openBuildItBiggerApp;
    Button openMakeYourAppMaterialApp;
    Button openGoUbiquitousApp;
    Button openCapstoneApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // To initialise components used in the activity
        initComponents();

        // Set component titles programatically
        setComponentTitlesProgramatically();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /***
     * Initialize components  used in the activity
     */
    public void initComponents()
    {
        headerTitle = (TextView)findViewById(R.id.headerText);
        openPopularMoviesApp = (Button)findViewById(R.id.popularMoviesRedirectionButton);
        openBuildItBiggerApp = (Button)findViewById(R.id.buildItBiggerRedirectionButton);
        openStockHawkApp = (Button)findViewById(R.id.stockHawkRedirectionButton);
        openGoUbiquitousApp = (Button)findViewById(R.id.goUbiquitousRedirectionButton);
        openCapstoneApp = (Button)findViewById(R.id.capstoneRedirectionButton);
        openMakeYourAppMaterialApp = (Button)findViewById(R.id.makeYourAppMaterialRedirectionButton);
    }

    /***
     * Set titles programatically for the layout elements.
     */
    public void setComponentTitlesProgramatically()
    {
        headerTitle.setText("My Awesome Apps !");
        openPopularMoviesApp.setText("Popular Movies");
        openBuildItBiggerApp.setText("Build It Bigger");
        openStockHawkApp.setText("Stock Hawk");
        openGoUbiquitousApp.setText("Go Ubiquitous");
        openMakeYourAppMaterialApp.setText("Make Your App Material");
        openCapstoneApp.setText("Capstone App");
    }

}
