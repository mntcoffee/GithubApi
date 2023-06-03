package com.example.githubapi.data.api

import retrofit2.Response
import javax.inject.Inject

/*
 GitHubApiClientの具体的な実装．GitHubApiServiceのインスタンスを使用してAPIリクエストを実行
 */
class GitHubApiClientImpl @Inject constructor(
    private val apiService: GitHubApiService
) : GitHubApiClient {

    override suspend fun searchRepositories(query: String): Response<GitHubApiResponse> {
        return apiService.searchRepositories(query)
    }
}