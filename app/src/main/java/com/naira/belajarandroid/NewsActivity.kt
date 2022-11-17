package com.naira.belajarandroid

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.naira.belajarandroid.model.Article
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.naira.belajarandroid.ui.theme.BelajarAndroidTheme
import com.naira.belajarandroid.ui.theme.NewsApp
import com.naira.belajarandroid.ui.theme.NewsViewModel

class NewsActivity : ComponentActivity() {

    val newsModel = viewModels<NewsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsApp(newsModel.value.newsUiState)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
    val newsViewModel: NewsViewModel = viewModel()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BelajarAndroidTheme {
        Greeting("Android")
    }
}

@Composable
fun NewsCard(article: Article) {
    Card(elevation = 8.dp) {
        Column(
        ){
          AsyncImage(
              model = article.urlToImage,
              contentDescription = "news image"
          )
            Text (text = article.title)
        }
    }
}