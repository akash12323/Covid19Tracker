package com.example.covid19.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.covid19.ui.fragment.ContactFragment
import com.example.covid19.ui.fragment.InformationFragment


class PagerAdapterDiscover(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position){
            0->{
                //now create three fragments
                ContactFragment()
            }
            else->{
                return InformationFragment()
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
            0->"CONTACT"
            else->{
                return "INFORMATION"
            }
        }
        //This method will set our tabs titles
    }
}