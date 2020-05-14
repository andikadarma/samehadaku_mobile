package com.example.samehadakumobile.data

import com.example.samehadakumobile.GithubUserItem
import retrofit2.Call
import retrofit2.http.GET

interface GithubService {
    @GET("users")
    fun getUsers(): Call<List<GithubUserItem>>
}