package com.endika.horoscapp.ui.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.endika.horoscapp.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {

    //override fun onAttach(context: Context) { // Hay muchos metodos, como en javascript para html, onload o asi
    //    super.onAttach(context)
    //}

    private var _binding: FragmentHoroscopeBinding? =
        null //Se le pone _ a las variables a las que no queremos que se accedan

    //binding es val y como no se puede modificar no se puede romper, pero en _binding como es una variable se puede cambiar y podria romperse
    private val binding get() = _binding!! //Se sobre escribe el get de binding, esto es, cuando se quiera acceder o se acceda a binding se hara realmente a _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}