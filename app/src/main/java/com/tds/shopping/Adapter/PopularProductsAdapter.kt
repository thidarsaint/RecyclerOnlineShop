package com.tds.shopping.Adapter

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tds.shopping.R
import com.tds.shopping.model.PopularProducts

class PopularProductsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var popularName = itemView.findViewById<TextView>(R.id.item_type)
    var popularBrand = itemView.findViewById<TextView>(R.id.item_brand)
    var popularImage = itemView.findViewById<ImageView>(R.id.brand_image)
    var popularNewPrice = itemView.findViewById<TextView>(R.id.new_price)
    var popularOldPrice = itemView.findViewById<TextView>(R.id.popular_old_price)
    var popularOldKs = itemView.findViewById<TextView>(R.id.old_price_ks)
}

class PopularProductsAdapter(var popularList: ArrayList<PopularProducts>): RecyclerView.Adapter<PopularProductsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularProductsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.popular_products, parent, false)
        return PopularProductsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularList.size
    }

    override fun onBindViewHolder(holder: PopularProductsViewHolder, position: Int) {
        holder.popularName.text = popularList[position].popularName
        holder.popularBrand.text = popularList[position].popularBrand
        holder.popularNewPrice.text = popularList[position].popularNewPrice.toString()
        if(popularList[position].popularOldPrice > 0){
            holder.popularOldPrice.text = popularList[position].popularOldPrice.toString()
            holder.popularOldKs.text = "KS"

        }else{
            holder.popularOldKs.text = ""
        }
        holder.popularImage.setImageResource(popularList[position].popularImage)
    }

}