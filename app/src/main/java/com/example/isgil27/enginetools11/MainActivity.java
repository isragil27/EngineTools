package com.example.isgil27.enginetools11;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.isgil27.enginetools11.Fragments.BibliografiaFragment;
import com.example.isgil27.enginetools11.Fragments.HerramientasFragment;
import com.example.isgil27.enginetools11.Fragments.RecursosFragment;
import com.example.isgil27.enginetools11.Menu.Acercade;
import com.example.isgil27.enginetools11.Menu.Feedback;
import com.example.isgil27.enginetools11.Menu.Info;


public class MainActivity extends AppCompatActivity {


    //Chaca comint
    /**
     *
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mimenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {


            case R.id.mFeedback:
                Intent intentAcerca= new Intent(getApplicationContext(),Feedback.class);
                startActivity(intentAcerca);
                break;

            case R.id.mAcercaDe:
                Intent intentAcerca1= new Intent(getApplicationContext(),Acercade.class);
                startActivity(intentAcerca1);break;
            case R.id.mInfo:
                Intent intentAcerca2= new Intent(getApplicationContext(),Info.class);
                startActivity(intentAcerca2);break;

        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */



   // public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */

     //   private static final String ARG_SECTION_NUMBER = "section_number";

       // public PlaceholderFragment() {
     //   }


        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
       // public static PlaceholderFragment newInstance(int sectionNumber) {
         //   PlaceholderFragment fragment = new PlaceholderFragment();
          //  Bundle args = new Bundle();
           // args.putInt(ARG_SECTION_NUMBER, sectionNumber);
           // fragment.setArguments(args);
        //    return fragment;
       // }

     //   @Override
      //  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             //    Bundle savedInstanceState) {
        //    View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        //    return rootView;
      //  }
    //}


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            //return PlaceholderFragment.newInstance(position + 1);

            switch (position) {
                case 0:
                    HerramientasFragment herramientasFragment = new HerramientasFragment();
                    return herramientasFragment;
                case 1:
                    RecursosFragment recursosFragment = new RecursosFragment();
                    return recursosFragment;
                case 2:
                    BibliografiaFragment bibliografiaFragment = new BibliografiaFragment();
                    return bibliografiaFragment;

            }
            return null;

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }
}
