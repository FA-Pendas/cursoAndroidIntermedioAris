package com.endika.horoscapp.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.endika.horoscapp.R
import com.endika.horoscapp.databinding.FragmentLuckBinding
import com.endika.horoscapp.databinding.FragmentPalmistryBinding

class PalmistryFragment : Fragment() {


    //Se le pone _ a las variables a las que no queremos que se accedan
    private var _binding: FragmentPalmistryBinding? = null

    //binding es val y como no se puede modificar no se puede romper, pero en _binding como es una variable se puede cambiar y podria romperse
    private val binding get() = _binding!! //Se sobre escribe el get de binding, esto es, cuando se quiera acceder o se acceda a binding se hara realmente a _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPalmistryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}