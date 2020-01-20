package com.tds.shopping.Adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.tds.shopping.R
import com.tds.shopping.model.Country

class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var countryName = itemView.findViewById<TextView>(R.id.country_name)
    var countryImage = itemView.findViewById<ImageView>(R.id.country_image)
}

class CountryAdapter(var countryList: ArrayList<Country>) :
    RecyclerView.Adapter<CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.search_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.countryName.text = countryList[position].name
        holder.countryImage.setImageResource(countryList[position].image)

    }

}