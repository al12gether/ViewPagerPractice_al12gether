package com.example.viewpagerpractice_al12gether

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice_al12gether.fagments.GreetingFragments
import com.example.viewpagerpractice_al12gether.fagments.MyinfoFragments
import com.example.viewpagerpractice_al12gether.fagments.NameFragments

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when (position) {
            0 -> "이름"
            1 -> "내 정보"
            else -> "인사말"
        }

    }

    override fun getCount(): Int {
        return   3
    }

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> NameFragments()
            1 -> MyinfoFragments()
            else -> GreetingFragments()
        }

}


}