package com.example.testting.room
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.coroutines.flow.Flow


@Dao
interface SiswaDao{
    @Query("SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): List<Siswa>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)
}