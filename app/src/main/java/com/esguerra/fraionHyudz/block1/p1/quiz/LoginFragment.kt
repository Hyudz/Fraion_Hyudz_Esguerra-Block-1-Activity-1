package com.esguerra.fraionHyudz.block1.p1.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.esguerra.fraionHyudz.block1.p1.quiz.databinding.FragmentLoginBinding
import com.esguerra.fraionHyudz.block1.p1.quiz.databinding.FragmentSignupBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        binding.signinBtn.setOnClickListener {

        }
        return binding.root

    }
}