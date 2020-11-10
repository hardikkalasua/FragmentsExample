package com.example.fragmentsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class ProfileFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val profileNameTextView: TextView = view.findViewById(R.id.profileNameTextView)
        val name = arguments?.getString("name")
        name?.let {
            profileNameTextView.text = name
        }

        val profilePageBtn: Button = view.findViewById(R.id.profilepage_button)
        profilePageBtn.setOnClickListener {
            Toast.makeText(
                context,
                "Profile Page Button clicked!",
                Toast.LENGTH_SHORT).show()
        }
    }
}