package com.bignerdranch.android.kursweather.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase


/*@Database(entities = [Weather::class], version = 4)
//@TypeConverters(CryptoCurrencyTypeConverter::class)
abstract class KursWeatherDatabase : RoomDatabase() {

    abstract fun kursWeatherDao() : KursWeatherDao

    companion object{
        @Volatile
        private var INSTANCE: KursWeatherDatabase? = null

        fun getDatabase(context: Context): KursWeatherDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    KursWeatherDatabase::class.java,
                    "kursWeather"
                )

                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }

}
*/
