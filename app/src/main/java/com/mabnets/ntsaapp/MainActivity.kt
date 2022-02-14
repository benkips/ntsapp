package com.mabnets.ntsaapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.google.android.gms.ads.MobileAds
import com.mabnets.ntsaapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration
    private  lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        MobileAds.initialize(this) {}
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        navController = findNavController(R.id.nav_host_fragment_content_index)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.main
            )
        )
        toolbar.setupWithNavController(navController,appBarConfiguration)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if(destination.id == R.id.launcher) {
                toolbar.visibility = View.GONE
            }else{
                toolbar.visibility = View.VISIBLE
            }
        }

    }

}