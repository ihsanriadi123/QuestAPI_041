package com.example.dattabaseapplication.ui.Viewmodel


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.dattabaseapplication.ui.navigation.PengelolaHalaman

@Composable
fun MahasiswaApp() {
    MyApplicationTheme {
        Scaffold { innerPadding ->
            PengelolaHalaman(modifier = Modifier.padding(innerPadding))
        }
    }
}


fun PengelolaHalaman(modifier: Modifier) {
        TODO("Not yet implemented")
}

@Composable
fun MyApplicationTheme(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}
