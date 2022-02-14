package com.mabnets.ntsaapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.mabnets.ntsaapp.R
import com.mabnets.ntsaapp.databinding.FragmentChapteroneBinding
import com.mabnets.ntsaapp.databinding.FragmentChaptertwentyoneBinding


class chaptertwentyone : Fragment(R.layout.fragment_chaptertwentyone) {
    private var _binding: FragmentChaptertwentyoneBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding =  FragmentChaptertwentyoneBinding.bind(view)
        val adView = AdView(context)
        adView.adSize = AdSize.LARGE_BANNER
        adView.adUnitId = "ca-app-pub-4814079884774543/3840483252"
        val adRequest = AdRequest.Builder().build()
        binding.adViewone.loadAd(adRequest)
        binding.sts.setOnClickListener {
            Navigation.findNavController(it).navigate(
                R.id.action_chaptertwentyone_to_trafficsigns
            )
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}