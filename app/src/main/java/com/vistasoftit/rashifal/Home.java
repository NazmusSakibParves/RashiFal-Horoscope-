package com.vistasoftit.rashifal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


public class Home extends RecyclerView.Adapter<Home.DataObjectHolder>{

    private static String LOG_TAG = "MyRecyclerViewAdapter";
    private ArrayList<DataSource> mDataset;
    private static MyClickListener myClickListener;


    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_rashi,parent,false);
        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {


        final DataSource m = mDataset.get(position);
        holder.name.setText(m.getName());
        holder.imageView.setImageResource(m.getImage());



    }

    public void deleteItem(int index){
        mDataset.remove(index);
       notifyItemRemoved(index);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


    public static class DataObjectHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

      TextView name;
     ImageView imageView;

        public DataObjectHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.restaurant_name);
            imageView = (ImageView)itemView.findViewById(R.id.thumbnail);
            Log.i(LOG_TAG, "Adding Listener");
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            myClickListener.onItemClick(getAdapterPosition(), v);

        }
    }
    public void setOnItemClickListener(MyClickListener myClickListener){
        this.myClickListener = myClickListener;
    }
    public Home(ArrayList<DataSource> myDataset){
        mDataset = myDataset;

    }


    public interface MyClickListener{
            public void onItemClick(int position, View v);
        }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }



}
