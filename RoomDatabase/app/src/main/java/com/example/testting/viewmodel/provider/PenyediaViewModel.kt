package com.example.testting.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.testting.repositori.AplikasiSiswa
import com.example.testting.viewmodel.DetailViewModel
import com.example.testting.viewmodel.EntryViewModel
import com.example.testting.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(apliasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(apliasiSiswa().container.repositoriSiswa)
        }
        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                apliasiSiswa().container.repositoriSiswa
            )
        }
    }
}

fun CreationExtras.apliasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as
            AplikasiSiswa)