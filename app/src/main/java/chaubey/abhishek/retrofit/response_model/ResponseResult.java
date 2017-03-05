package chaubey.abhishek.retrofit.response_model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by abhishek on 04/03/17.
 */

public class ResponseResult  {
    @SerializedName("response")
    private List<RespHospital> response;
   @SerializedName("message")
   private String message;
   @SerializedName("status")
    private String status;
    public List<RespHospital> getResponse() {
        return response;
    }

    public void setResponse(List<RespHospital> response) {
        response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
