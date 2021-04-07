package com.example.myfragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            var redFrag=RedFragment()
            var myname= "JAI"
            var b = Bundle()
            b.putString("key",myname)
            redFrag.arguments=b

            fragmentManager!!.beginTransaction().replace(R.id.yellow_layout,redFrag).commit()
        }
        return v
    }
}