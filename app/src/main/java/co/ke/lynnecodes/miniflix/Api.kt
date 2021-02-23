package co.ke.lynnecodes.miniflix

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Lynne on 23,February,2021
 */
interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "5e946d9c993deb2b8adb90d2da505559",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}