package com.example.myfragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.blue_frag.view.*

class BlueFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        var v = inflater.inflate(R.layout.blue_frag,container,false)
        v.buttonblue2.setOnClickListener {

            var un= v.findViewById(R.id.editTextlogin)as EditText
            var pwd = v.findViewById(R.id.editTextpwd) as EditText
            var redFrag=RedFragment()

            //var myname= "JAI"
            var b = Bundle()

            b.putString("key1", un.text.toString())

            b.putString("key2", pwd.text.toString())

            redFrag.arguments=b

            fragmentManager!!.beginTransaction().replace(R.id.yellow_layout,redFrag).commit()
        }
        return v
    }
}