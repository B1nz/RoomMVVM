package com.example.roommvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roommvvm.fragment.NameListFragment
import com.example.roommvvm.fragment.NewNameFragment
import timber.log.Timber

class MainActivity : AppCompatActivity(),

//    inisiasi untuk penggunaan fungsi fragment

    NewNameFragment.OnFragmentInteractionListener,
    NameListFragment.OnFragmentInteractionListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        pada fungsi if ini digunakan untuk mengatur default untuk menjalankan program fungsi menampilkan fragmen list nama mahasiswa

        if (savedInstanceState == null) {
            goToStudentListFragment()
        }

        Timber.plant(Timber.DebugTree())
    }

//    fungsi ini berfungsi untuk merubah fragment menjadi halaman untuk menampilkan list nama mahasiswa

    override fun goToStudentListFragment() {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.flContent, NameListFragment.newInstance())
        transaction.commit()
    }

//    fungsi ini berfungsi untuk merubah fragment menjadi halaman untuk menambahkan nama mahasiswa

    override fun goToNewNameFragment() {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.flContent, NewNameFragment.newInstance())
        transaction.commit()
    }
}
