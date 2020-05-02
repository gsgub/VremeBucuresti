package com.example.test
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.test.databinding.FragmentDetaliiBinding



class Detalii : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentDetaliiBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_detalii, container, false
        )

        binding.button.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_detalii_to_vremea) }
        binding.button2.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_detalii_to_poze)}
        binding.button3.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_detalii_to_zar)}
        return binding.root
    }
}
