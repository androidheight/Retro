package chaubey.abhishek.retrofit.process;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Abhishek Chaubey on 3/3/2017.
 */

public class ApiClient {
    private static Retrofit retrofit=null;

    public static Retrofit getClient(String BASE_URL){
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
