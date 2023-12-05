package com.esguerra.fraionHyudz.block1.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.esguerra.fraionHyudz.block1.p1.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.navigation)
        return navController.navigateUp()
    }
}