package com.wdx.app.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wdx.app.databinding.FragmentHomeBinding
import com.wdx.domain.Status
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {
    private val vm: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vm.getConfig().observe(viewLifecycleOwner) {
            when (it.status) {
                Status.LOADING -> Log.e("getConfig()", "getConfig() - loading")
                Status.SUCCESS -> Log.e(
                    "getConfig()",
                    "getConfig() - success ${it.data?.result?.FAQ ?: "No Data"}"
                )
                Status.ERROR -> Log.e(
                    "getConfig()",
                    "getConfig() - error ${it.message ?: ""}"
                )
            }
        }
    }
}