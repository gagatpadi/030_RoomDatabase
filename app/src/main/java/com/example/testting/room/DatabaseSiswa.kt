package com.example.testting.room

@Database(entities = [Siswa ::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa : RoomDatabase(){

    companion object{
        @Volatile
        private var Instance : DatabaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa{
            return (Instance?: synchronized(this){
                Room.databaseBuilder(
                    context, DatabaseSiswa::class.java,
                    name = "siswa database")
                    .build().also {Instance = it}
            })
        }
    }
}