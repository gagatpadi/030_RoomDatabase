package com.example.testting.repositori

import kotlinx.coroutines.flow.Flow


interface RepositoriSiswa{
    fun getAllSiswaStream(): Flow<list<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineRepositori(
    privete val siswaDao: SiswaDao
): RepositoriSiswa{
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}