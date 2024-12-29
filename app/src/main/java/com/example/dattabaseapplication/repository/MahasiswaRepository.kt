package com.example.dattabaseapplication.repository

import com.example.dattabaseapplication.model.Mahasiswa

interface MahasiswaRepository {
    suspend fun getMahasiswa(): List<Mahasiswa>
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    suspend fun deleteMahasiswa(nim: String)
}
