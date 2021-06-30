package com.tega.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tega.recyclerview.Recycleractivity
import com.tega.recyclerview.databinding.CountryItemBinding
import com.tega.recyclerview.models.Country

class countryadapter (val countries: List<Country>) : RecyclerView.Adapter<countryadapter.CountryViewHolder>(){

    class CountryViewHolder(var binding: CountryItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(country: Country) {
            binding.continent.text = country.continent
            binding.countryname.text = country.name
            binding.population.text = country.population.toString()
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var binding = CountryItemBinding.inflate(LayoutInflater.from(parent.context))
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
       val country = countries[position]
        holder.bind(country)
    }

    override fun getItemCount(): Int {
    return countries.size
    }
}