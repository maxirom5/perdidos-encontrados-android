package ies.tsds.perdidos.encontrados.controller;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    int numftabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm,behavior);
        this.numftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Perdidos();
            case 1:
                return new Encontrados();
            case 2:
                return new Adopcion();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numftabs;
    }
}
