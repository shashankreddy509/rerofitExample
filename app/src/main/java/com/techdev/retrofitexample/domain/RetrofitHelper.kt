package com.techdev.retrofitexample.domain

import com.techdev.retrofitexample.Utils.BASE_URL
import com.techdev.retrofitexample.domain.remote.NycSchoolApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getInstance(): NycSchoolApi {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NycSchoolApi::class.java)
    }
}