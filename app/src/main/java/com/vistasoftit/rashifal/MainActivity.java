package com.vistasoftit.rashifal;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MainActivity extends AppCompatActivity {
    List<String> spinnerDayList = new ArrayList<String>();
    List<String> spinnerMonthList = new ArrayList<String>();
    ArrayAdapter<String> adapterDayList,adapterMonthList;
    Spinner day,month;
    EditText etName;
    String language;
    TextView textName,textBirthDate;
    Button btnFind;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        language= PreferenceManager.getDefaultSharedPreferences(MainActivity.this).getString("Language", null);

        day = (Spinner)findViewById(R.id.spinnerDay);
        month = (Spinner)findViewById(R.id.spinnerMonth);
        etName = (EditText) findViewById(R.id.editText_name);
        textName = (TextView) findViewById(R.id.tvName);
        textBirthDate = (TextView) findViewById(R.id.tvBirthDate);
        btnFind = (Button) findViewById(R.id.button2);

        if (language.equals("বাংলা")){
            spinnerDayList.add("দিন নির্বাচন করুন");
            spinnerDayList.add("১");
            spinnerDayList.add("২");
            spinnerDayList.add("৩");
            spinnerDayList.add("৪");
            spinnerDayList.add("৫");
            spinnerDayList.add("৬");
            spinnerDayList.add("৭");
            spinnerDayList.add("৮");
            spinnerDayList.add("৯");
            spinnerDayList.add("১০");
            spinnerDayList.add("১১");
            spinnerDayList.add("১২");
            spinnerDayList.add("১৩");
            spinnerDayList.add("১৪");
            spinnerDayList.add("১৫");
            spinnerDayList.add("১৬");
            spinnerDayList.add("১৭");
            spinnerDayList.add("১৮");
            spinnerDayList.add("১৯");
            spinnerDayList.add("২০");
            spinnerDayList.add("২১");
            spinnerDayList.add("২২");
            spinnerDayList.add("২৩");
            spinnerDayList.add("২৪");
            spinnerDayList.add("২৫");
            spinnerDayList.add("২৬");
            spinnerDayList.add("২৭");
            spinnerDayList.add("২৮");
            spinnerDayList.add("২৯");
            spinnerDayList.add("৩০");
            spinnerDayList.add("৩১");


            spinnerMonthList.add("মাস নির্বাচন করুন");
            spinnerMonthList.add("জানুয়ারী");
            spinnerMonthList.add("ফেব্রুয়ারি");
            spinnerMonthList.add("মার্চ");
            spinnerMonthList.add("এপ্রিল");
            spinnerMonthList.add("মে");
            spinnerMonthList.add("জুন");
            spinnerMonthList.add("জুলাই");
            spinnerMonthList.add("অগাস্ট");
            spinnerMonthList.add("সেপ্টেম্বর");
            spinnerMonthList.add("অক্টোবর");
            spinnerMonthList.add("নভেম্বর");
            spinnerMonthList.add("ডিসেম্বর");


            textName.setText("আপনার নাম লিখুন");
            textBirthDate.setText("জন্ম তারিখ নির্বাচন করুন");
            btnFind.setText("রাশি দেখুন");


        }else if (language.equals("English")) {
            spinnerDayList.add("Select Day");
            spinnerDayList.add("1");
            spinnerDayList.add("2");
            spinnerDayList.add("3");
            spinnerDayList.add("4");
            spinnerDayList.add("5");
            spinnerDayList.add("6");
            spinnerDayList.add("7");
            spinnerDayList.add("8");
            spinnerDayList.add("9");
            spinnerDayList.add("10");
            spinnerDayList.add("11");
            spinnerDayList.add("12");
            spinnerDayList.add("13");
            spinnerDayList.add("14");
            spinnerDayList.add("15");
            spinnerDayList.add("16");
            spinnerDayList.add("17");
            spinnerDayList.add("18");
            spinnerDayList.add("19");
            spinnerDayList.add("20");
            spinnerDayList.add("21");
            spinnerDayList.add("22");
            spinnerDayList.add("23");
            spinnerDayList.add("24");
            spinnerDayList.add("25");
            spinnerDayList.add("26");
            spinnerDayList.add("27");
            spinnerDayList.add("28");
            spinnerDayList.add("29");
            spinnerDayList.add("30");
            spinnerDayList.add("31");

            spinnerMonthList.add("Select Month");
            spinnerMonthList.add("January");
            spinnerMonthList.add("February");
            spinnerMonthList.add("March");
            spinnerMonthList.add("April");
            spinnerMonthList.add("May");
            spinnerMonthList.add("June");
            spinnerMonthList.add("July");
            spinnerMonthList.add("August");
            spinnerMonthList.add("September");
            spinnerMonthList.add("October");
            spinnerMonthList.add("November");
            spinnerMonthList.add("December");

            textName.setText("Enter Your Nick Name");
            textBirthDate.setText("Select Date of Birth");
            btnFind.setText("Find Horoscope");

        }






        adapterDayList=new ArrayAdapter<String>(MainActivity.this, R.layout.spinner, spinnerDayList);
        adapterMonthList=new ArrayAdapter<String>(MainActivity.this, R.layout.spinner, spinnerMonthList);



        day.setAdapter(adapterDayList);
        month.setAdapter(adapterMonthList);
        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,horoscope = null;
                int selectedDay,selectedMonth;

                name = etName.getText().toString();

                selectedDay = day.getSelectedItemPosition();
                selectedMonth = month.getSelectedItemPosition();


                if      ((selectedMonth == 12 && selectedDay >= 22 && selectedDay <= 31) || (selectedMonth ==  1 && selectedDay >= 1 && selectedDay <= 19)){
                    if (language.equals("বাংলা")){
                        horoscope="মকর";

                    }else if (language.equals("English")) {
                        horoscope="Capricorn";
                    }


                } else if ((selectedMonth ==  1 && selectedDay >= 20 && selectedDay <= 31) || (selectedMonth ==  2 && selectedDay >= 1 && selectedDay <= 17)){

                    if (language.equals("বাংলা")){
                        horoscope="কুম্ভ";

                    }else if (language.equals("English")) {
                        horoscope="Aquarius";
                    }

                }

                else if ((selectedMonth ==  2 && selectedDay >= 18 && selectedDay <= 29) || (selectedMonth ==  3 && selectedDay >= 1 && selectedDay <= 19)){
                    if (language.equals("বাংলা")){
                        horoscope="মীন";

                    }else if (language.equals("English")) {
                        horoscope="Pisces";
                    }

                }

                else if ((selectedMonth ==  3 && selectedDay >= 20 && selectedDay <= 31) || (selectedMonth ==  4 && selectedDay >= 1 && selectedDay <= 19)){
                    if (language.equals("বাংলা")){
                        horoscope="মেষ";

                    }else if (language.equals("English")) {
                        horoscope="Aries";
                    }

                }

                else if ((selectedMonth ==  4 && selectedDay >= 20 && selectedDay <= 30) || (selectedMonth ==  5 && selectedDay >= 1 && selectedDay <= 20)){
                    if (language.equals("বাংলা")){
                        horoscope="বৃষ";

                    }else if (language.equals("English")) {
                        horoscope="Taurus";
                    }

                }

                else if ((selectedMonth ==  5 && selectedDay >= 21 && selectedDay <= 31) || (selectedMonth ==  6 && selectedDay >= 1 && selectedDay <= 20)){
                    if (language.equals("বাংলা")){
                        horoscope="মিথুন";

                    }else if (language.equals("English")) {
                        horoscope="Gemini";
                    }

                }

                else if ((selectedMonth ==  6 && selectedDay >= 21 && selectedDay <= 30) || (selectedMonth ==  7 && selectedDay >= 1 && selectedDay <= 22)){
                    if (language.equals("বাংলা")){
                        horoscope="কর্কট";

                    }else if (language.equals("English")) {
                        horoscope="Cancer";
                    }

                }

                else if ((selectedMonth ==  7 && selectedDay >= 23 && selectedDay <= 31) || (selectedMonth ==  8 && selectedDay >= 1 && selectedDay <= 22)){
                    if (language.equals("বাংলা")){
                        horoscope="সিংহ";

                    }else if (language.equals("English")) {
                        horoscope="Leo";
                    }

                }

                else if ((selectedMonth ==  8 && selectedDay >= 23 && selectedDay <= 31) || (selectedMonth ==  9 && selectedDay >= 1 && selectedDay <= 22)){
                    if (language.equals("বাংলা")){
                        horoscope="কন্যা";

                    }else if (language.equals("English")) {
                        horoscope="Virgo";
                    }

                }

                else if ((selectedMonth ==  9 && selectedDay >= 23 && selectedDay <= 30) || (selectedMonth == 10 && selectedDay >= 1 && selectedDay <= 22)){
                    if (language.equals("বাংলা")){
                        horoscope="তুলা";

                    }else if (language.equals("English")) {
                        horoscope="Libra";
                    }

                }

                else if ((selectedMonth == 10 && selectedDay >= 23 && selectedDay <= 31) || (selectedMonth == 11 && selectedDay >= 1 && selectedDay <= 21)){
                    if (language.equals("বাংলা")){
                        horoscope="বৃশ্চিক";

                    }else if (language.equals("English")) {
                        horoscope="Scorpio";
                    }

                }

                else if ((selectedMonth == 11 && selectedDay >= 22 && selectedDay <= 30) || (selectedMonth == 12 && selectedDay >= 1 && selectedDay <= 21)){
                    if (language.equals("বাংলা")){
                        horoscope="ধনু";

                    }else if (language.equals("English")) {
                        horoscope="Sagittarius";
                    }

                }

                else
                    horoscope="Illegal date";

                if (name.isEmpty()){
                    if (language.equals("বাংলা")){
                        etName.setError("আপনার নাম লিখুন");
                    }else if (language.equals("English")){
                        etName.setError("Please Enter Your Nick Name");
                    }

                }else if (selectedDay==0){
                    if (language.equals("বাংলা")){
                        Toast.makeText(MainActivity.this,"দিন নির্বাচন করুন",Toast.LENGTH_LONG).show();
                    }else if (language.equals("English")){
                        Toast.makeText(MainActivity.this,"Please Select Day",Toast.LENGTH_LONG).show();
                    }

                }else if (selectedMonth==0){
                    if (language.equals("বাংলা")){
                        Toast.makeText(MainActivity.this,"মাস নির্বাচন করুন",Toast.LENGTH_LONG).show();
                    }else if (language.equals("English")){
                        Toast.makeText(MainActivity.this,"Please Select Month",Toast.LENGTH_LONG).show();
                    }

                }else {
                    Intent intent = new Intent(MainActivity.this,ShowInfo.class);
                    intent.putExtra("Name",name);
                    intent.putExtra("SelectedRashi",horoscope);
                    intent.putExtra("DayValue",selectedDay);
                    intent.putExtra("MonthValue",selectedMonth);
                    startActivity(intent);
                }



            }
        });


    }


}
