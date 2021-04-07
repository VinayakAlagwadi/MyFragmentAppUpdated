package com.example.myfragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*        buttonRed.setOnClickListener {

            var redFrag= RedFragment()
            var myManager:FragmentManager = supportFragmentManager
            var myTransactions:FragmentTransaction = myManager.beginTransaction()
            myTransactions.replace(R.id.fragment_Green,redFrag)
            myTransactions.commit()

        }
        buttonBlue.setOnClickListener {

            var blueFrag= BlueFragment()
            var myManager:FragmentManager = supportFragmentManager
            var myTransactions:FragmentTransaction = myManager.beginTransaction()
            myTransactions.replace(R.id.fragment_Green,blueFrag)
            myTransactions.commit()

        }*/



    }
}