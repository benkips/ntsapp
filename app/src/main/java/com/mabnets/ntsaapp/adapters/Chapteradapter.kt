package com.mabnets.ntsaapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.mabnets.ntsaapp.R
import com.mabnets.ntsaapp.databinding.ChaptersinfBinding
import java.util.ArrayList

class Chapteradapter(val alist:ArrayList<String>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    private val AD_TYPE = 1
    private val DEFAULT_VIEW_TYPE = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == AD_TYPE) {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.banner_ad,
                parent,
                false
            )
            return adholderc(view)
        } else {
            val binding =
                ChaptersinfBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ChapterViewHolder(binding)
        }
    }
    override fun getItemCount(): Int {
        var itemCount: Int = alist.size
        itemCount += itemCount / 5
        return itemCount
    }

    override fun getItemViewType(position: Int): Int {
        return if (position > 1 && position % 5 == 0) {
            AD_TYPE
        } else DEFAULT_VIEW_TYPE
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder !is ChapterViewHolder) {
            return
        }
        val itemPosition = position - position / 5
        val currentitem=alist[itemPosition]
        if(currentitem!=null){
            holder.bind(currentitem)
        }

    }
    class ChapterViewHolder(val binding:ChaptersinfBinding) :RecyclerView.ViewHolder(binding.root){
        fun bind(chapter:String) {
            binding.txtone.text=chapter
            binding.cv.setOnClickListener {
                if(chapter.contains("INTRODUCTION TO DRIVING")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapterone
                    )
                }else if(chapter.contains("FUNDAMENTAL DRIVING RULES")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chaptertwo
                    )
                }else  if(chapter.contains("MODEL TOWN")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapterthree
                    )
                }else if(chapter.contains("HUMAN FACTORS IN TRAFFIC")){
                    Navigation.findNavController(it).navigate(
                    R.id.action_main_to_chapterfour
                    )
                }else if(chapter.contains("VEHICLE CONSTRUCTIONS AND CONTROLS")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapterfive
                    )
                }else  if(chapter.contains("SELF - INSPECTION OF VEHICLE")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chaptersix
                    )
                }else if(chapter.contains("OBSERVATION")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapterseven
                    )
                }else if(chapter.contains("VEHICLE CONTROL")){
                    Navigation.findNavController(it).navigate(
                       R.id.action_main_to_chaptereight
                    )
                }else if(chapter.contains("COMMUNICATION ON THE ROAD")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapternine
                    )
                }else if(chapter.contains("SPEED MANAGEMENT")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapterten
                    )
                }else if(chapter.contains("SPACE MANAGEMENT")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chaptereleven
                    )
                }else if(chapter.contains("EMERGENCY MANOEUVRES")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chaptertwelve
                    )
                }else if(chapter.contains("SKID CONTROL AND RECOVERY")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapterthirteen
                    )
                }else if(chapter.contains("ADVERSE DRIVING CONDITIONS")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapterfourteen
                    )
                }else if(chapter.contains("PREVENTIVE MAINTENANCE")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapterfifteen
                    )
                }else if(chapter.contains("CONDITIONS OF CARRIAGE")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chaptersixteen
                    )
                }else if(chapter.contains("HAZARDOUS MATERIALS")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapterseventeen
                    )
                }else if(chapter.contains("EMERGENCY PROCEDURES")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chaptereighteen
                    )
                }else if(chapter.contains("WORK PLANNING")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chapternineteen
                    )
                }else if(chapter.contains("CUSTOMER CARE")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chaptertwenty
                    )
                }else if(chapter.contains("THE EXAMINATION")){
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_chaptertwentyone
                    )
                }else{
                    Navigation.findNavController(it).navigate(
                        R.id.action_main_to_trafficsigns
                    )
                }

            }

        }
    }

    inner class adholderc(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private lateinit var adView: AdView
        private lateinit var linearbanner: LinearLayout

        init {
            adView = AdView(itemView.context)
            linearbanner = itemView.findViewById(R.id.banner_container)
            linearbanner.addView(adView)
            adView.adUnitId = "ca-app-pub-4814079884774543/3840483252"

            adView.adSize = AdSize.SMART_BANNER
            val adRequest = AdRequest
                .Builder()
                .build()
            // Start loading the ad in the background.
            adView.loadAd(adRequest)
        }


    }



}