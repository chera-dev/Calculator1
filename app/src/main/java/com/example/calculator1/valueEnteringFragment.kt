package com.example.calculator1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.findNavController

class valueEnteringFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflate =  inflater.inflate(R.layout.fragment_value_entering, container, false)
        val num1:EditText = inflate.findViewById(R.id.editTextNumber)
        val num2:EditText = inflate.findViewById(R.id.editTextNumber2)
        val args = valueEnteringFragmentArgs.fromBundle(requireArguments())
        val actionButton:Button = inflate.findViewById(R.id.buttonResult)
        actionButton.text = args.operationName
        actionButton.setOnClickListener { view:View ->
            if(num1.text.toString().toFloatOrNull()!=null && num2.text.toString().toFloatOrNull()!=null)
            view.findNavController().navigate(valueEnteringFragmentDirections.
            actionValueEnteringFragmentToResultFragment(num1.text.toString().toFloatOrNull()!!
                ,num2.text.toString().toFloatOrNull()!!,actionButton.text.toString()))
            else
               Toast.makeText(getActivity(),"Enter number and try again",Toast.LENGTH_SHORT).show()}
        return inflate
    }
}