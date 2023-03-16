package com.example.toolkitdemo.read_quran.inter

import com.example.toolkitdemo.read_quran.model.SurrahListModel
import com.example.toolkitdemo.read_quran.model.SurrahModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

//http://api.alquran.cloud/v1/surah
const val BASE_URL= "http://api.alquran.cloud/v1/"
interface TotalSurrahService {

    @GET("surah")
    fun getAllSurrah():Call<SurrahListModel>

}

object MyService{

    val totalSurrahService:TotalSurrahService
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        totalSurrahService = retrofit.create(TotalSurrahService::class.java)
    }
}