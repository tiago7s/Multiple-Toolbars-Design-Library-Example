package com.salvador.testdesignlibrary;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private MainActivityFragment mainActivityFragment;
    private SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityFragment = (MainActivityFragment) getSupportFragmentManager().findFragmentByTag("main");
        if (mainActivityFragment == null) {
            mainActivityFragment = new MainActivityFragment();
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainActivityFragment).addToBackStack(null).commit();

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_drawer);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }


    }

    public void setToolbar(Toolbar toolbar) {
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();

                        switch (menuItem.getItemId()) {
                            case R.id.nav_first:
                                mainActivityFragment = (MainActivityFragment) getSupportFragmentManager().findFragmentByTag("main");
                                if (mainActivityFragment == null) {
                                    mainActivityFragment = new MainActivityFragment();
                                }

                                getSupportFragmentManager().beginTransaction().replace(R.id.container, mainActivityFragment).addToBackStack(null).commit();
                                break;
                            case R.id.nav_second:

                                secondFragment = (SecondFragment) getSupportFragmentManager().findFragmentByTag("second");
                                if (secondFragment == null) {
                                    secondFragment = new SecondFragment();
                                }

                                getSupportFragmentManager().beginTransaction().replace(R.id.container, secondFragment).addToBackStack(null).commit();
                                break;
                        }
                        return true;
                    }
                });
    }
}
