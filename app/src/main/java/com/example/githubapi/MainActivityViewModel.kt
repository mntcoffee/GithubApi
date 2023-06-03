package com.example.githubapi

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubapi.data.api.GitHubApiResponse
import com.example.githubapi.data.repository.GitHubApiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val gitHubApiRepository: GitHubApiRepository
): ViewModel() {

    fun searchRepositories(text: String) {
        viewModelScope.launch {
            val response = gitHubApiRepository.searchRepositories(text)
            response.onSuccess { response ->
                Timber.d(response.toString())
            }
            response.onFailure {
                Timber.e(it.toString())
            }
        }
    }
}