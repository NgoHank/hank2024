package vn.edu.usth.weather.Fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import vn.edu.usth.weather.ViewPager.HaNoiFragment;
import vn.edu.usth.weather.ViewPager.BrazilFragment;
import vn.edu.usth.weather.ViewPager.SpainFragment;

public class WeatherAdapter extends FragmentPagerAdapter {

    public WeatherAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new WeatherAndForecastFragment();
            case 1:
                return new HaNoiFragment();
            case 2:
                return new BrazilFragment();
            case 3:
                return new SpainFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}