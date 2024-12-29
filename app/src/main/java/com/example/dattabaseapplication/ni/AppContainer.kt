package com.example.dattabaseapplication.ni

import com.example.dattabaseapplication.model.Mahasiswa
import com.example.dattabaseapplication.repository.MahasiswaRepository
import com.example.dattabaseapplication.service_api.MahasiswaService

interface AppContainer {
    val mahasiswaRepository: MahasiswaRepository
}


class MahasiswaContainer : AppContainer {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://10.0.2.2:8000/umyTI/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val mahasiswaService: MahasiswaService by lazy {
        retrofit.create(MahasiswaService::class.java)
    }

    override val mahasiswaRepository: MahasiswaRepository by lazy {
        object : MahasiswaRepository {
            override suspend fun getMahasiswa() = mahasiswaService.getAllMahasiswa()
            override suspend fun insertMahasiswa(mahasiswa: Mahasiswa) = mahasiswaService.insertMahasiswa(mahasiswa)
            override suspend fun deleteMahasiswa(nim: String) = mahasiswaService.deleteMahasiswa(nim)
        }
    }
}