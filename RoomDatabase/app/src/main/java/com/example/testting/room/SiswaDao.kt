package com.example.testting.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow // Pastikan import ini ada

@Dao
interface SiswaDao {
    // Ubah return type dari List<Siswa> menjadi Flow<List<Siswa>>
    // agar data update secara real-time (reactive)
    @Query("SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)
}