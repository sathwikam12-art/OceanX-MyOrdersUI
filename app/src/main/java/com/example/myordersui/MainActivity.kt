package com.example.myordersui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Bottom Navigation
        val bottomNavigation =
            findViewById<BottomNavigationView>(R.id.bottomNavigation)

        // Highlight Orders Tab
        bottomNavigation.selectedItemId = R.id.nav_orders

        // RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val orderList = listOf(

            Order(
                "Four Wheeler",
                "05 Feb, 4:46 PM",
                "#ORD12345",
                "741, Gumanwara",
                "Shivaji Nagar, Jhansi",
                "₹229"
            ),

            Order(
                "Four Wheeler",
                "06 Feb, 5:10 PM",
                "#ORD12346",
                "332, Gumanwara",
                "Kamrari, Madhya Pradesh",
                "₹1515"
            ),

            Order(
                "Four Wheeler",
                "07 Feb, 6:20 PM",
                "#ORD12347",
                "741, Gumanwara",
                "Uttar Pradesh, India",
                "₹1634"
            )
        )

        recyclerView.adapter = OrderAdapter(orderList)
    }
}