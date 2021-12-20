package com.example.viewpagerpractice_jaewhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagerpractice_jaewhi.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//  나중에 찐으로 담아줄께 약속만 해두고 onCreate{}안에서 실제로 객체화해서 담아주자.
    lateinit var mViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
//      activity_main 내의 mainViewPager의 어댑터는 mViewPagerAdapter로 동작할거야.
        mainViewPager.adapter = mViewPagerAdapter
//      페이지 수가 많아지면 간단하게 부드럽도록 지원하는 기능.
        mainViewPager.offscreenPageLimit = 5
    }
}