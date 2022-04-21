package com.example.viewpagerpractice_al12gether

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice_al12gether.fagments.GreetingFragments
import com.example.viewpagerpractice_al12gether.fagments.MyinfoFragments
import com.example.viewpagerpractice_al12gether.fagments.NameFragments

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0) {
            return "이름"
        }
        else if (position == 1) {
            return "내 정보"
        }
        else {
            return  "인사말"
        }}

    override fun getCount(): Int {
        return   3
    }

    override fun getItem(position: Int): Fragment {
      if (position ==0) {
          return NameFragments()
    }
      else if (position ==1)  {
          return MyinfoFragments()
      }
      else {
          return GreetingFragments()
      }

}


}