package com.techdev.retrofitexample.domain.remote

import com.techdev.retrofitexample.domain.models.NycSchoolList
import com.techdev.retrofitexample.domain.models.SchoolDetails
import retrofit2.http.GET
import retrofit2.http.Query

interface NycSchoolApi {
    @GET("f9bf-2cp4.json")
    suspend fun getSchoolList(): NycSchoolList

    @GET("s3k6-pzi2.json")
    suspend fun getSchoolDetails(@Query("dbn") schoolId: String): SchoolDetails
}