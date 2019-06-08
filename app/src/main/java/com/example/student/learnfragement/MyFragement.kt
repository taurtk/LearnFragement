package com.example.student.learnfragement

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class MyFragement: Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootview = inflater.inflate(R.layout.my_fragement, container, false)
        val button=rootview.findViewById<Button>(R.id.flag_button)
        button.setOnClickListener {
            Toast.makeText(context,"working",Toast.LENGTH_LONG).show()
        }

        return rootview
    }

}