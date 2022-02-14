package com.mabnets.ntsaapp.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mabnets.ntsaapp.R
import com.mabnets.ntsaapp.adapters.Chapteradapter
import com.mabnets.ntsaapp.databinding.FragmentMainBinding
import java.util.*


class Main : Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding =  FragmentMainBinding.bind(view)
        val tagList: ArrayList<String> = ArrayList()
        val someArray:Array<String> = requireContext().getResources().getStringArray(R.array.Chapters)
        for (i in 0 until someArray.size) {
           tagList.add(someArray[i])
        }
        binding.recyclerView.also { rv ->
            rv.layoutManager = LinearLayoutManager(requireContext())
            rv.setHasFixedSize(true)
            rv.adapter= Chapteradapter(tagList)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}