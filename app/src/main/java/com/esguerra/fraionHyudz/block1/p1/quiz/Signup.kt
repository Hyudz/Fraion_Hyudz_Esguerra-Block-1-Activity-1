package com.esguerra.fraionHyudz.block1.p1.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.esguerra.fraionHyudz.block1.p1.quiz.databinding.ActivityMainBinding
import com.esguerra.fraionHyudz.block1.p1.quiz.databinding.FragmentSignupBinding


class Signup : Fragment() {

    private lateinit var binding: FragmentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignupBinding.inflate(inflater,container,false)
        binding.signupBtn.setOnClickListener {
            findNavController().navigate(SignupDirections.actionSignup3ToLoginFragment())
        }
        return binding.root

    }
    }