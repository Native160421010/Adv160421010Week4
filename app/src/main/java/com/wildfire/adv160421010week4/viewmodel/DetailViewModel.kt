package com.wildfire.adv160421010week4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wildfire.adv160421010week4.model.Student

class DetailViewModel: ViewModel() {
    val studentLD = MutableLiveData<Student>()

    fun fetch() {
        val student1 = Student("16055","Nonie","1998/03/28","5718444778",
            "http://dummyimage.com/75x100.jpg/cc0000/ffffff")
        studentLD.value = student1
    }

    // lihat studentlist frag sbg referensi
    // ke studentdetail fragment (on view created)
    // ubah fragment_student_detail dgn student list detail bla bla bla

}