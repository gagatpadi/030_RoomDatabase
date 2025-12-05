package com.example.testting.view.route

import com.example.testting.R

object DestinasiDetailSiswa {
    override val route = "detail_siwa"
    override val titleRes = R.string.detail_siswa
    const val siswaIdArg = "idSiswa"
    val routeWithArgs = "$route/{$siswaIdArg}"
}

