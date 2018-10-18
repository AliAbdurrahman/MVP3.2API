package id.papapaok.aliabdurrahman.fortune.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by AliAbdurrahman on 10/18/18.
 */

public class ConfigRetrofit {

    public static String webUrl = "https://newsapi.org/v2/";

    public static Retrofit setInit() {
        return new Retrofit.Builder()
                .baseUrl(webUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getInstance() {
        return setInit().create(ApiService.class);
    }

}
