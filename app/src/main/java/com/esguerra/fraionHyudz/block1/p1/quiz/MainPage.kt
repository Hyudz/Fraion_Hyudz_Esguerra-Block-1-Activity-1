package com.esguerra.fraionHyudz.block1.p1.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.esguerra.fraionHyudz.block1.p1.quiz.databinding.FragmentMainPageBinding
import com.esguerra.fraionHyudz.block1.p1.quiz.databinding.FragmentSignupBinding

class MainPage : Fragment() {
    private lateinit var binding: FragmentMainPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainPageBinding.inflate(inflater,container,false)
        return binding.root

    }

}