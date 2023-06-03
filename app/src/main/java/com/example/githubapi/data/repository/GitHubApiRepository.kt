package com.example.githubapi.data.repository

import com.example.githubapi.data.api.GitHubApiClient
import com.example.githubapi.data.api.GitHubApiResponse
import java.io.IOException
import java.net.SocketTimeoutException
import javax.inject.Inject

class GitHubApiRepository @Inject constructor(
    private val apiClient: GitHubApiClient
) {

    suspend fun searchRepositories(query: String): Result<GitHubApiResponse> {


        return try {
            val response = apiClient.searchRepositories(query)

            if (response.isSuccessful && response.body() != null) {
                Result.success(response.body()!!)
            } else {
                Result.failure(IOException("Error"))
            }
        } catch (e: IOException) {
            Result.failure(IOException("Error"))
        } catch (e: SocketTimeoutException) {
            Result.failure(IOException("Timeout"))
        }
    }
}