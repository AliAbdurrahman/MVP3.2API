package id.papapaok.aliabdurrahman.fortune.View;

import java.util.List;

import id.papapaok.aliabdurrahman.fortune.Base.BaseView;
import id.papapaok.aliabdurrahman.fortune.Main.Model.ArticlesItem;

/**
 * Created by AliAbdurrahman on 10/18/18.
 */

public interface MainView extends BaseView {

    void onError(String msg);
    void onSucces(List<ArticlesItem> data);

}
