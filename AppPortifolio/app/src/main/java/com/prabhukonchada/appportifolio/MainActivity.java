package com.prabhukonchada.appportifolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /***
     * The following method openApplication() would redirect to the appropriate app once developed.
     * At present it displays a toast message appropriately.
     * @param contentView Based on the view passed the redirection takes place.
     */
    public void openApplication(View contentView)
    {
        switch (contentView.getId())
        {
            case R.id.popularMoviesRedirectionButton:
                Toast.makeText(this, R.string.app_popular_movies, Toast.LENGTH_LONG).show();
                break;
            case R.id.buildItBiggerRedirectionButton:
                Toast.makeText(this, R.string.app_build_it_bigger, Toast.LENGTH_LONG).show();
                break;
            case R.id.makeYourAppMaterialRedirectionButton:
                Toast.makeText(this, R.string.app_make_it_material, Toast.LENGTH_LONG).show();
                break;
            case R.id.stockHawkRedirectionButton:
                Toast.makeText(this, R.string.app_stock_hawk, Toast.LENGTH_LONG).show();
                break;
            case R.id.goUbiquitousRedirectionButton:
                Toast.makeText(this, R.string.app_ubiquitous, Toast.LENGTH_LONG).show();
                break;
            case R.id.capstoneRedirectionButton:
                Toast.makeText(this, R.string.app_capstone, Toast.LENGTH_LONG).show();
                break;
        }
    }

}
