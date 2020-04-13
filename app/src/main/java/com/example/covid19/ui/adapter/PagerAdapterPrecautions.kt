package com.example.covid19.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.covid19.ui.fragment.AdviceFragment
import com.example.covid19.ui.fragment.MythbusterFragment

class PagerAdapterPrecautions(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position){
            0-> AdviceFragment()
            else->{
                return MythbusterFragment()
            }
            //This method is used for setting our tabs position
        }
    }

    override fun getCount(): Int {
        return 2
        //This method will return 3 tabs
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->"ADVICE"
            else->{
                return "MYTH-BUSTER"
            }
        }
        //This method will set our tabs titles
    }
}