package id.papapaok.aliabdurrahman.fortune.Presenter;

import java.util.List;

import id.papapaok.aliabdurrahman.fortune.Base.BasePresenter;
import id.papapaok.aliabdurrahman.fortune.Main.Model.ArticlesItem;
import id.papapaok.aliabdurrahman.fortune.Main.Model.ResponseGetFortune;
import id.papapaok.aliabdurrahman.fortune.Network.ConfigRetrofit;
import id.papapaok.aliabdurrahman.fortune.View.MainView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by AliAbdurrahman on 10/18/18.
 */

public class MainPresenter implements BasePresenter<MainView> {

    MainView mainView;
    private String key = "4625d046da30459a80a62d89415b77be";
    private String sources = "fortune";

    public void getData() {
        call().enqueue(new Callback<ResponseGetFortune>() {
            @Override
            public void onResponse(Call<ResponseGetFortune> call, Response<ResponseGetFortune> response) {
                if (response.isSuccessful()) {
                    List<ArticlesItem> articlesItems = response.body().getArticles();
                    mainView.onSucces(articlesItems);
                } else {
                    mainView.onError(response.body().getStatus());
                }
            }

            @Override
            public void onFailure(Call<ResponseGetFortune> call, Throwable t) {
                mainView.onError(t.getMessage());
            }
        });
    }

    private Call<ResponseGetFortune> call() {
        return ConfigRetrofit.getInstance().getFortuneData(sources, key);
    }

    @Override
    public void onAttach(MainView v) {
        mainView = v;
    }

    @Override
    public void onDettach() {
        mainView = null;
    }

}
