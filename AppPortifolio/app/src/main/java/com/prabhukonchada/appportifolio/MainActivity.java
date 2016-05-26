package com.prabhukonchada.appportifolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Prabhu Konchada on 25/03/16
 * for FanStation
 * you can contact me at : prabhukonchada@gmail.com
 * git lab link for more details on the project : https://github.com/prabhukonchada/AppPortifolio
 * or visit www.prabhukonchada.com
 */

public class MainActivity extends AppCompatActivity {

    TextView headerTitle;
    Button openPopularMoviesAppBtn;
    Button openStockHawkAppBtn;
    Button openBuildItBiggerAppBtn;
    Button openMakeYourAppMaterialAppBtn;
    Button openGoUbiquitousAppBtn;
    Button openCapstoneAppBtn;

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

    /***
     * Initialize components  used in the activity
     */
    public void initComponents()
    {
        headerTitle = (TextView)findViewById(R.id.headerText);
        openPopularMoviesAppBtn = (Button)findViewById(R.id.popularMoviesRedirectionButton);
        openBuildItBiggerAppBtn = (Button)findViewById(R.id.buildItBiggerRedirectionButton);
        openStockHawkAppBtn = (Button)findViewById(R.id.stockHawkRedirectionButton);
        openGoUbiquitousAppBtn = (Button)findViewById(R.id.goUbiquitousRedirectionButton);
        openCapstoneAppBtn = (Button)findViewById(R.id.capstoneRedirectionButton);
        openMakeYourAppMaterialAppBtn = (Button)findViewById(R.id.makeYourAppMaterialRedirectionButton);
    }

    /***
     * Set titles programatically for the layout elements.
     */
    public void setComponentTitlesProgramatically()
    {
        headerTitle.setText(R.string.app_header);
        openPopularMoviesAppBtn.setText(R.string.app_popular_movies_button);
        openBuildItBiggerAppBtn.setText(R.string.app_build_it_bigger);
        openStockHawkAppBtn.setText(R.string.app_stock_hawk);
        openGoUbiquitousAppBtn.setText(R.string.app_ubiquitous);
        openMakeYourAppMaterialAppBtn.setText(R.string.app_make_it_material);
        openCapstoneAppBtn.setText(R.string.app_capstone);
    }

    /***
     * The following methods with open*() would redirect to the appropriate app once developed.
     * At present it displays a toast message appropriately.
     * @param contentView The view where action is defined is passed automatically
     */
    public void openPopularMoviesApp(View contentView)
    {
        Toast.makeText(this, returnTextForToast(getResources().getString(R.string.app_popular_movies_button)), Toast.LENGTH_LONG).show();
    }

    public void openStockHawkApp(View contentView)
    {
        Toast.makeText(this, returnTextForToast(getResources().getString(R.string.app_stock_hawk)), Toast.LENGTH_LONG).show();
    }

    public void openGoUbiquitousApp(View contentView)
    {
        Toast.makeText(this, returnTextForToast(getResources().getString(R.string.app_ubiquitous)), Toast.LENGTH_LONG).show();
    }

    public void openBuildItBiggerApp(View contentView)
    {
        Toast.makeText(this, returnTextForToast(getResources().getString(R.string.app_build_it_bigger)), Toast.LENGTH_LONG).show();
    }

    public void openMakeYourAppMaterialApp(View contentView)
    {
        Toast.makeText(this, returnTextForToast(getResources().getString(R.string.app_make_it_material)), Toast.LENGTH_LONG).show();
    }

    public void openCapstoneApp(View contentView)
    {
        Toast.makeText(this, returnTextForToast(getResources().getString(R.string.app_capstone)), Toast.LENGTH_LONG).show();
    }

    /***
     * This method used to form string message
     * @param appName Application name that is to be launched
     * @return Toast Message
     */
    public String returnTextForToast(String appName)
    {
        return ("This button will launch my ".concat(appName).concat(" App"));
    }
}
