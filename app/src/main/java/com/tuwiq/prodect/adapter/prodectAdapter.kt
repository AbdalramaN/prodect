package com.tuwiq.prodect.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.tuwiq.prodect.R
import com.tuwiq.prodect.fragments.prodectFragmentDirections
import com.tuwiq.prodect.model.Hotel
import com.tuwiq.prodect.viewModel.SharedViewModel
import java.text.NumberFormat

class prodectAdapter(private val viewModel: SharedViewModel, val dataSet: List<Hotel>) :
    RecyclerView.Adapter<prodectAdapter.prodectViewHolder>() {

    inner class CitiesViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val prodectName: TextView = view.findViewById(R.id.text_view_hotel_name)
        val companyName: TextView = view.findViewById(R.id.text_view_city_name)
        val imageView: ImageView = view.findViewById(R.id.city_image)
        val textPrice: TextView = view.findViewById(R.id.price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): prodectsViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_layout, parent, false)
        return prodectsViewHolder(layout)
    }

    override fun onBindViewHolder(holder: CitiesViewHolder, position: Int) {
        val item = dataSet[position]


        holder.hotelName.setText(item.nameprodet)
        holder.cityName.setText(item.namecompany)
        holder.imageView.setImageResource(item.prodectImage)
        holder.textPrice.text = NumberFormat.getCurrencyInstance().format(item.price)
        holder.view.setOnClickListener {
            viewModel.getPrice(item.price)
            viewModel.getImage(item.peodectImage)
            viewModel.getNameHotel(holder.prodectName.text.toString())
            viewModel.getNameCity(holder.companyName.text.toString())
            viewModel.setQuantity(1)

            holder.view.findNavController()
                .navigate(prodectFragmentDirections.productListToProductDetails())
        }


    }

    override fun getItemCount(): Int = dataSet.size


}