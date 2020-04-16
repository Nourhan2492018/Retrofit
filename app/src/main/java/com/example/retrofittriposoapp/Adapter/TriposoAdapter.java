package com.example.retrofittriposoapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofittriposoapp.Interface.CardOnClickTriposo;
import com.example.retrofittriposoapp.Model.TriposoModel;
import com.example.retrofittriposoapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class TriposoAdapter  extends RecyclerView.Adapter<TriposoAdapter.TriposoView> {
    private Context mcontext;
    private ArrayList<TriposoModel.Results.Images> triposoList;
    private CardOnClickTriposo onClickTriposo;

    public  void setOnItemClickListner(CardOnClickTriposo listner)
    {
        onClickTriposo =listner;

    }
    public TriposoAdapter(Context context, ArrayList<TriposoModel.Results.Images>TriposoItemList)
    {
        mcontext=context;
        triposoList =TriposoItemList;

    }

    @NonNull
    @Override
    public TriposoView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mcontext).inflate(R.layout.triposo_view_item,parent,false);
        return new TriposoView(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TriposoView holder, int position) {

       // TriposoModel.Results.Images results= triposoList.get(position);
         holder.mTextViewCaption.setText(triposoList.get(position).getCaption());

        Picasso.with(mcontext).load(triposoList.get(position).getSizes().getOriginal().getUrl()).fit().centerInside().into(holder.mIamageView);
    }

    @Override
    public int getItemCount() {
        return triposoList.size();
    }

    public class TriposoView extends RecyclerView.ViewHolder{
        public ImageView mIamageView;
        public TextView mTextViewCaption;

        public TriposoView(@NonNull View ItemTriposo) {
            super(ItemTriposo);
            mIamageView=ItemTriposo.findViewById(R.id.image_tripso_view);
            mTextViewCaption=ItemTriposo.findViewById(R.id.text_caption_view);


            ItemTriposo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onClickTriposo !=null)
                    {
                        int position = getAdapterPosition();
                        if(position!=RecyclerView.NO_POSITION)
                        {
                            onClickTriposo.OnClicTriposoItem(position);
                        }
                    }
                }
            });
        }
    }
}
