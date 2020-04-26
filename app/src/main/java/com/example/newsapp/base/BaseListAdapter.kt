package com.example.newsapp.base



import android.view.View
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter


abstract class BaseListAdapter< V: View,T : ListAdapterItem>(
    diffCallback: DiffUtil.ItemCallback<T> = ListAdapterItemDiffCallback()
) : ListAdapter<T, BaseViewHolder<V>>(diffCallback) {

    @get:LayoutRes
    protected abstract val layoutRes: Int

    override fun onBindViewHolder(holder: BaseViewHolder<V>, position: Int) {

    }
}
