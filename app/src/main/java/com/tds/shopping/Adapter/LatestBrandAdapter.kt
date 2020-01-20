package com.tds.shopping.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tds.shopping.R
import com.tds.shopping.model.LatestBrand
import kotlinx.android.synthetic.main.latest_arrials.view.*

class LatestBrandViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var latestImage = itemView.findViewById<ImageView>(R.id.image_latest)
    var latestBrandName = itemView.findViewById<TextView>(R.id.latest_brand_name)
    var latestBrandType = itemView.findViewById<TextView>(R.id.latest_brand)
    var oldPrice = itemView.findViewById<TextView>(R.id.old_price)
    var latestBrandPrice = itemView.findViewById<TextView>(R.id.latest_price)
    var latestOldKs = itemView.findViewById<TextView>(R.id.old_kyat)
}

class LatestBrandAdapter(var latestBrandList: ArrayList<LatestBrand>) :
    RecyclerView.Adapter<LatestBrandViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestBrandViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.latest_arrials, parent, false)
        return LatestBrandViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestBrandList.size
    }

    override fun onBindViewHolder(holder: LatestBrandViewHolder, position: Int) {
        holder.latestBrandName.text = latestBrandList[position].latestBrandName
        holder.latestBrandType.text = latestBrandList[position].latestBrandType
        holder.latestImage.setImageResource(latestBrandList[position].latestBrandImage)

        if (latestBrandList[position].oldPrice > 0) {
            holder.oldPrice.text = latestBrandList[position].oldPrice.toString()
        } else {
            holder.latestOldKs.text = ""
        }

        holder.latestBrandPrice.text = latestBrandList[position].latestPrice.toString()
    }

}
