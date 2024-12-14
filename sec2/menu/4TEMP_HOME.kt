package com.project.latihancompose.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.project.latihancompose.CategoryRow
import com.project.latihancompose.MenuRow
import com.project.latihancompose.model.dummyBestSellerMenu
import com.project.latihancompose.model.dummyMenu

@Composable
fun TEMP_HOME(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        com.project.latihancompose.Banner()
        HomeSection(
            title = "Categories",
            content = { CategoryRow() }
        )
        HomeSection(
            title = "Our Best Seller",
            content = { MenuRow(dummyBestSellerMenu) }
        )
        HomeSection(
            title = "Menu List",
            content = { MenuRow(dummyMenu) }
        )
    }
}
