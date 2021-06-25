package com.example.calculator1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController


class OptionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflate = inflater.inflate(R.layout.fragment_options, container, false)
        val buttonAdd:Button = inflate.findViewById(R.id.buttonAdd)
        buttonAdd.setOnClickListener { view:View -> view.findNavController().navigate(OptionsFragmentDirections.actionOptionsFragmentToValueEnteringFragment(buttonAdd.text.toString())) }
        val buttonSub:Button = inflate.findViewById(R.id.buttonSub)
        buttonSub.setOnClickListener {view:View -> view.findNavController().navigate(OptionsFragmentDirections.actionOptionsFragmentToValueEnteringFragment(buttonSub.text.toString()))}
        val buttonMultiply:Button = inflate.findViewById(R.id.buttonMultiply)
        buttonMultiply.setOnClickListener { view:View -> view.findNavController().navigate(OptionsFragmentDirections.actionOptionsFragmentToValueEnteringFragment(buttonMultiply.text.toString())) }
        val buttonDivide:Button = inflate.findViewById(R.id.buttonDivide)
        buttonDivide.setOnClickListener {view:View -> view.findNavController().navigate(OptionsFragmentDirections.actionOptionsFragmentToValueEnteringFragment(buttonDivide.text.toString())) }
        return inflate
    }
}