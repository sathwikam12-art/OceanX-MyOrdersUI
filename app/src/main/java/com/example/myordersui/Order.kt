package com.example.myordersui

data class Order(
    val title: String,
    val dateTime: String,
    val orderId: String,
    val pickup: String,
    val delivery: String,
    val price: String
)