package chaubey.abhishek.retrofit.response_model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Abhishek Chaubey on 3/3/2017.
 */

public class RespHospital {
    @SerializedName("rank")
    private String rank;
    @SerializedName("Hospital_address")
    private String Hospital_address;
    @SerializedName("Hospital_name")
    private String Hospital_name;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getHospital_address() {
        return Hospital_address;
    }

    public void setHospital_address(String hospital_address) {
        Hospital_address = hospital_address;
    }

    public String getHospital_name() {
        return Hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        Hospital_name = hospital_name;
    }
}
