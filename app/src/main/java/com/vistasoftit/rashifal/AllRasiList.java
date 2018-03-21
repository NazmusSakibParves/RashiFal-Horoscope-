package com.vistasoftit.rashifal;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Taslima on 9/29/2016.
 */
public class AllRasiList extends AppCompatActivity  {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    String language;

    private ArrayList<DataSource> allrestaurentinfo = new ArrayList<DataSource>();
    String[] rashiName = {"Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn","Aquarius","Pisces"};
    String[] rashiNameBangla = {"মেষ","বৃষ","মিথুন","কর্কট ","সিংহ ","কন্যা ","তুলা ","বৃশ্চিক ","ধনু ","মকর ","কুম্ভ ","মীন "};
    int[] rashiImage = {R.drawable.aries,R.drawable.taurus,R.drawable.gemini,R.drawable.cancer,R.drawable.leo,R.drawable.virgo,
            R.drawable.libra,R.drawable.scorpio,R.drawable.sagittarius,R.drawable.capricorn,R.drawable.aquarius,R.drawable.pisces};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_restaurant_list);
        language= PreferenceManager.getDefaultSharedPreferences(AllRasiList.this).getString("Language", null);



        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

       setData();


    }





    public void setData() {
        for (int i = 0;i<rashiName.length;i++){
            DataSource bankDepositItem = new DataSource();

            if (language.equals("বাংলা")){

                bankDepositItem.setName(rashiNameBangla[i]);
            }else if (language.equals("English")) {
                bankDepositItem.setName(rashiName[i]);
            }

            bankDepositItem.setImage(rashiImage[i]);

            allrestaurentinfo.add(bankDepositItem);

        }
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(AllRasiList.this,3);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new Home(allrestaurentinfo);

        mRecyclerView.setAdapter(mAdapter);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(700);
        itemAnimator.setRemoveDuration(1000);
        mRecyclerView.setItemAnimator(itemAnimator);

        ((Home)mAdapter).setOnItemClickListener(new Home.MyClickListener(){

            @Override
            public void onItemClick(int position, View view) {
                Intent intent = new Intent(AllRasiList.this,RashiDetails.class);
              //  final DataSource object = allrestaurentinfo.get(position);
              //  String rashiName = object.getName();
                //  Toast.makeText(AllRasiList.this,rashiName,Toast.LENGTH_LONG).show();
                intent.putExtra("Pos",position);
               // intent.putExtra("SelectedRashi",rashiName);
                startActivity(intent);

            }
        });


    }


}
