package com.zfml.linksaver.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zfml.linksaver.domain.entities.Link
import com.zfml.linksaver.domain.repository.LinkRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: LinkRepository
) : ViewModel() {

    val links = repository.getLinks()
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            emptyList()
        )




    fun delete(link: Link) {
        viewModelScope.launch {
            repository.delete(link)
        }
    }
}

data class HomeUiState(
    val links: List<Link> = emptyList(),
    val isLoading: Boolean = false
)