package com.example.bibilili;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.bibilili.base.BaseFragment;
import com.example.bibilili.fragments.AnimalFragment;
import com.example.bibilili.fragments.CartoonFragment;
import com.example.bibilili.fragments.DishFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager=getSupportFragmentManager();
    private BaseFragment[] fragments={new AnimalFragment(),new DishFragment(),new CartoonFragment()};


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                  changeFragment(0);
                    return true;
                case R.id.navigation_dashboard:
                   changeFragment(1);
                    return true;
                case R.id.navigation_notifications:
                   changeFragment(2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        initFragmnet();
        }
    private void initFragmnet() {
            for (int i=0;i<3;i++) {
                fragmentManager.beginTransaction().add(R.id.fragment_container, fragments[i]).commit();
             }
        }
    private void changeFragment(int position){
            fragmentManager.beginTransaction().replace(R.id.fragment_container,fragments[position]).commit();
        }
    }





