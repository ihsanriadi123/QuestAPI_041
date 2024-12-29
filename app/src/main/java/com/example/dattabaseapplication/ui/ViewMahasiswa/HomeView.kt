package com.example.dattabaseapplication.ui.ViewMahasiswa

import androidx.compose.runtime.Composable
import com.example.dattabaseapplication.ui.Viewmodel.HomeUiState
import com.example.dattabaseapplication.ui.Viewmodel.HomeViewModel


@Composable
fun HomeView(
    viewModel: HomeViewModel = viewModel,
    navigateToInsert: () -> Unit
) {
    when (val state = viewModel.uiState) {
        is HomeUiState.Loading -> {/* Display loading */}
        is HomeUiState.Success -> {/* Display mahasiswa list */}
        is HomeUiState.Error -> {/* Display error */}
    }
}