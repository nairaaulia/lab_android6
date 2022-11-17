package com.naira.belajarandroid.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.naira.belajarandroid.model.Article

@Composable
fun NewsApp(listArticle: List<Article>) {
    LazyColumn {
        items(listArticle) { article ->
            NewsCard(article = article)
        }
    }
}

@Composable
fun NewsCard(article: Article) {
    Card(elevation = 8.dp) {
        Column(){
            AsyncImage(
                model = article.urlToImage,
                contentDescription = "News Image"
            )
            Text(
                text = article.title
            )
        }
    }
}