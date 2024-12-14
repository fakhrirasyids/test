package com.project.latihancompose.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.latihancompose.ui.theme.LatihancomposeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(modifier: Modifier = Modifier) {
    SearchBar(
        active = false,
        onActiveChange = {},
        query = "",
        onQueryChange = {
        },
        onSearch = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                contentDescription = null
            )
        },
        placeholder = {
            Text("Search Here")
        },
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun SearchPreview() {
    LatihancomposeTheme {
        Search()
    }
}