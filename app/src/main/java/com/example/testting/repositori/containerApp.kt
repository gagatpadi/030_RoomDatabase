package com.example.testting.repositori

import com.example.room.OfflineReposisotriSiswa
import com.example.room.RepositoriSiswa


interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
        ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineReposisotriSiswa(
            DatabaseSiswa.getDatabase(context).siswaDao())
    }
}

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}