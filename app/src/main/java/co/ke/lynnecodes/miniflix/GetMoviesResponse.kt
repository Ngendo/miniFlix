package co.ke.lynnecodes.miniflix

import com.google.gson.annotations.SerializedName

/**
 * Created by Lynne on 23,February,2021
 */
data class GetMoviesResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val movies: List<Movie>,
    @SerializedName("total_pages")
    val pages: Int
)
