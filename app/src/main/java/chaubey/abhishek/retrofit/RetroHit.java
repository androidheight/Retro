package chaubey.abhishek.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;
import java.util.WeakHashMap;

import chaubey.abhishek.retrofit.process.ApiClient;
import chaubey.abhishek.retrofit.response_model.RespHospital;
import chaubey.abhishek.retrofit.response_model.ResponseResult;
import chaubey.abhishek.retrofit.retrointerface.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetroHit extends AppCompatActivity {
//Localhost URL
    //replace it with your URL/webservice
/*
@JSON Response Structure Accesed while developing this Module
{
    "status": "success",
        "message": "list of Hospital",
        "response": [
    {
        "rank": 6,
            "Hospital_name": "forties",
            "Hospital_address": "Kishangarh"
    },
    {
        "rank": 4,
            "Hospital_name": "opolo",
            "Hospital_address": "Kishangarh"
    },
    {
        "rank": 1,
            "Hospital_name": "AIIMS",
            "Hospital_address": "Delhi"
    },
    {
        "rank": 2,
            "Hospital_name": "BHU",
            "Hospital_address": "Varanasi"
    },
    {
        "rank": 5,
            "Hospital_name": "A.M.Hospital",
            "Hospital_address": "AP"
    },
    {
        "rank": 3,
            "Hospital_name": "Apaji Arogya Mandir",
            "Hospital_address": "Jaipur"
    },
    {
        "rank": 7,
            "Hospital_name": "Heritage",
            "Hospital_address": "Varanasi"
    }
  ]
}*/
    private final String BASE_URL="http://192.168.0.104:3000/api/v1/";
     RecyclerView mrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retro_hit);

        mrecycler=(RecyclerView)findViewById(R.id.recycler_hospital_list);
        mrecycler.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiCall= ApiClient.getClient(BASE_URL).create(ApiInterface.class);
        Call<ResponseResult> call=apiCall.getTopHospital();
        call.enqueue(new Callback<ResponseResult>() {
            @Override
            public void onResponse(Call<ResponseResult> call, Response<ResponseResult> response) {
                List<RespHospital> hospitalList=response.body().getResponse();
                mrecycler.setAdapter(new RecyclerHospitalAdapter(RetroHit.this,R.layout.list_row_hospital,hospitalList));
            }

            @Override
            public void onFailure(Call<ResponseResult> call, Throwable throwable) {
                Log.e("TAG", throwable.toString());
            }
        });
    }
}
