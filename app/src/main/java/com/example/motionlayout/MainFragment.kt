package com.example.motionlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.motionlayout.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.btnNavigateLogin.setOnClickListener { findNavController().navigate(R.id.action_mainFragment_to_loginFragment) }
        binding.btnNavigateScene1.setOnClickListener { findNavController().navigate(R.id.action_mainFragment_to_basicSceneFragment) }
        binding.btnNavigateScene2.setOnClickListener { findNavController().navigate(R.id.action_mainFragment_to_KeyAttributesFragment) }
        binding.btnNavigateCollapsingHeader.setOnClickListener { findNavController().navigate(R.id.action_mainFragment_to_CollapsingHeaderFragment) }
        return binding.root
    }

}