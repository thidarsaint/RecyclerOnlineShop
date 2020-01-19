package com.tds.shopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tds.shopping.Adapter.CountryAdapter
import com.tds.shopping.Adapter.LatestBrandAdapter
import com.tds.shopping.Adapter.PopularProductsAdapter
import com.tds.shopping.model.Country
import com.tds.shopping.model.LatestBrand
import com.tds.shopping.model.PopularProducts

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        latestBrandArrivals()

        searchByCountry()

        popularProducts()
    }

    fun latestBrandArrivals(){
        var latestRecyclerView : RecyclerView = findViewById(R.id.recycler_latest_arrivals)

        var latestBrandList = ArrayList<LatestBrand>()
        latestBrandList.add(LatestBrand("Hyde Park N41015", "LOUIS VUITTON", 999999999, 211000, R.drawable.louis_vuitton) )
        latestBrandList.add(LatestBrand("HORNS PINK LONG SLEEVE T SHIRT", "Lady Gaga", 72000, 0, R.drawable.horn_shirts) )
        latestBrandList.add(LatestBrand("I Phone 8 Plus", "Apple", 980000, 211000, R.drawable.iphone) )
        latestBrandList.add(LatestBrand("Cream Fur Jacket", "Uniqlo", 560000, 0, R.drawable.cream_jacket) )

        var latestBrandAdapter = LatestBrandAdapter(latestBrandList)
        latestRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        latestRecyclerView.adapter = latestBrandAdapter
    }

    fun searchByCountry(){
        var searchCountryRecyclerView: RecyclerView = findViewById(R.id.recycler_search_country)

        var countryList = ArrayList<Country>()
        countryList.add(Country("Singapore", R.drawable.singapore))
        countryList.add(Country("China", R.drawable.china))
        countryList.add(Country("Japan", R.drawable.japan))
        countryList.add(Country("Korea", R.drawable.korea))

        var searchCountryAdapter = CountryAdapter(countryList)
        searchCountryRecyclerView.layoutManager = GridLayoutManager(this, 2)
        searchCountryRecyclerView.adapter = searchCountryAdapter
    }

    fun popularProducts(){
        var popularProductsRecyclerView : RecyclerView = findViewById(R.id.recycler_popular_products)

        var popularList = ArrayList<PopularProducts>()
        popularList.add(PopularProducts("I Phone 8 Plus", "Apple", 980000, 110000, R.drawable.iphone ))
        popularList.add(PopularProducts("GhostBed 11 Inch Cooling Gel Memory Foam......", "GhostBed", 325000, 495000, R.drawable.ghostbed ))
        popularList.add(PopularProducts("Nintendo Switch - Neon Blue and Red Joy-Con", "Nintendo", 359000, 0, R.drawable.nintendo ))
        popularList.add(PopularProducts("BELARO| Womens Comfy Swing Tunic Short....", "Belaroi", 18990, 0, R.drawable.belaro))

        var popularAdapter = PopularProductsAdapter(popularList)
        popularProductsRecyclerView.layoutManager = LinearLayoutManager(this)
        popularProductsRecyclerView.adapter = popularAdapter
    }
}
