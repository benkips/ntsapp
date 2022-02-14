package com.mabnets.ntsaapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.mabnets.ntsaapp.R
import com.mabnets.ntsaapp.databinding.FragmentChapteroneBinding
import com.mabnets.ntsaapp.databinding.FragmentTrafficsignsBinding


class Trafficsigns : Fragment(R.layout.fragment_trafficsigns) {
    private var _binding: FragmentTrafficsignsBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding =  FragmentTrafficsignsBinding.bind(view)
        val adView = AdView(context)
        adView.adSize = AdSize.LARGE_BANNER
        adView.adUnitId = "ca-app-pub-4814079884774543/3840483252"
        val adRequest = AdRequest.Builder().build()
        binding.adViewone.loadAd(adRequest)
        binding.adViewtwo.loadAd(adRequest)
        binding.adViewthree.loadAd(adRequest)
        binding.adViewfour.loadAd(adRequest)
        binding.adViewfive.loadAd(adRequest)
        binding.adViewsix.loadAd(adRequest)
        binding.adViewseven.loadAd(adRequest)
        binding.adVieweight.loadAd(adRequest)
        binding.adViewnine.loadAd(adRequest)
        binding.adViewten.loadAd(adRequest)
        binding.adVieweleven.loadAd(adRequest)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}