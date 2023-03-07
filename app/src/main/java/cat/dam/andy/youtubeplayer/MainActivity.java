package cat.dam.andy.youtubeplayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import cat.dam.andy.youtubeplayer.R;

import cat.dam.andy.youtubeplayer.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {
    //Thanks to https://github.com/tmshih/YouTubePlayer
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(view -> Snackbar.make(view, "Canvia-la per la teva funció", Snackbar.LENGTH_LONG)
                .setAction("Funció", null).show());
    }
}