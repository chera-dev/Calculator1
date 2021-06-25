package com.example.calculator1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController


class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflate = inflater.inflate(R.layout.fragment_result, container, false)
        val args = ResultFragmentArgs.fromBundle(requireArguments())
        val result = getResult(args.num1,args.num2,args.action)
        inflate.findViewById<TextView>(R.id.textViewresult).text = "Action :  ${args.action}\nInput1 :  ${args.num1}\nInput2 :  ${args.num2}\nResult :  $result"
        inflate.findViewById<Button>(R.id.buttonReset).setOnClickListener {
            view:View -> view.findNavController().navigate(ResultFragmentDirections.actionResultFragmentToOptionsFragment())
        }
        return inflate
    }
    fun getResult(num1: Float, num2: Float, action: String) :Float{
        return when(action){
            "ADDITION" -> num1+num2
            "SUB" -> num1-num2
            "MULTIPLY" -> num1*num2
            else -> num1/num2
        }
    }

}