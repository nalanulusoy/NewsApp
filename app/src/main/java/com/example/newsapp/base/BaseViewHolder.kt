package com.example.newsapp.base


import android.view.View
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder<V : View>(val itemView: V) : RecyclerView.ViewHolder(itemView)
