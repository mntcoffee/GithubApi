package com.example.githubapi.data.api

import com.example.githubapi.data.model.SearchItem

/*
 APIレスポンス
 */
data class GitHubApiResponse(val items: List<SearchItem>)
