package chaubey.abhishek.retrofit.retrointerface;

import chaubey.abhishek.retrofit.response_model.RespHospital;

import chaubey.abhishek.retrofit.response_model.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
//@link http://www.androidhive.info/2016/05/android-working-with-retrofit-http-library/
/**
 * Created by Admin on 3/3/2017.
 */

public interface ApiInterface {
    @GET("search/hospital")
    Call<ResponseResult> getTopHospital();

}
