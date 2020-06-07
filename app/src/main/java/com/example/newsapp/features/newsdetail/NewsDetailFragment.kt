package com.example.newsapp.features.newsdetail


import android.graphics.Bitmap
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.newsapp.R
import com.example.newsapp.base.BaseFragment
import kotlinx.android.synthetic.main.layout_news_detail_fragment.*



class NewsDetailFragment : BaseFragment<(NewsDetailViewModel)>() {
    override val layoutId = R.layout.layout_news_detail_fragment

    companion object {
        const val NEWS_URL_KEY = "newsUrl"
        const val TITLE_KEY=""
    }
    override fun init() {
        super.init()
        val toolbar = view!!.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarDetail)
        val navHostFragment = NavHostFragment.findNavController(this);
        NavigationUI.setupWithNavController(toolbar, navHostFragment)
        arguments?.getString(NEWS_URL_KEY)?.let {
            initWebView(it)
        }
        toolbarDetail.title= TITLE_KEY
    }
    private fun initWebView(NewsUrl: String) {
        newsDetailWebView.run {
            webViewClient = object : WebViewClient() {

                override fun shouldOverrideUrlLoading(
                    view: WebView,
                    url: String?
                ): Boolean { // TODO Auto-generated method stub
                    view.loadUrl(url)
                    return true
                }
                override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
                    super.onPageStarted(view, url, favicon)
                    view?.visibility = View.INVISIBLE
                    progressBar?.visibility = View.VISIBLE
                }

                override fun onPageFinished(view: WebView, url: String) {
                    super.onPageFinished(view, url)
                    view?.visibility = View.VISIBLE
                    progressBar?.visibility = View.INVISIBLE
                }
            }
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            loadUrl(NewsUrl)
        }
    }
}
