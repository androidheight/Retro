package chaubey.abhishek.retrofit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import chaubey.abhishek.retrofit.response_model.RespHospital;

/**
 * Created by abhishek on 05/03/17.
 */

public class RecyclerHospitalAdapter extends RecyclerView.Adapter<RecyclerHospitalAdapter.RecyclerHospitalHolder> {


    //Constructor for the reference of the instance

    Context context;
    List<RespHospital> hospitalList;
    int layoutId;

    public RecyclerHospitalAdapter(Context context, int layoutId, List<RespHospital> hospitalList){
        this.context=context;
        this.hospitalList=hospitalList;
        this.layoutId=layoutId;
    }

    @Override
    public RecyclerHospitalAdapter.RecyclerHospitalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(layoutId,parent,false);
        return new RecyclerHospitalHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerHospitalAdapter.RecyclerHospitalHolder holder, int position) {
        holder.tv_hospital_address.setText(hospitalList.get(position).getHospital_address());
        holder.tv_hospital_name.setText(hospitalList.get(position).getHospital_name());
        holder.tv_rating.setText(hospitalList.get(position).getRank());

    }

    @Override
    public int getItemCount() {
        return hospitalList.size();
    }

    //@Link ViewHolder Creation for the holding of the View
    public static class RecyclerHospitalHolder extends RecyclerView.ViewHolder{
            TextView tv_rating,tv_hospital_name,tv_hospital_address;
        public RecyclerHospitalHolder(View itemView) {
            super(itemView);
            tv_hospital_address=(TextView) itemView.findViewById(R.id.hospital_address);
            tv_hospital_name=(TextView) itemView.findViewById(R.id.tvhospital_name);
            tv_rating=(TextView) itemView.findViewById(R.id.rating);

        }
    }
}
