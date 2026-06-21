package com.example

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.SubtitleFile 
import com.lagradost.cloudstream3.ExtractorLink

class ExampleProvider : MainAPI() { 
    override var mainUrl = "https://www.rareanimes.mov"
    override var name = "raretoon"
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie)
    override var lang = "hi"
    override val hasMainPage = false 

    override suspend fun search(query: String): List<SearchResponse> {
        // CloudStream automatically follows domain redirects during search requests!
        return listOf()
    }

    override suspend fun load(url: String): LoadResponse? {
        return null
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        return false
    }
}
