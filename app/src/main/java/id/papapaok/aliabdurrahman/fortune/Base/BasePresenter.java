package id.papapaok.aliabdurrahman.fortune.Base;

/**
 * Created by AliAbdurrahman on 10/18/18.
 */

public interface BasePresenter <T extends BaseView> {

    void onAttach(T v);
    void onDettach();

}
