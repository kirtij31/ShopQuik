package com.kirti.ecommerceapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kirti.ecommerceapplication.R
import com.kirti.ecommerceapplication.adapter.TabLayoutAdapter
import com.kirti.ecommerceapplication.databinding.ActivityLogInBinding
import com.kirti.ecommerceapplication.fragment.LogInFragment
import com.kirti.ecommerceapplication.fragment.SignUpFragment

class LogInActivity : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Ecommerceapp_Light)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = TabLayoutAdapter(supportFragmentManager)
        adapter.addFragment(LogInFragment(),"Log In")
        adapter.addFragment(SignUpFragment(),"Sign Up")
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
        /*  tabLayout.getTabAt(0)?.setIcon(R.drawable.vector_card)
          tabLayout.getTabAt(1)?.setIcon(R.drawable.vector_card)
  */
    }

}