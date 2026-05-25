package com.example.myordersui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OrderAdapter(private val orderList: List<Order>) :
    RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    class OrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title: TextView = itemView.findViewById(R.id.txtOrderTitle)
        val dateTime: TextView = itemView.findViewById(R.id.txtDateTime)
        val orderId: TextView = itemView.findViewById(R.id.txtOrderId)
        val pickup: TextView = itemView.findViewById(R.id.txtPickup)
        val delivery: TextView = itemView.findViewById(R.id.txtDelivery)
        val price: TextView = itemView.findViewById(R.id.txtPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_order, parent, false)

        return OrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {

        val order = orderList[position]

        holder.title.text = order.title
        holder.dateTime.text = order.dateTime
        holder.orderId.text = order.orderId
        holder.pickup.text = order.pickup
        holder.delivery.text = order.delivery
        holder.price.text = order.price
    }

    override fun getItemCount(): Int {
        return orderList.size
    }
}