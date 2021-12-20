package com.example.viewpagerpractice_jaewhi.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice_jaewhi.fragments.GreetingsFragment
import com.example.viewpagerpractice_jaewhi.fragments.MyinfoFragment
import com.example.viewpagerpractice_jaewhi.fragments.NameFragment

// FragmentPagerAdapter는 기본 생성자를 지원하지 않기 때문에 주 생성자를 커스터마이징한다.
class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
//  뷰페이저에 몇장을 보여줄거니~?
    override fun getCount(): Int {
        return 3
    }
//  position(위치)에 따라 무슨 Fragment를 보여줄거니~?
    override fun getItem(position: Int): Fragment {
//      각각의 Fragment를 기본생성자를 이용해 객체화해서 반환해준다.
        if (position == 0){
            return NameFragment()
        }
        else if (position == 1){
            return MyinfoFragment()
        }
        else{
            return GreetingsFragment()
        }

    }

}