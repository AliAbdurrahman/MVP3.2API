package id.papapaok.aliabdurrahman.fortune.Network;

import id.papapaok.aliabdurrahman.fortune.Main.Model.ResponseGetFortune;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by AliAbdurrahman on 10/18/18.
 */

public interface ApiService {

    @GET("top-headlines")
    Call<ResponseGetFortune> getFortuneData(
            @Query("sources") String sources,
            @Query("apiKey") String key
    );

}
