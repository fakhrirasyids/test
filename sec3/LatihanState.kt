package com.project.latihancompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.latihancompose.ui.theme.LatihancomposeTheme

@Composable
fun LatihanState(modifier: Modifier = Modifier) {
    val name = remember { mutableStateOf("") }

    Column(
        modifier = modifier.padding(8.dp)
    ) {
        SectionText(name.value)
        FormInput(name)
    }
}

@Composable
fun SectionText(name: String) {
    Text(
        text = "Nama Saya : $name",
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun FormInput(name: MutableState<String>) {
    OutlinedTextField(
        value = name.value,
        onValueChange = { newName ->
            name.value = newName
        },
        placeholder = {
            Text("Isi Nama Anda")
        }
    )
}


@Preview(showBackground = true)
@Composable
fun LatihanStatePreview() {
    LatihancomposeTheme {
        LatihanState()
    }
}