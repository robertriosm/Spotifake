package com.example.spotifake

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Library : Fragment(R.layout.fragment_library) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var addBtn: ImageButton = view.findViewById(R.id.addSongBtn)
        var songTxt: TextView = view.findViewById(R.id.songsliked)
        var counter = 0

        addBtn.setOnClickListener {
            counter++
            songTxt.setText(counter.toString() + " songs.")
        }

    }

}