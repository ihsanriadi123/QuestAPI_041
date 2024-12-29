package com.example.dattabaseapplication.service_api

import com.example.dattabaseapplication.model.Mahasiswa

interface MahasiswaService {
    @GET("mahasiswa")
    suspend fun getAllMahasiswa(): List<Mahasiswa>

    @POST("mahasiswa")
    suspend fun insertMahasiswa(@Body mahasiswa: Mahasiswa)

    @DELETE("mahasiswa/{nim}")
    suspend fun deleteMahasiswa(@Path("nim") nim: String)
}


annotation class DELETE(val value: String)

annotation class GET(val value: String)

annotation class POST(val value: String)

annotation class Path(val value: String)

annotation class Body
