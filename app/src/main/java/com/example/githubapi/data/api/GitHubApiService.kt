package com.example.githubapi.data.api

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/*
 Retrofitによって使用されるインターフェース．各APIエンドポイントとそのリクエスト，レスポンスの型を定義
 */
interface GitHubApiService {
    @GET("/search/repositories")
    suspend fun searchRepositories(@Query("q") query: String) : Response<GitHubApiResponse>
}
