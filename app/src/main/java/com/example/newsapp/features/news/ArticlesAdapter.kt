package com.example.newsapp.features.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsapp.R
import com.example.newsapp.data.remote.model.Articles
import com.example.newsapp.data.remote.model.Sources
import kotlinx.android.synthetic.main.item_articles.view.*

class ArticlesAdapter(private val articlesList: List<Articles>) :
    RecyclerView.Adapter<ArticlesAdapter.ArticlesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_articles,parent,false)
        return ArticlesViewHolder(view)
    }

    override fun getItemCount(): Int = articlesList.size

    override fun onBindViewHolder(holder: ArticlesViewHolder, position: Int) {
        holder.bind(articlesList[position])
        holder.itemView.setOnClickListener { view ->
            var bundle = bundleOf("newsUrl" to articlesList[position].getUrl())
                Navigation.findNavController(view)
                    .navigate(R.id.action_newsDetailFragment_to_bottomNavFragmentNews, bundle)
        }
    }

    inner class ArticlesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(articles: Articles){
            itemView.apply {
                title.text = articles.getTitle()
                newsDate.text=articles.getPublishedAt()
                newsSource.text =articles.getSource()?.getName()
                Glide.with(context).load(articles.getUrlToImage()).centerCrop().into(thumbnail);
                newsInfo.text = articles.getDescription()
            }
        }
    }

}


