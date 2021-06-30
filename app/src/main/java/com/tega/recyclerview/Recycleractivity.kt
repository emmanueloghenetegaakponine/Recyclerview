package com.tega.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.tega.recyclerview.adapter.countryadapter
import com.tega.recyclerview.databinding.ActivityMainBinding
import com.tega.recyclerview.databinding.ActivityRecycleractivityBinding
import com.tega.recyclerview.models.Country

class Recycleractivity : AppCompatActivity() {
    open class adapter<T> {

    }

    private lateinit var binding: ActivityRecycleractivityBinding
    private lateinit var mycountryadapter: countryadapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleractivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countries: List<Country> = listOf(
            Country(
                R.drawable.ic_brazilflag,
                "Brazil",
            "South America",
            12L
            ),
                    Country(
                    R.drawable.ic_nigeriaflag,
                 "Nigeria",
                    "Africa",
                        8L
                    ),

            Country(
                R.drawable.ic_usflag,
                "United States America",
                "South America",
                12L

            ),

            Country(
                R.drawable.ic_uk_flag,
                "United Kingdom",
                "Europe",
                10L
            ),
            Country(
                R.drawable.ic_chinese,
                "China",
                "Asia",
                18L
            )
        )
    mycountryadapter = countryadapter(countries)
            binding.recyclerView.adapter = mycountryadapter



    }
}