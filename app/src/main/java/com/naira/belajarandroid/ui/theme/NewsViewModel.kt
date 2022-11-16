package com.naira.belajarandroid.ui.theme

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.naira.belajarandroid.model.Article
import com.naira.belajarandroid.network.Api
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    init {
        getListNews()
    }

    fun getListNews(){
       viewModelScope.launch {
           val response = Api.newsApiService.getTopHeadline()
           val articles = response.articles

           articles.forEach{ article: Article ->
                Log.d("response", article.toString())
           }
       }
    }
}