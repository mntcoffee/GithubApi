package com.example.githubapi.data.api

import retrofit2.Response


/*
 APIリクエストを抽象化したインターフェース．リクエストの詳細(エンドポイント，パラメータ，ヘッダーなど)を隠蔽
 */
interface GitHubApiClient {
    suspend fun searchRepositories(query: String): Response<GitHubApiResponse>
}