package com.wildfire.adv160421010week4.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.wildfire.adv160421010week4.databinding.FragmentStudentDetailBinding
import com.wildfire.adv160421010week4.model.Student
import com.wildfire.adv160421010week4.viewmodel.DetailViewModel
//import com.squareup.picasso.Picasso

class StudentDetailFragment : Fragment() {
    private lateinit var viewModel: DetailViewModel
    private lateinit var binding: FragmentStudentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStudentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        viewModel.fetch()

        viewModel.studentLD.observe(viewLifecycleOwner, Observer { student ->
            updateUI(student)
        })
    }

    private fun updateUI(student: Student) {
        // Picasso.get().load(student.photoUrl).into(binding.imgView)
        binding.txtID.setText(student.id)
        binding.txtName.setText(student.name)
        binding.txtBod.setText(student.bod)
        binding.txtPhone.setText(student.phone)
    }
}