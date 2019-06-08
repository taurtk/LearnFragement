package com.example.student.learnfragement

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class second_fragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootview =inflater.inflate(R.layout.second_fragment,container,false)
        val btn = rootview.findViewById<Button>(R.id.button1)
        btn.setOnClickListener {
            Toast.makeText(context,"very well done",Toast.LENGTH_LONG).show()
        }
        return rootview
    }
}