package com.vistasoftit.rashifal;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;

public class RashiDetails extends AppCompatActivity {
    String rashi,traits,luckyDay,luckyColor,luckyNumber;
    TextView tvName,tvtrait,tvDay,tvcolor,tvnumber,tvLove,tvMoney,tvcarrier,tvFriend,tvEnemy;
    String language;
    int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rashi_info);
        language= PreferenceManager.getDefaultSharedPreferences(RashiDetails.this).getString("Language", null);

        Intent intent = getIntent();

        position = intent.getIntExtra("Pos",0);
      //  Toast.makeText(RashiDetails.this,"Value"+position,Toast.LENGTH_LONG).show();

        if (position==0){
            if (language.equals("বাংলা")){
                rashi = "মেষ";
                luckyNumber = "১, ৮, ১৭";
                luckyColor="লাল";
                luckyDay="মঙ্গলবার";
                traits="রাশিফল ২০১৭ অনুসারে বছরের শুরু আপনার জন্য সামান্য ভালো হলেও শেষটা চমকপ্রদ থাকবে। কর্মস্থলে আপনার কাজ নিয়ে আপনি অসামঞ্জস্যের পরিস্থিতিতে পড়তে পারেন। অবশ্য মানসিক ও শারীরিক দিক থেকে আপনি যথেষ্ট দীপ্তময় থাকবেন। নিজের অনাবশ্যক খরচের ওপর নিয়ন্ত্রণ রাখা আপনার প্রথম কাজ হওয়া উচিৎ, যাতে প্রয়োজনের সময় টাকার অভাব না হয়। ২৬ জানুয়ারি ২০১৭ পর্যন্ত ভেবে চিন্তে কোন বড় নিয়োগ করবেন। বছরের দ্বিতীয় ভাগে আর্থিক স্থিতিতে বিশেষ পরিবর্তন লক্ষ্য করা যাবে। ছাত্রদের জন্য এই বছর উত্তম। এই বছর সেপ্টেম্বর পর্যন্ত দেওয়া পরীক্ষার ফলাফল আপনার জন্য সুখের অনুভুতি আনতে পারে। পারিবারিক জীবনের কথা বললে এই বছর আপনার ঘরোয়া জীবন সাধারণ থাকবে। নিজের জীবনসাথীর ভাবনার মূল্য দিন এবং ভালো ব্যবহার করুন। এই বছর মায়ের স্বাস্থ্য সম্পর্কিত সমস্যা হতে পারে। মেষ রাশির জন্য এই বছর প্রেমের সম্পর্কের জন্য ভালো। এই বছরের শেষ পর্যন্ত আপনার একজন সৎ এবং একজন ভালো সঙ্গী পাওয়ার খোঁজ শেষ হতে পারে। ঋতু পরিবর্তন এবং বৃষ্টি থেকে হওয়া ব্যাধি থেকে সতর্ক থাকুন। সুস্থ থাকার জন্য নিয়মিতভাবে যোগব্যায়াম করুন।";
            }else if (language.equals("English")) {
                rashi = "Aries";
                luckyNumber = "1, 8, 17";
                luckyDay="Tuesday";
                luckyColor="Red";
                traits="2017 will be nothing less than a life-changing year for you Aries -- especially as it pertains to your most personal relationships. In both your business life and private world you can anticipate a profound opportunity to align yourself with a like-minded soul who not only gets you, but supports you as well.\n" +
                        "\n" +
                        "You have become so comfortable going it alone, Aries, that this might take some getting used to. In fact, you may even experience a few growing pains as you adjust to the amazing cosmic luck Jupiter moving through your partnership sector will bring. These adjustments are in full force between March 4 and April 2, when Venus, the planet of love, self-worth, money, and beauty, retrogrades in Aries. It may almost feel like you're being \"punked\" by the universe when this happens.";
            }

        }else if (position==1){
            if (language.equals("বাংলা")){
                rashi = "বৃষ";
                luckyNumber = "২, ৬, ৯, ১২, ২৪";
                luckyColor="সবুজ, গোলাপি";
                luckyDay="শুক্রবার, সোমবার";
                traits="এই সময় আপনার জন্য যথেষ্ট পরিশ্রমের হবে, কারণ শনির অষ্টম ঘরে গোচর করার জন্য আপনার অনেক কাজ ধীরে কিন্তু নিশ্চিত গতিতে এগবে। সম্পত্তির কাজে নিযুক্ত ব্যাক্তিদের লাভের আশা রয়েছে। ২০১৭ এর রাশিফল অনুসারে আপনি শেয়ারে বিনিয়োগ করলে লাভবান হতে পারেন। বছরের শুরুটা ব্যয় বহুল হবে। আপনি আপনার সুখ-সুবিধাতে অনেক ব্যয় করবেন। নিজের বিলাসিতা বন্ধ করুন নাহলে কিছু আর্থিক সমস্যা হতে পারে। ছাত্রদের জন্য সময় অনুকূল থাকবে। উচ্চশিক্ষার শিক্ষার্থীদের মনের মতো ফলাফল পাবার সম্ভাবনা রয়েছে। বৈবাহিক জীবনে মধুরতা বাড়ানোর চেষ্টা করুন, অনাবশ্যক ঝগড়া-বিবাদ থেকে বাঁচুন। একে অপরকে খুব ভালো করে বোঝার চেষ্টা করুন। বছরের দ্বিতীয় ভাগ থেকে আপনি আপনার জীবনসাথীর সঙ্গে খুব আনন্দে কাটাবেন। প্রেমিক প্রেমিকাদের জন্য এই সময় অনুকূল থাকবে। এই সময় আপনি খুব আকর্ষণীয় লাগতে পারেন। কোন বিপরীত লিঙ্গের প্রতি আপনার আগ্রহ বাড়বে।";
            }else if (language.equals("English")){
                rashi = "Taurus";
                luckyNumber = "2, 6, 9, 12, 24";
                luckyDay="Friday, Monday";
                luckyColor="Green, Pink";
                traits="In some ways, 2017 will be a year you look back on as a time of tending to your personal garden in order to flourish remarkably in the years to come. It's not that you won't enjoy periods of glorious opportunity -- you will. It is vital, however, for you to take the cosmic landscape of 2017 seriously in order to nourish your physical body as well rejuvenate your spirit.\n" +
                        "\n" +
                        "You'll be on familiar territory with financial repairs as well -- and this will last until December 2017. Saturn, the planet of restriction and limitation, but also responsibility and maturity, has been in your 8th House of Shared Resources since late December 2014, so his presence is no stranger to you. You've already felt the pinch of his lesson as it relates to you learning how to get by in the material world without having as much support from others. Although it might have felt is if you were tested to the limit in a situation related to taxes, loans, insurance, or inheritance, the most difficult of Saturn's tests are behind you, since they were most troubling back in 2016. This year, Saturn will wrap up his lesson in teaching you how to build a solid financial future without relying on others much, but you are in a position to show Saturn exactly what you're made of. You, Taurus, are a financial sign after all, and if there is anyone capable of figuring out how to manage money, it is you.";
            }

        }
        else if (position==2){
            if (language.equals("বাংলা")){
                rashi = "মিথুন";
                luckyNumber = "৫, ৭, ১৪, ২৩";
                luckyColor="হালকা সবুজ, হলুদ";
                luckyDay="বুধবার";
                traits="চাকরি ও ব্যবসায় ব্যস্ততা দিয়ে বছরের শুরু হবে। আপনার অত্যধিক চেষ্টার পরেও চাকরি থেকে সাধারন ফলাফল পেতে পারেন। কিন্তু এতে নিরাশ বা হতাশ একেবারে হবেন না এবং চেষ্টা করতে থাকুন। কারণ বছরের মধ্যে থেকে বানানো যোজনা সম্পূর্ণ হতে পারে। অর্থ সম্পর্কিত বিষয়ে আপনার ব্যয় সামান্য বাড়তে পারে। সাংসারিক ব্যয় পূরণের জন্য আপনাকে ধার নিতে হতে পারে। বছরের দ্বিতীয় ভাগে কিছু অব্যাহতি পেতে পারেন এবং আপনার অর্থ বিষয়ক বাধা বিপত্তি দূর হবে। মিথুন রাশির ছাত্রদের একটু বেশী পরিশ্রম করতে হবে। প্রতিযোগিতামূলক পরীক্ষায় অংশ নেওয়া পরীক্ষার্থীদের যথেষ্ট সাফল্য পাবার সম্ভাবনা রয়েছে। মিথুন রাশির জাতকদের জন্য এই বছর যেখানে একদিকে আর্থিক বিষয়ে সাবধান থাকার দিকে ইশারা করছে, সেখানে আরেকদিকে ঘর-পরিবার অত্যন্ত খুশির পরিবেশ থাকার সম্ভাবনা রয়েছে। বন্ধুদের ভরপুর সঙ্গ পেতে পারেন। কিন্তু নিজের ভাইবোনদের সাথে কিছু মনোমালিন্য হবার সম্ভাবনা। ২০১৭ সালের ভবিষ্যদ্বাণী অনুযায়ী জীবনসাথী এবং মায়ের কিছু স্বাস্থ্য সম্পর্কিত সমস্যা আপনাকে বিব্রত করবে। যদি কাউকে প্রেম প্রস্তাব দেবার কথা ভাবছেন তাহলে সময় আপনার সপক্ষে রয়েছে। যারা সম্পর্ককে বিয়েতে পরিণত করতে চাইছেন, তাঁদের জন্য এটা শ্রেষ্ঠ সময়। স্বাস্থ্যের খেয়াল রাখুন। যোগ, প্রাণায়াম ও নিয়মিত ধ্যান করুন,লাভ হবে। ";

            }else if (language.equals("English")){
                rashi = "Gemini";
                luckyNumber = "5, 7, 14, 23";
                luckyDay="Wednesday";
                luckyColor="Light-Green, Yellow";
                traits="Romantic heights and career gains will be two amazing factors to help make 2017 an outstanding year for you, Gemini. You're already knee-deep into a vital phase when it comes to love and partnership. Back in September 2016, Jupiter, the planet of blessings, moved into your 5th House of Children, Creativity and Pleasure. This is also the area of your chart that rules opening your heart and falling in love. If single, this creates a tremendous opportunity for you to meet someone who can capture your heart and change your life. For most of 2017 -- until October 10 -- Jupiter will remain in this part of your chart. So, if you're moving into the New Year unattached, know that the universe has someone very special in mind for you. All you have to do is make an effort to socialize and meet new people.";
            }
        }
        else if (position==3){
            if (language.equals("বাংলা")){
                rashi="কর্কট";
                luckyNumber = "২, ৩, ১৫, ২০";
                luckyColor="সাদা";
                luckyDay="সোমবার, বৃহস্পতিবার";
                traits="রাশিফল ২০১৭ অনুসারে বছরের শুরুতে আপনি ধীর গতিতে এগিয়ে যাবেন। আপনার এমন মনে হতে পারে, যে আপনার প্রচেষ্টার যথাযথ ফল পাচ্ছেন না। কিন্তু বাস্তবে এটা আপনার ধৈর্যের পরীক্ষার সময়। বছরের মাঝখানে চাকরি প্রার্থী যুবকরা সাফল্য অবশ্যই পাবে। ব্যাপারিদের জন্য সময় অনুকূল। ব্যবসায় বৃদ্ধি হবে এবং আপনি আর্থিক দিক দিয়ে শক্তিশালী হবেন। এই সময় আপনার নিয়মিত আয় বজায় থাকবে। বছরের দ্বিতীয় ভাগে চাকুরিজীবীরা তাঁদের পরিশ্রমের ফল পদোন্নতি বা বেতন বৃদ্ধির রূপে পেতে পারেন। অর্থনৈতিক ক্ষেত্রে সুসংবাদ পেতে পারেন। লটারি বা জুয়াতে অর্থ ব্যয় না করলে খুব ভালো হয়। এই সময় প্রতিযোগিতামূলক পরীক্ষার ছাত্রদের পড়াশুনায় একাগ্রতা বজায় থাকবে। স্মরণ শক্তি ভালো হওয়ার জন্য আপনি কঠিন বিষয়কে খুব সহজেই বুঝতে পারবেন। সরকারী পরীক্ষায় সাফল্য পাওয়ার পূর্ণ সম্ভাবনা রয়েছে। যদি প্রতিযোগীতামূলক পরীক্ষার ফলাফল যদি এই সময় আসে তাহলে আশার থেকেও ভালো ফল হবে। কর্কট রাশির জাতকেরা এই সময় পরিজন,পরিচিতি এবং বন্ধুদের থেকে প্রত্যেক কাজে সাহায্য পাবেন। প্রেম ও বৈবাহিক জীবনে মধুরতা বাড়বে। এই সময় প্রেম বিষয়ে আপনার ব্যস্ততা বাড়বে এবং প্রেমের সম্পর্কে গভীরতা আসবে। প্রিয়জনের সাথে কোথাও বেড়াতে যাওয়ার পরিকল্পনা হতে পারে। এই সময় আপনি খোশ-মেজাজী থাকবেন।";

            }else if (language.equals("English")){
                rashi="Cancer";
                luckyNumber = "2, 3, 15, 20";
                luckyDay="Monday, Thursday";
                luckyColor="White";
                traits="This year you'll begin to enjoy your family life more than you have in quite some time. Yes, that should be music to your ears! You'll begin 2017 with Jupiter, the planet of blessings, moving comfortably through the area of your chart that rules your domestic world. Until October 10, you'll enjoy this once-in-12-year influence (which began for you back in September 2016). As a result, you might finally be ready to make that move to your dream house or apartment this year. You might also be ready to purchase a vacation home if that has been something you've yearned for in the past.\n" +
                        "\n" +
                        "Even if you don't physically relocate this year, you can anticipate something connected to your family life to occur that gives you great joy. Someone might announce that a baby is on the way. Or, it's possible that you'll invite someone to move in with you. You may also notice that your clan is generally more amiable toward each other than in recent years. Ah, you'll be thrilled!";
            }
        }
        else if (position==4){
            if (language.equals("বাংলা")){
                rashi="সিংহ";
                luckyNumber = "১, ৩, ১০, ১৯";
                luckyColor="সোনালী, হলুদ, কমলা";
                luckyDay="রবিবার";
                traits="সবমিলিয়ে এই বছর আপনার আয় ভালোই থাকবে। চাকুরীজীবীরা নিজের দক্ষতায় এগিয়ে যাওয়ার সুযোগ পাবেন। সরকারী চাকরি যাঁরা করেন তাঁদের বিশেষ সাফল্য পাবার সম্ভাবনা রয়েছে। আপনার আটকে থাকা কাজের গতি বাড়বে। কিন্তু রিয়েল স্টেটের কাজ যাঁরা করেন তাঁদের সাবধানে থাকতে হবে নাহলে ক্ষতি হবার সম্ভাবনা রয়েছে। সিংহ রাশির জাতকের জন্য এই সময় অর্থ প্রাপ্তির ভালো যোগ রয়েছে। কোন পুরনো ধার ফিরে পাওয়ায় আর্থিক স্থিতিতে যথেষ্ট উন্নতি হবে। ঋণ এবং আর্থিক বিষয়ে আপনার প্রচেষ্টা সফল হতে পারে। শিক্ষা সম্পর্কে আলোচনা করলে এটাই বলব যে আপনি নিয়মিত পড়াশুনায় মন দেবেন। প্রতিযোগিতামূলক পরীক্ষা এবং সরকারী বা নিজ ক্ষেত্রের পরীক্ষার প্রস্তুতি করা জাতকের সাফল্য পাবার সম্ভাবনা রয়েছে। আপনার পরিবারের থেকে কিছু ধন লাভ হতে পারে বা কোন সাহায্য পেতে পারেন। জীবন সাথীর সঙ্গে আশান্তি হতে পারে সেইজন্য অযথা ঝগড়া না করলে ভালো হয়। এইজন্য কথাবার্তা ও ব্যবহারকে সংযত রাখুন এবং নিজেদের মধ্যে অহংকার আসতে দেবেন না। আপনি আপনার গুরুর সান্নিধ্য পেতে পারেন কারণ আধ্যাত্মিক দৃষ্টি থেকে এই সময় লাভজনক। আপনার প্রেম সম্পর্কে দিন দিন পরিপক্কতা আসবে। কিন্তু আপনার প্রেমিক প্রেমিকার সাথে সরাসরি দেখা না হওয়ার জন্য আপনার মন কিছুটা ব্যাকুল থাকতে পারে। যে জাতক একলা আছেন, তাঁর জীবনে কোন বিশেষ ব্যাক্তির আসার সম্ভাবনা রয়েছে। রাশিফল ২০১৭ অনুসারে সবমিলিয়ে এই সময় স্বাস্থ্য ভালো থাকবে।";
            }else if (language.equals("English")){
                rashi="Leo";
                luckyNumber = "1, 3, 10, 19";
                luckyDay="Sunday";
                luckyColor="Gold, Yellow, Orange";
                traits="2017 will be a year where your words truly matter. Fortunately, you'll have an opportunity to not only enhance your communication skills, but to benefit from them in remarkable ways.\n" +
                        "\n" +
                        "You can thank Jupiter for this phenomenon. Back in September 2016, he entered your message sector for the first time in 12 years. Until October of this year, he'll continue to move through this area of your chart, blessing you in all matters of thinking, speaking, learning, and writing. If you've always wanted to write a book or share your ideas during a major presentation, this is the year to do so. If you're part of a professional organization that has an annual conference, this will be the year to volunteer to be a speaker. Others will eagerly soak up the information you have to share and your communication style will be sparkling!";
            }
        }
        else if (position==5){
            if (language.equals("বাংলা")){
                rashi="কন্যা";
                luckyNumber = "৫, ১৪, ১৫, ২৩,৩২";
                luckyColor="সাদা, হলুদ";
                luckyDay="বুধবার";
                traits="২০১৭ এর রাশিফল অনুযায়ী চাকুরীজীবী জাতকের এই সময় নিজের কৌশলের দ্বারা পদোন্নতি এবং বেতন বৃদ্ধি হবে। এই বছর আপনার সাফল্য পাবার প্রবল সম্ভাবনা রয়েছে। ব্যবসায় ধীর গতিতে উন্নতি হবে। যেকোনো ব্যবসায় ভেবে চিন্তে অংশীদারিত্ব করা হিতকর হবে। বছরের মধ্য ভাগের পর থেকে অবস্থা আপনার পক্ষে হবে। আর্থিক ক্ষেত্রে আপনাকে বিশেষ সাবধান থাকতে হবে কারণ আয় থেকে ব্যয় বেশী হবে। যদিও আয়ের উৎস থাকবে এবং আপনার নিয়মিত আয়ে কোন বাধা আসবে না। কিন্তু অর্থ খুব ধীর গতিতে আপনার কাছে আসবে। এই সময় ছাত্রদের জন্য কঠিন পরিশ্রমের। শিক্ষায় আপনার ধীর গতিতে উন্নতি হবে। শনির ঢাইয়ার কারনে স্বাস্থ্য খারাপ হতে পারে এবং পড়াশুনায় মন বসবে না। বৈবাহিক জীবনের জন্য এই সময় একটু অশান্তিপূর্ণ থাকতে পারে। আপনার নিজের ব্যবহারের প্রতি বিশেষ ধ্যান দেওয়া প্রয়োজন, নাহলে সম্পর্কে কিছু বাধা-বিপত্তি আসার সম্ভাবনা রয়েছে। বাবা অথবা কোন বয়স্ক ব্যাক্তির স্বাস্থ্য আপনার চিন্তার প্রমুখ কারণ হতে পারে। সামাজিক ক্ষেত্রেও আপনাকে সতর্ক থাকতে হবে কিছু অপমানজনক পরিস্থিতির সৃষ্টি হতে পারে। কারো সামনে প্রেম প্রস্তাব রাখার সময় তাড়াহুড়ো করবেন না। আপনার সঙ্গীর ওপর সন্দেহ করা ছেড়ে দিন। প্রেমিক প্রেমিকাকে সময় না দেওয়ার জন্য সম্পর্কে কিছু অশান্তি আসতে পারে। পরস্পরকে দোষারোপ না করে একসাথে পরিস্থিতির মোকাবিলা করুন। স্বাস্থ্যর ক্ষেত্রে এই সময় বেশী আনন্দ দেবে না। আপনাকে মৌসুমি রোগ আক্রান্ত করতে পারে।";
            }else if (language.equals("English")){
                rashi="Virgo";
                luckyNumber = "5, 14, 15, 23, 32";
                luckyDay="Wednesday";
                luckyColor="Grey, Beige, Pale-Yellow";
                traits="2017 will give you more opportunity to enhance your cash flow, but at the same time, it'll encourage you to make the smartest choices with your money instead of giving in to indulgent spending.\n" +
                        "\n" +
                        "Make no mistake -- the money is there for you to grasp. Jupiter, the planet of expansion and prosperity, will continue to tour your earned income sector until October 10, 2017. As a result, you'll enjoy a major boost in confidence to develop and market your talents. Net worth should increase because of this. If you're in business for yourself, this will be a perfect time to branch out and offer new services or raise your rates for existing ones. If you work for a company, a raise may be on its way. This might also be a time where you get an appraisal for a piece of jewelry, art, fur, or other valuable possession and decide to sell it for cash.";
            }
        }
        else if (position==6){
            if (language.equals("বাংলা")){
                rashi="তুলা";
                luckyNumber = "৪, ৬, ১৩, ১৫, ২৪";
                luckyColor="গোলাপি, সবুজ";
                luckyDay="শুক্রবার";
                traits="চাকুরীজীবীদের জন্য এই বছর ভালো থাকবে। বিরোধীদের পিছনে ফেলে আপনি এগিয়ে যাবেন। সেলস এবং মার্কেটিং এর সাথে যুক্ত ব্যক্তিরা নিজেরদের কথার মাধ্যমে গ্রাহকদের থেকে কার্য সম্পন্ন করতে সফল হবেন। ব্যবসায়িরা এই বছর কোন নতুন কাজে অর্থ বিনিয়োগ করলে লাভবান হবেন। কিন্তু বছরের শেষে কোন বড় বিনিয়োগ করবেন না। আর্থিক বিষয়ের জন্য এই বছর সন্তোষজনক মনে হচ্ছে। অর্থ প্রাপ্তির যোগ রয়েছে। কোন পুরনো ধার হঠাৎ শোধ হবার সম্ভাবনা রয়েছে। এই ভবিষ্যদ্বাণী ২০১৭ ইঙ্গিত করছে যে, ছাত্রদের কঠিন পরিশ্রমের জন্য প্রস্তুত থাকতে হবে। যদিও এই সময় আপনার বৌদ্ধিক শক্তি যথেষ্ট ভালো থাকবে। কেরিয়ারের নির্বাচন করার জন্য বিশেষজ্ঞের পরামর্শ নিন। আপনার শিক্ষকের থেকে সাহায্য পাবার সম্ভাবনা রয়েছে। পরিবারের কোন সদস্যের স্বাস্থ্য খারাপ থাকার জন্য আপনার অর্থ ব্যয় হবে। ভাই-বন্ধুদের সাথে কোন বড় ঝগড়া হতে পারে। গাড়ি চালানোর সময় সতর্ক থাকুন, কেননা আঘাত পাবার সম্ভাবনা বেশী। পিতার স্বাস্থ্য চিন্তার বিষয় হতে পারে। মা এবং পরিবারে সাথে সম্পর্ক একটু অশান্তিপূর্ণ থাকতে পারে। বছরের দ্বিতীয় ভাগে পরিস্থিতি ভালো হতে শুরু করবে। প্রেম সম্পর্কের বিষয়ে একটু দেখে শুনে চলার সময়। প্রিয়জনকে প্রেম প্রস্তাব দেওয়ার ভাবনা বর্তমানে স্থগিত করুন। বিবাহিত লোকেরা জীবনসঙ্গীকে বেশী সময় দিতে পারবেন না। বিবাহে ইচ্ছুক ব্যাক্তিদের বর্তমানে ভালো জীবনসঙ্গী পেতে একটু বাধার সম্মুখীন হতে হবে।স্বাস্থ্য বিষয়ে আপনাকে একটু সাবধানে চলার প্রয়োজন রয়েছে। কাজের চাপের জন্য আপনি শারীরিক ভাবে দুর্বলতা এবং ক্লান্তি অনুভব করবেন।";

            }else if (language.equals("English")){
                rashi="Libra";
                luckyNumber = "4, 6, 13, 15, 24";
                luckyDay="Friday";
                luckyColor="Pink, Green";
                traits="Without a doubt, Libra, 2017 is your year to shine! Jupiter, the planet of abundance, blessings and protection, has been in your sign since September 2016, so you're already feeling the positive vibes that this placement offers. Life is somehow magical and grand again, and that's exactly how it should be. Jupiter has handed you a bottle containing all the faith and optimism there is, and you're ready to sprinkle it everywhere you go. Basically, this means that whatever you touch this year is sure to turn to gold. Jupiter will remain in your sign until October 2017, so you'll want to maximize every drop of goodness there is to be had.\n" +
                        "\n" +
                        "This is your year to initiate any personal endeavor you truly believe in. Whether it's connected to your professional goals, family life, personal or spiritual development, or a relationship, Jupiter has one word for you: YES!";
            }
        }
        else if (position==7){
            if (language.equals("বাংলা")){
                rashi="বৃশ্চিক";
                luckyNumber = "৮, ১১, ১৮, ২২";
                luckyColor="লাল";
                luckyDay="মঙ্গলবার";
                traits="এই বছরের শুরুতে কোন ব্যবসা শুরু করার জন্য সময় উত্তম। কাজকর্ম বৃদ্ধি পাবার জন্য আপনার আয় বাড়ার সম্ভাবনাও রয়েছে। কর্মস্থলে আপনি কোন বড় কর্মকর্তার সাহায্য পেতে পারেন। উচ্চ আধিকারিকের থেকে আপনি প্রশংসা পেতে পারেন। ভাগ্য এই সময় আপনার সঙ্গ দেবে। অর্থ উপার্জনের জন্য সময় ভালো। তবে এই বছর আপনি যা আয় করবেন তার থেকে বেশী ব্যয় করবেন। কোথাও আটকে থাকা অর্থ ফেরত পেতে পারেন। ছাত্রদের জন্য সময় কিছুটা অনুকুল বলা যেতে পারে। আপনি পড়াশোনায় খুব ভালো ফল দেখাতে পারবেন। যদি আপনি গবেষণারত ছাত্র হয়ে থাকেন তাহলে খুব ভালো ফলের আশা করতে পারেন। আপনি এই বছর ঘরোয়া কাজে অত্যধিক অর্থ ব্যয় করবেন। ভবিষ্যফল ২০১৭ আপনাকে অনাবশ্যক ব্যয় প্রতিরোধ করার সুপারিশ করছে। জীবনসাথীর কাছ থেকে আপনি কোন দামী উপহার পাবার আশা করতে পারেন। বছরের মাঝখান থেকে আপনার সম্পর্ক কিছু অশান্তিপূর্ণ থাকতে পারে। প্রেম সম্পর্কের সুচনা করার জন্য খুব সুন্দর সময়। বিপরীত লিঙ্গের প্রতি আপনার অত্যন্ত আগ্রহ বাড়বে। এমন অবস্থায় একের বেশী প্রেমের সম্পর্ক তৈরি হতে পারে। যার ফলে আপনার জন্য অসামঞ্জস্যের পরিস্থিতি উৎপন্ন হতে পারে। প্রেমের বিয়েতে ইচ্ছুক জাতককে পরিবারের সহমতে বিবাহ করার জন্য বছরের শেষ পর্যন্ত অপেক্ষা করতে হতে পারে। শারীরিক স্বাস্থ্যের দিক থেকে কোন বড় মুশকিল উৎপন্ন হবে না।";
            }else if (language.equals("English")){
                rashi="Scorpio";
                luckyNumber = "8, 11, 18, 22";
                luckyDay="Tuesday";
                luckyColor="Scarlet, Red, Rust";
                traits="2017 may be the year where you finally begin to learn how to work smarter for your money instead of harder for it. Saturn, the planet of lessons and responsibility, will continue to tour your 2nd House of Earned Income all year. He has been in this area of your chart for quite some time already -- since December 2014. As a result, you've likely been feeling the pinch to your wallet. You might have learned to pare down expenses in order to do more with less income during certain periods of this transit. Or, it's possible that your income has maintained a status quo, but you've had a significant expense that took most of your cash to purchase. This could have been a home, college education, car, or any other big ticket item. No matter what the details were, you've become more frugal and mature about money matters as a result.";
            }
        }
        else if (position==8){
            if (language.equals("বাংলা")){
                rashi="ধনু";
                luckyNumber = "৩, ৭, ৯, ১২, ২১";
                luckyColor="নীল";
                luckyDay="বৃহস্পতিবার";
                traits="চাকুরীজীবীদের এই বছর বড় ধরনের সাফল্য পাবার সম্ভাবনা রয়েছে। আপনার বেতন বাড়তে পারে এবং পদোন্নতি হতে পারে। ব্যবসায়িক ক্ষেত্রে আপনি উল্লেখযোগ্য সাফল্য পেতে পারেন। সংক্ষিপ্তে বা কম পরিশ্রমে টাকা রোজগারের ভাবনা যদি আপনার মনে এসে থাকে তাহলে এই সময় সেটা মন থেকে মুছে ফেলুন। রাশিফল ২০১৭ অনুসারে এই বছরের প্রথম ভাগ থেকে আপনাকে সামান্য আর্থিক সমস্যার সম্মুখীন হতে হবে। এই জন্য অর্থ সঞ্চয় করুন এবং বাজে খরচা থেকে বিরত হন। কাজকর্মের জন্য বাইরে গেলে টাকা বেশী খরচ হবে কিন্তু আপনার আর্থিক লাভও হবে। ছাত্ররা পড়াশুনার জন্য ভালো পরিবেশ পাবে। আপনার জ্ঞান পিপাসা বাড়বে। মনোবিজ্ঞান ও গূঢ়বিজ্ঞান ছাত্রদের সময় অনুকুল থাকবে। বাণিজ্য বিভাগে কেরিয়ার বানাতে চাওয়া ছাত্রদের সফলতা পাবার সম্ভাবনা আছে। পরিবারের লোকের সাথে আপনার পুরনো মনোমালিন্য মিটতে পারে। আপনার জীবন সঙ্গীর সাথে আদর ও প্রেমমূলক ব্যবহার করুন কারণ তাঁকে আপনার সবসময় প্রয়োজন। পরিবারে কোন মাঙ্গলিক এবং ধার্মিক অনুষ্ঠানের আয়োজনও হতে পারে। প্রেম প্রসঙ্গের জন্য এই বছর চমকপ্রদ হতে পারে। আপনি প্রেমের সাথে যুক্ত কোন নতুন প্রস্তাব পেতে পারেন। যে জাতকের বিয়ের ইচ্ছা রয়েছে তার জন্য নতুন জীবনের সুত্রপাত ঘটবে অর্থাৎ বিবাহের মতো মাঙ্গলিক অনুষ্ঠান সম্পন্ন হওয়ার সময় এটা। এই বছর স্বাস্থ্য সম্পর্কে সচেতন থাকুন। জাঙ্ক ফুড ইত্যাদির মতো বাইরের খাবার এড়িয়ে চলুন।";

            }else if (language.equals("English")){
                rashi="Sagittarius";
                luckyNumber = "3, 7, 9, 12, 21";
                luckyDay="Thursday";
                luckyColor="Blue";
                traits="2017 will be a year when you continue to gain maturity and wisdom thanks to Saturn's lessons. Saturn, the planet of restriction but also commitment, has been in your sign since December 2014. As a result, you've likely taken on new responsibilities in your life in more than one area. This has also been a stretch of time where you may have felt tested or that the universe has handed you what appeared to be an unfair burden. If that has been the case, it wasn't to single you out. In fact, it was to show you just how much ability you have to rise to any occasion and handle limitations with fortitude.\n" +
                        "\n" +
                        "This year, although Saturn will continue to move through your sign, you'll be in a different position. He'll be at a gorgeous angle to Uranus -- the planet of revolution -- on May 19 and November 11. You'll be able to continue to lay the groundwork on your personal goals and plans without restraint. You'll be able to handle your duties without feeling suffocated. This, Sagittarius, is your year to show the world just how wise you can be. Your ability to try new approaches in order to stabilize your life will be well supported. You'll see this specifically as it relates to your love life, children, or a creative endeavor.";
            }
        }
        else if (position==9){
            if (language.equals("বাংলা")){
                rashi="মকর";
                luckyNumber = "৪, ৮, ১৩, ২২";
                luckyColor="বাদামী, কালো";
                luckyDay="শনিবার";
                traits="এই বছর চাকুরীজীবী ব্যাক্তিরা সাহস ও উৎসাহে পরিপূর্ণ থাকবেন। কর্মস্থলে পদোন্নতি এবং মান-সম্মান পাবার পুরোপুরি লক্ষণ রয়েছে। ব্যবসায় আপনি সম্মান ও প্রতিষ্ঠা অর্জন করবেন। আপনার নিজের প্রতি বিশ্বাস আপনাকে অনবরত জয়ী করবে। তবে অর্থের লেনদেনে সতর্কতা গ্রহণ করা উচিৎ। কোন কাছের বিশ্বাসযোগ্য ব্যাক্তির ওপর টাকাপয়সা নিয়ে বেশী ভরসা করা ক্ষতিকর হতে পারে। মকর রাশিদের জন্য আর্থিক দিক দিয়ে এই বছর সাধারন হবে। অকারণে ব্যয় বাড়ার সম্ভাবনা রয়েছে এই জন্য যথাসম্ভব অর্থ সংগ্রহ করার চেষ্টা করুন। ছরের দ্বিতীয় ভাগ আপনার জন্য মিশ্র থাকবে। ছাত্রদের জন্য সময় অনুকূল। শিক্ষার্থী এই সময় যেকোনো পরীক্ষায় ভালো ফল করে নিজেদের প্রমান করতে পারেন। বিজ্ঞান, কলা এবং কারিগরি শিক্ষার প্রতি আপনার আগ্রহ বাড়বে। পারিবারিক জীবনের পরিস্থিতি সাধারন থাকবে কিন্তু পরিবারের কিছু কাছের লোকের সাথে মতপার্থক্য হবার সম্ভাবনা রয়েছে। নিজের রাগকে নিয়ন্ত্রণে রাখা আপনার জন্য প্রয়োজনীয়। জীবনসঙ্গীর সাথে কোথাও বাইরে ঘুরতে যাবার সম্ভাবনা রয়েছে। আপনার সন্তানের উন্নতি সম্বন্ধীয় কোন ভালো খবর শুনতে পারেন। প্রেম সম্পর্কের জন্য সময় সাধারন থাকবে। বাসনার ভাবনাকে নিয়ন্ত্রণ করুন। নতুন প্রেমিক প্রেমিকারা কিছু বাধার সম্মুখীন হতে পারে। আপনার স্কুল বা কলেজে কাউকে পছন্দ হতে পারে। এই সময় স্বাস্থ্যের পরিপ্রেক্ষিতে খুব ভালো বলা যাবে না।";
            }else if (language.equals("English")){
                rashi="Capricorn";
                luckyNumber = "4, 8, 13, 22";
                luckyDay="Saturday";
                luckyColor="Brown, Black";
                traits="2017 will be a banner career year for you Capricorn, so get ready to do what you do best -- succeed! You can thank Jupiter, the planet of expansion and prosperity, for much of the professional gains you'll enjoy. He moved into your 10th House of Honors back in September 2016, so you're already feeling his positive vibes. You might have already started to receive incredible accolades from a VIP or an outright promotion. Or it's possible that you have plans to launch a new business this year. No matter what you do, it appears you've got the Midas touch -- and everyone will know it.\n"+
                "\n"+
                "In other news, your home and family life will need some attention this year. Thankfully, it's nothing too abrasive. Venus will retrograde through your domestic 4th house from March 4 - April 2, and then will retrograde into your 3rd House of Siblings and Communication from April 2 - 15. As a result, it's possible that you and your clan will need to do some re-evaluating about how you're spending money as a family. Or a real estate matter may come up that requires consideration. If there is any tension between you and a relative, the key to smoothing it over during this time will be an honest conversation about where each of you may feel under-appreciated. You can and will move past this!";
            }
        }
        else if (position==10){
            if (language.equals("বাংলা")){
                rashi="কুম্ভ";
                luckyNumber = "৪, ৭, ১১, ২২, ২৯";
                luckyColor="নীল, রূপালী";
                luckyDay="শনিবার";
                traits="চাকুরীজীবীদের জন্য সময় অনুকূল। যদি পদোন্নতি পাবার ব্যাপারে ভাবছেন তাহলে এই বছর পদোন্নতি হবে। এই ভবিষ্যদ্বাণী ২০১৭ অনুসারে বেকারদের ভালো চাকরি পাবার সম্ভাবনা রয়েছে। ব্যবসায়ীরা অর্থ সংগ্রহ করায় সফল হবেন। বছরের দ্বিতীয় ভাগে আপনার ব্যবসায়ের সাথে যুক্ত কিছু সমস্যা থেকে সাবধান থাকবেন। আপনার আর্থিক স্থিতি এই বছর সাধারণ থাকবে। বাজে খরচা করবেন না। যেখানে প্রয়োজন সেখানে ব্যয় করুন এবং যথাসম্ভব সঞ্চয় করার প্রচেষ্টা করুন। এই সময়কালে আপনি কঠিন পরিশ্রম করে অর্থ উপার্জনে সফল হবেন। ছাত্রদের জন্য এই সময় মিশ্র ফলাফল দিতে পারে। উচ্চ শিক্ষার শিক্ষার্থীদের মনের মতো ফলাফল পাবার সম্ভাবনা রয়েছে। যে ছাত্র বিদেশে গিয়ে উচ্চ শিক্ষা পেতে চান তাঁদের জন্য নতুন সুযোগ পাবার সম্ভাবনা রয়েছে। এই সময়ে পরিবারে সৌহার্দ্য থাকবে এবং পৈতৃক সম্পত্তির সাথে যুক্ত মামলার সমাধান হবে। কোন ধর্মীয় স্থানের সাথে যুক্ত ভ্রমণ আপনার জন্য আনন্দদায়ক হবে। যেকোনো গুরুত্বপূর্ণ কাজ করার আগে বাড়ির গুরুজনদের পরামর্শ আপনার জন্য ফলপ্রসু সিদ্ধ হবে। প্রেম সম্পর্কের জন্য বছর অনুকূল। কর্মস্থলে কোন সঙ্গী পেতে পারেন। বছরের শেষ পর্যন্ত আপনি আপনার প্রেমিক-প্রেমিকাকে জীবনসঙ্গী হিসাবে পেতে পারেন। এই বছর স্বাস্থ্য সাধারণ থাকবে। শ্বাসকষ্টে পীড়িত ব্যাক্তিদের সাবধানে থাকতে হবে। ঠিকসময়ে নিজের ডাক্তারি পরীক্ষা করাতে থাকুন এবং পরিস্থিতি প্রথম থেকে নিজের নিয়ন্ত্রণে রাখুন।";
            }else if (language.equals("English")){
                rashi="Aquarius";
                luckyNumber = "4, 7, 11, 22, 29";
                luckyDay="Saturday";
                luckyColor="Light-Blue, Silver";
                traits="Your life will be a stunning adventure in 2017. In fact, you'll look back on this year as one filled with incredible travel, educational, and other life experiences that truly broaden your horizons. It's all thanks to Jupiter. Back in September 2016 he entered the area of your chart connected to the higher mind and broad expansion. You begin this year with Jupiter taking you on at least one pleasurable journey toward knowledge you've never had before.\n" +
                        "\n" +
                        "This might be due to your recent decision to sign up for that advanced degree, license, or certification you've always wanted to obtain. Studying at a university this year will give you great pleasure but also remarkable wisdom -- and you're ready to soak it all up. Or, it might be that you've got a serious travel bug and have decided to make this a year of international travel to locations you've always wanted to visit. Go for it!";
            }
        }
        else if (position==11){
            if (language.equals("বাংলা")){
                rashi="মীন";
                luckyNumber = "৩, ৯, ১২, ১৫, ১৮, ২৪";
                luckyColor="ফিকে লাল, বেগুনী, সবুজ";
                luckyDay="বৃহস্পতিবার";
                traits="এই বছর আপনাকে কঠিন পরিশ্রম করতে হবে। চাকুরীজীবীদের এই বছরের দ্বিতীয় ভাগে পদোন্নতি হবার সম্ভাবনা রয়েছে। ব্যবসায়ীরা কর্তব্য-নিষ্ঠা এবং পরিশ্রমের কারনে নিজের আয় বাড়াতে সফল হবেন। শেয়ার বাজারের সাথে যুক্ত ব্যাক্তি কোন দীর্ঘকালীন বিনিয়োগের ব্যাপারে ভাবতে পারেন। জুয়া এবং লটারি থেকে দূরে থাকায় ভালো। আর্থিক দিক দিয়ে এই বছর আপনার জন্য সাধারণ থাকবে। বছরের মধ্য থেকে আর্থিক লাভ হবার সম্ভাবনা দেখা যাচ্ছে যাতে আপনার অর্থ সম্পর্কে চিন্তার সহজে নিবারণ হয়ে যাবে।দীর্ঘকালীন নিয়োগের জন্য ভালো সময়। বছরের শেষ পদ আপনার জন্য বেশি লাভদায়ক হবে। এই বছর পড়াশুনায় আপনার একাগ্রতা বাড়বে। সরকারী পরীক্ষায় সাফল্য পাবার পূর্ণ সম্ভাবনা রয়েছে। যে শিক্ষার্থী পড়ার জন্য বিদেশ যেতে চায়, তাদের প্রচেষ্টা শক্তিশালী করতে হবে। ২০১৭ এর ভবিষ্যফল অনুসারে উচ্চশিক্ষার শিক্ষার্থীর জন্য এই সময় কঠিন পরিশ্রমের হবে। এই বছর আপনার পারিবারিক জীবনে সামঞ্জস্য আনার আবশ্যকতা রয়েছে। অযথা ঝগড়া থাকে বাঁচুন এবং প্রত্যেকের ভাবনাকে সম্মান করতে শিখুন। বাড়িতে কোন ধার্মিক ও মাঙ্গলিক অনুষ্ঠান হলে মন প্রসন্ন থাকবে। আপনি কোন নতুন গাড়ি বা জমি-জায়গা কিনতে পারেন। জীবনসঙ্গীর সাথে কোথাও বাইরে ঘুরতে যাবার সম্ভাবনা রয়েছে। সন্তানের উন্নতিতে আপনি আনন্দ অনুভব করবেন। যদি কাউকে প্রেম প্রস্তাব দেবার কথা ভাবছেন তাহলে দেরি করবেন না। আপনার সদর্থক উত্তর পাবার সম্ভাবনা রয়েছে। পুরনো প্রেমিক-প্রেমিকারা নিজের সম্পর্কের ক্ষেত্রে কিছু অস্বাচ্ছন্দ্য অনুভব করতে পারেন। ধৈর্য হারাবেন না এবং নিজের ব্যবহারে রুক্ষতা ও কটুতা আস্তে দেবেন না। আপনার স্বাস্থ্য সম্পর্কে একটু সাবধান হওয়া প্রয়োজন। ";
            }else if (language.equals("English")){
                rashi="Pisces";
                luckyNumber = "3, 9, 12, 15, 18, 24";
                luckyDay="Thursday";
                luckyColor="Mauve, Lilac, Purple, Violet, Sea green";
                traits="This will be an exciting year for you on many fronts -- from work and health matters to finances and career developments. You'll want to know exactly how to use the cosmic support the universe plans on giving you, but you'll also want to understand more about its lessons. Taking them seriously assures you'll learn and grow in 2017.\n" +
                        "\n" +
                        "The most glittering news for you has to do with Jupiter. Back in September 2016, he moved into your 8th house, and will remain in this part of your chart until October 10, 2017. The 8th house encompasses money you get from sources other than your own income. This might be money that arrives from lenders such as banks or private investors, or it can be money that you receive due to an inheritance or settlement. This can also relate to your partner's money. Another possibility is that it will be money that comes your way from investment dividends, royalties, commissions, or a tax refund. With Jupiter in your 8th house, you're likely to see a most beneficial occurrence this year relating to any of these financial areas.";
            }
        }


       // Toast.makeText(RashiDetails.this,luckyColor,Toast.LENGTH_LONG).show();
        tvName = (TextView)findViewById(R.id.tvName);
        tvLove = (TextView)findViewById(R.id.love);
        tvMoney = (TextView)findViewById(R.id.money);
        tvcarrier = (TextView)findViewById(R.id.carrier);
        tvFriend = (TextView)findViewById(R.id.friends);
        tvEnemy = (TextView)findViewById(R.id.enemy);



        tvtrait = (TextView)findViewById(R.id.characteristics);
        tvDay = (TextView)findViewById(R.id.tvDay);
        tvcolor = (TextView)findViewById(R.id.tvColor);
        tvnumber = (TextView)findViewById(R.id.tvNumber);
        if (language.equals("বাংলা")){

            tvDay.setText("শুভ দিন :  "+luckyDay);
            tvcolor.setText("শুভ রং :  "+luckyColor);
            tvnumber.setText("শুভ সংখ্যা :  "+luckyNumber);


        }else if (language.equals("English")) {

            tvDay.setText("Lucky Day :  "+luckyDay);
            tvcolor.setText("Lucky Color :  "+luckyColor);
            tvnumber.setText("Lucky Number :  "+luckyNumber);

        }

        tvName.setText( rashi);
        tvtrait.setText(traits);


    }
}
