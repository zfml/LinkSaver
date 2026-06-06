package com.zfml.linksaver.presentation.add_link

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zfml.linksaver.domain.entities.Link
import com.zfml.linksaver.domain.repository.LinkRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.jsoup.Jsoup
import javax.inject.Inject

@HiltViewModel
class AddLinkViewModel @Inject constructor(
    private val repository: LinkRepository
): ViewModel() {
    var uiState by mutableStateOf(AddLinkUiState())

    var linkSaved by mutableStateOf(false)
        private set

    fun onUrlChange(url: String) {
        uiState = uiState.copy(url = url)
    }

    fun onTitleChange(title: String) {
        uiState = uiState.copy(title = title)
    }


    fun saveLink(onDone: () -> Unit) {
        viewModelScope.launch {
            repository.insert(
                Link(
                    id = 0,
                    title = uiState.title,
                    url = uiState.url,
                )
            )
            onDone()
        }
    }
}


data class AddLinkUiState(
    val url: String = "",
    val title: String = "",
)