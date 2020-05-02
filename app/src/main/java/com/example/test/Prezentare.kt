package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.core.content.ContextCompat
import com.example.test.R
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.test.databinding.FragmentPrezentareBinding


/**
 * A simple [Fragment] subclass.
 */
class Prezentare : Fragment() {
     override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
       val binding : FragmentPrezentareBinding = DataBindingUtil.inflate(
           inflater, R.layout.fragment_prezentare, container, false)

        binding.button5.setOnClickListener{view: View ->
            Navigation.findNavController(view).navigate(R.id.action_prezentare_to_detalii)
        }
        return binding.root
    }

}
