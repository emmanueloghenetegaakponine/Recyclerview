package com.tega.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.tega.recyclerview.databinding.ActivityMainBinding
import com.tega.recyclerview.databinding.ActivityRecycleractivityBinding

class Recycleractivity : AppCompatActivity() {
    open class adapter<T> {

    }

    private lateinit var binding: ActivityRecycleractivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleractivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}