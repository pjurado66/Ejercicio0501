package com.pjurado.ejercicio0501

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pjurado.ejercicio0501.databinding.FragmentMenuBinding


class MenuFragment : Fragment(R.layout.fragment_menu) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentMenuBinding.bind(view).apply {
            madrid?.setOnClickListener {
                (activity as MainActivity).cargaFragment(1)
            }
            paris?.setOnClickListener {
                (activity as MainActivity).cargaFragment(2)
            }
            munich?.setOnClickListener {
                (activity as MainActivity).cargaFragment(3)
            }
        }
    }
}