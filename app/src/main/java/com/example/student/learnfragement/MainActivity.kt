package com.example.student.learnfragement

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.Button
import android.widget.Toast


class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn= findViewById<Button>(R.id.button)
       var i=1
        btn.setOnClickListener {

            val fragementManager = supportFragmentManager
            val fragementTransition = fragementManager.beginTransaction()
            val firstFragement = MyFragement()
            val secondFragement = second_fragment()
            if (i % 2 == 0) {
                fragementTransition.replace(R.id.frag_one, secondFragement)
                fragementTransition.addToBackStack(null)
                fragementTransition.commit()

            } else {
                fragementTransition.replace(R.id.frag_one, firstFragement)
                fragementTransition.addToBackStack(null)
                fragementTransition.commit()

            }
            i++;
        }

    }
}
