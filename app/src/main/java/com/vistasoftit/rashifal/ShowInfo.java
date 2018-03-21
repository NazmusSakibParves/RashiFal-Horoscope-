package com.vistasoftit.rashifal;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ShowInfo extends AppCompatActivity {
    String name,rashi,traits,luckyDay,luckyColor,luckyNumber,convertedDay,convertedMonth;
    TextView tvName,tvtrait,tvDay,tvcolor,tvnumber,tvLove,tvMoney,tvcarrier,tvFriend,tvEnemy;
    RatingBar rateLove,rateMoney,rateCarrier,ratingEdu,rateEnemy;
    String language;
    int  modResultLove,modResultmon,modResultcareer,modResultfriend,modResultenemy,dayFintent,monthFintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        language= PreferenceManager.getDefaultSharedPreferences(ShowInfo.this).getString("Language", null);

        Intent intent = getIntent();
        name = intent.getStringExtra("Name");
        rashi = intent.getStringExtra("SelectedRashi");
        dayFintent = intent.getIntExtra("DayValue",0);
        monthFintent = intent.getIntExtra("MonthValue",0);
        convertedDay = String.valueOf(dayFintent);
        convertedMonth = String.valueOf(monthFintent);


        if (rashi.equals("Aries")){
            luckyNumber = "1, 8, 17";
            luckyDay="Tuesday";
            luckyColor="Red";
            traits="The very first Sign of the Zodiac is Aries. And, much on the same lines, the ones born under this Sign consider themselves as the first. Aries are known for their fiery zeal and exuberance. Most impressive are their leadership qualities and optimism. Most Aries have a burning desire to start things off, and make things happen. Individuals born under the Sign Aries are also known to be pioneers of the Zodiac, and many a times it’s their brave journey into the untrodden path that helps them emerge victorious. Aries individuals also exhibit energy and dynamism, and with their innate charisma, they are often able to convince and lead people effortlessly. The Zodiac Sign Aries is found to be compatible with the Signs Sagittarius, Leo, Aquarius and Gemini (Leo is the best suited among others, as a partner for Aries). In relationships, it is often found that the Aries mate is a loving and loyal one.";
        }else if (rashi.equals("Taurus")){
            luckyNumber = "2, 6, 9, 12, 24";
            luckyDay="Friday, Monday";
            luckyColor="Green, Pink";
            traits="Taurus is an Earth sign, just like Virgo and Capricorn, and has the ability to see things from a grounded, practical and realistic perspective. They find it easy to make money and stay on same projects for years, or until they are completed. What we often see as stubbornness can be interpreted as commitment, and their ability to complete tasks whatever it takes is uncanny. This makes them excellent employees, great long-term friends and partners, always being there for people they love. Earthly note makes them overprotective, conservative, or materialistic at times, with views of the world founded on their love of money and wealth.";
        }else if (rashi.equals("Gemini")){
            luckyNumber = "5, 7, 14, 23";
            luckyDay="Wednesday";
            luckyColor="Light-Green, Yellow";
            traits="Expressive and quick-witted, Gemini represents two different personalities in one and you will never be sure which one you will face. They are sociable, communicative and ready for fun, with a tendency to suddenly get serious, thoughtful and restless. They are fascinated with the world itself, extremely curious, with a constant feeling that there is not enough time to experience everything they want to see.";
        }else if (rashi.equals("Cancer")){
            luckyNumber = "2, 3, 15, 20";
            luckyDay="Monday, Thursday";
            luckyColor="White";
            traits="Deeply intuitive and sentimental, Cancer can be one of the most challenging zodiac signs to get to know. They are very emotional and sensitive, and care deeply about matters of the family and their home. Cancer is sympathetic and attached to people they keep close. Those born with their Sun in Cancer are very loyal and able to empathize with other people's pain and suffering.";
        }else if (rashi.equals("Leo")){
            luckyNumber = "1, 3, 10, 19";
            luckyDay="Sunday";
            luckyColor="Gold, Yellow, Orange";
            traits="People born under the sign of Leo are natural born leaders. They are dramatic, creative, self-confident, dominant and extremely difficult to resist, able to achieve anything they want to in any area of life they commit to. There is a specific strength to a Leo and their \"king of the jungle\" status. Leo often has many friends for they are generous and loyal. Self-confident and attractive, this is a Sun sign capable of uniting different groups of people and leading them as one towards a shared cause, and their healthy sense of humor makes collaboration with other people even easier.";
        }else if (rashi.equals("Virgo")){
            luckyNumber = "5, 14, 15, 23, 32";
            luckyDay="Wednesday";
            luckyColor="Grey, Beige, Pale-Yellow";
            traits="Virgos are always paying attention to the smallest details and their deep sense of humanity makes them one of the most careful signs of the zodiac. Their methodical approach to life ensures that nothing is left to chance, and although they are often tender, their heart might be closed for the outer world. This is a sign often misunderstood, not because they lack the ability to express, but because they won’t accept their feelings as valid, true, or even relevant when opposed to reason. The symbolism behind the name speaks well of their nature, born with a feeling they are experiencing everything for the first time.";
        }else if (rashi.equals("Libra")){
            luckyNumber = "4, 6, 13, 15, 24";
            luckyDay="Friday";
            luckyColor="Pink, Green";
            traits="People born under the sign of Libra are peaceful and fair, and they hate being alone. Partnership is very important for Libra -born, and with their victorious mentality and cooperation, they cannot stand to be alone. The Libra is an Air sign, with expressed intellect and a keen mind. They can be inspired by good books, insurmountable discussions and interesting people.";
        }else if (rashi.equals("Scorpio")){
            luckyNumber = "8, 11, 18, 22";
            luckyDay="Tuesday";
            luckyColor="Scarlet, Red, Rust";
            traits="Scorpio-born are passionate and assertive people. They are determined and decisive, and will research until they find out the truth. Scorpio is a great leader, always aware of the situation and also features prominently in resourcefulness.\n" +
                    "Scorpio is a Water sign and lives to experience and express emotions. Although emotions are very important for Scorpio, they manifest them differently than other water signs. In any case, you can be sure that the Scorpio will keep your secrets, whatever they may be.";
        }else if (rashi.equals("Sagittarius")){
            luckyNumber = "3, 7, 9, 12, 21";
            luckyDay="Thursday";
            luckyColor="Blue";
            traits="Curious and energetic, Sagittarius is one of the biggest travelers among all zodiac signs. Their open mind and philosophical view motivates them to wander around the world in search of the meaning of life.\n" +
                    "Sagittarius is extrovert, optimistic and enthusiastic, and likes changes. Sagittarius-born are able to transform their thoughts into concrete actions and they will do anything to achieve their goals.";
        }else if (rashi.equals("Capricorn")){
            luckyNumber = "4, 8, 13, 22";
            luckyDay="Saturday";
            luckyColor="Brown, Black";
            traits="Capricorn is a sign that represents time and responsibility, and its representatives are traditional and often very serious by nature. These individuals possess an inner state of independence that enables significant progress both in their personal and professional lives. They are masters of self-control and have the ability to lead the way, make solid and realistic plans, and manage many people who work for them at any time. They will learn from their mistakes and get to the top based solely on their experience and expertise.";
        }else if (rashi.equals("Aquarius")){
            luckyNumber = "4, 7, 11, 22, 29";
            luckyDay="Saturday";
            luckyColor="Light-Blue, Silver";
            traits="Aquarius-born are shy and quiet , but on the other hand they can be eccentric and energetic. However, in both cases, they are deep thinkers and highly intellectual people who love helping others. They are able to see without prejudice, on both sides, which makes them people who can easily solve problems.\n" +
                    "Although they can easily adapt to the energy that surrounds them, Aquarius-born have a deep need to be some time alone and away from everything, in order to restore power. People born under the Aquarius sign, look at the world as a place full of possibilities.";
        }else if (rashi.equals("Pisces")){
            luckyNumber = "3, 9, 12, 15, 18, 24";
            luckyDay="Thursday";
            luckyColor="Mauve, Lilac, Purple, Violet, Sea green";
            traits="Pisces are very friendly, so they often find themselves in a company of very different people. Pisces are selfless, they are always willing to help others, without hoping to get anything back.\n" +
                       "Pisces is a Water sign and as such this zodiac sign is characterized by empathy and expressed emotional capacity.";
        }else if (rashi.equals("মেষ")){
            luckyNumber = "১, ৮, ১৭";
            luckyColor="লাল";
            luckyDay="মঙ্গলবার";
            traits="রাশিফল ২০১৭ অনুসারে বছরের শুরু আপনার জন্য সামান্য ভালো হলেও শেষটা চমকপ্রদ থাকবে। কর্মস্থলে আপনার কাজ নিয়ে আপনি অসামঞ্জস্যের পরিস্থিতিতে পড়তে পারেন। অবশ্য মানসিক ও শারীরিক দিক থেকে আপনি যথেষ্ট দীপ্তময় থাকবেন। নিজের অনাবশ্যক খরচের ওপর নিয়ন্ত্রণ রাখা আপনার প্রথম কাজ হওয়া উচিৎ, যাতে প্রয়োজনের সময় টাকার অভাব না হয়।";
        }else if (rashi.equals("বৃষ")){
            luckyNumber = "২, ৬, ৯, ১২, ২৪";
            luckyColor="সবুজ, গোলাপি";
            luckyDay="শুক্রবার, সোমবার";
            traits="এই সময় আপনার জন্য যথেষ্ট পরিশ্রমের হবে, কারণ শনির অষ্টম ঘরে গোচর করার জন্য আপনার অনেক কাজ ধীরে কিন্তু নিশ্চিত গতিতে এগবে। সম্পত্তির কাজে নিযুক্ত ব্যাক্তিদের লাভের আশা রয়েছে। 2017 এর রাশিফল অনুসারে আপনি শেয়ারে বিনিয়োগ করলে লাভবান হতে পারেন। বছরের শুরুটা ব্যয় বহুল হবে। আপনি আপনার সুখ-সুবিধাতে অনেক ব্যয় করবেন। নিজের বিলাসিতা বন্ধ করুন নাহলে কিছু আর্থিক সমস্যা হতে পারে।";
        }else if (rashi.equals("মিথুন")){
            luckyNumber = "৫, ৭, ১৪, ২৩";
            luckyColor="হালকা সবুজ, হলুদ";
            luckyDay="বুধবার";
            traits="চাকরি ও ব্যবসায় ব্যস্ততা দিয়ে বছরের শুরু হবে। আপনার অত্যধিক চেষ্টার পরেও চাকরি থেকে সাধারন ফলাফল পেতে পারেন। কিন্তু এতে নিরাশ বা হতাশ একেবারে হবেন না এবং চেষ্টা করতে থাকুন। কারণ বছরের মধ্যে থেকে বানানো যোজনা সম্পূর্ণ হতে পারে। অর্থ সম্পর্কিত বিষয়ে আপনার ব্যয় সামান্য বাড়তে পারে। সাংসারিক ব্যয় পূরণের জন্য আপনাকে ধার নিতে হতে পারে। বছরের দ্বিতীয় ভাগে কিছু অব্যাহতি পেতে পারেন এবং আপনার অর্থ বিষয়ক বাধা বিপত্তি দূর হবে।";
        }else if (rashi.equals("কর্কট")){
            luckyNumber = "২, ৩, ১৫, ২০";
            luckyColor="সাদা";
            luckyDay="সোমবার, বৃহস্পতিবার";
            traits="রাশিফল ২০১৭ অনুসারে বছরের শুরুতে আপনি ধীর গতিতে এগিয়ে যাবেন। আপনার এমন মনে হতে পারে, যে আপনার প্রচেষ্টার যথাযথ ফল পাচ্ছেন না। কিন্তু বাস্তবে এটা আপনার ধৈর্যের পরীক্ষার সময়। বছরের মাঝখানে চাকরি প্রার্থী যুবকরা সাফল্য অবশ্যই পাবে। ব্যাপারিদের জন্য সময় অনুকূল। ব্যবসায় বৃদ্ধি হবে এবং আপনি আর্থিক দিক দিয়ে শক্তিশালী হবেন। এই সময় আপনার নিয়মিত আয় বজায় থাকবে। বছরের দ্বিতীয় ভাগে চাকুরিজীবীরা তাঁদের পরিশ্রমের ফল পদোন্নতি বা বেতন বৃদ্ধির রূপে পেতে পারেন। অর্থনৈতিক ক্ষেত্রে সুসংবাদ পেতে পারেন।";
        }else if (rashi.equals("সিংহ")){
            luckyNumber = "১, ৩, ১০, ১৯";
            luckyColor="সোনালী, হলুদ, কমলা";
            luckyDay="রবিবার";
            traits="সবমিলিয়ে এই বছর আপনার আয় ভালোই থাকবে। চাকুরীজীবীরা নিজের দক্ষতায় এগিয়ে যাওয়ার সুযোগ পাবেন। সরকারী চাকরি যাঁরা করেন তাঁদের বিশেষ সাফল্য পাবার সম্ভাবনা রয়েছে। আপনার আটকে থাকা কাজের গতি বাড়বে। কিন্তু রিয়েল স্টেটের কাজ যাঁরা করেন তাঁদের সাবধানে থাকতে হবে নাহলে ক্ষতি হবার সম্ভাবনা রয়েছে। সিংহ রাশির জাতকের জন্য এই সময় অর্থ প্রাপ্তির ভালো যোগ রয়েছে। কোন পুরনো ধার ফিরে পাওয়ায় আর্থিক স্থিতিতে যথেষ্ট উন্নতি হবে। ঋণ এবং আর্থিক বিষয়ে আপনার প্রচেষ্টা সফল হতে পারে। ";
        }else if (rashi.equals("কন্যা")){
            luckyNumber = "৫, ১৪, ১৫, ২৩,৩২";
            luckyColor="সাদা, হলুদ";
            luckyDay="বুধবার";
            traits="২০১৭ এর রাশিফল অনুযায়ী চাকুরীজীবী জাতকের এই সময় নিজের কৌশলের দ্বারা পদোন্নতি এবং বেতন বৃদ্ধি হবে। এই বছর আপনার সাফল্য পাবার প্রবল সম্ভাবনা রয়েছে। ব্যবসায় ধীর গতিতে উন্নতি হবে। যেকোনো ব্যবসায় ভেবে চিন্তে অংশীদারিত্ব করা হিতকর হবে। বছরের মধ্য ভাগের পর থেকে অবস্থা আপনার পক্ষে হবে। আর্থিক ক্ষেত্রে আপনাকে বিশেষ সাবধান থাকতে হবে কারণ আয় থেকে ব্যয় বেশী হবে। যদিও আয়ের উৎস থাকবে এবং আপনার নিয়মিত আয়ে কোন বাধা আসবে না। কিন্তু অর্থ খুব ধীর গতিতে আপনার কাছে আসবে।";
        }else if (rashi.equals("তুলা")){

            luckyNumber = "৪, ৬, ১৩, ১৫, ২৪";
            luckyColor="গোলাপি, সবুজ";
            luckyDay="শুক্রবার";
            traits="চাকুরীজীবীদের জন্য এই বছর ভালো থাকবে। বিরোধীদের পিছনে ফেলে আপনি এগিয়ে যাবেন। সেলস এবং মার্কেটিং এর সাথে যুক্ত ব্যক্তিরা নিজেরদের কথার মাধ্যমে গ্রাহকদের থেকে কার্য সম্পন্ন করতে সফল হবেন। ব্যবসায়িরা এই বছর কোন নতুন কাজে অর্থ বিনিয়োগ করলে লাভবান হবেন। কিন্তু বছরের শেষে কোন বড় বিনিয়োগ করবেন না। আর্থিক বিষয়ের জন্য এই বছর সন্তোষজনক মনে হচ্ছে। অর্থ প্রাপ্তির যোগ রয়েছে। কোন পুরনো ধার হঠাৎ শোধ হবার সম্ভাবনা রয়েছে।";
        }else if (rashi.equals("বৃশ্চিক")){
            luckyNumber = "৮, ১১, ১৮, ২২";
            luckyColor="লাল";
            luckyDay="মঙ্গলবার";
            traits="এই বছরের শুরুতে কোন ব্যবসা শুরু করার জন্য সময় উত্তম। কাজকর্ম বৃদ্ধি পাবার জন্য আপনার আয় বাড়ার সম্ভাবনাও রয়েছে। কর্মস্থলে আপনি কোন বড় কর্মকর্তার সাহায্য পেতে পারেন। উচ্চ আধিকারিকের থেকে আপনি প্রশংসা পেতে পারেন। ভাগ্য এই সময় আপনার সঙ্গ দেবে। অর্থ উপার্জনের জন্য সময় ভালো। তবে এই বছর আপনি যা আয় করবেন তার থেকে বেশী ব্যয় করবেন। কোথাও আটকে থাকা অর্থ ফেরত পেতে পারেন।";
        }else if (rashi.equals("ধনু")){
            luckyNumber = "৩, ৭, ৯, ১২, ২১";
            luckyColor="নীল";
            luckyDay="বৃহস্পতিবার";
            traits="চাকুরীজীবীদের এই বছর বড় ধরনের সাফল্য পাবার সম্ভাবনা রয়েছে। আপনার বেতন বাড়তে পারে এবং পদোন্নতি হতে পারে। ব্যবসায়িক ক্ষেত্রে আপনি উল্লেখযোগ্য সাফল্য পেতে পারেন। সংক্ষিপ্তে বা কম পরিশ্রমে টাকা রোজগারের ভাবনা যদি আপনার মনে এসে থাকে তাহলে এই সময় সেটা মন থেকে মুছে ফেলুন। রাশিফল ২০১৭ অনুসারে এই বছরের প্রথম ভাগ থেকে আপনাকে সামান্য আর্থিক সমস্যার সম্মুখীন হতে হবে। এই জন্য অর্থ সঞ্চয় করুন এবং বাজে খরচা থেকে বিরত হন। কাজকর্মের জন্য বাইরে গেলে টাকা বেশী খরচ হবে কিন্তু আপনার আর্থিক লাভও হবে।";
        }else if (rashi.equals("মকর")){
            luckyNumber = "৪, ৮, ১৩, ২২";
            luckyColor="বাদামী, কালো";
            luckyDay="শনিবার";
            traits="এই বছর চাকুরীজীবী ব্যাক্তিরা সাহস ও উৎসাহে পরিপূর্ণ থাকবেন। কর্মস্থলে পদোন্নতি এবং মান-সম্মান পাবার পুরোপুরি লক্ষণ রয়েছে। ব্যবসায় আপনি সম্মান ও প্রতিষ্ঠা অর্জন করবেন। আপনার নিজের প্রতি বিশ্বাস আপনাকে অনবরত জয়ী করবে। তবে অর্থের লেনদেনে সতর্কতা গ্রহণ করা উচিৎ। কোন কাছের বিশ্বাসযোগ্য ব্যাক্তির ওপর টাকাপয়সা নিয়ে বেশী ভরসা করা ক্ষতিকর হতে পারে। মকর রাশিদের জন্য আর্থিক দিক দিয়ে এই বছর সাধারন হবে। অকারণে ব্যয় বাড়ার সম্ভাবনা রয়েছে এই জন্য যথাসম্ভব অর্থ সংগ্রহ করার চেষ্টা করুন।";
        }else if (rashi.equals("কুম্ভ")){
            luckyNumber = "৪, ৭, ১১, ২২, ২৯";
            luckyColor="নীল, রূপালী";
            luckyDay="শনিবার";
            traits="চাকুরীজীবীদের জন্য সময় অনুকূল। যদি পদোন্নতি পাবার ব্যাপারে ভাবছেন তাহলে এই বছর পদোন্নতি হবে। এই ভবিষ্যদ্বাণী 2017 অনুসারে বেকারদের ভালো চাকরি পাবার সম্ভাবনা রয়েছে। ব্যবসায়ীরা অর্থ সংগ্রহ করায় সফল হবেন। বছরের দ্বিতীয় ভাগে আপনার ব্যবসায়ের সাথে যুক্ত কিছু সমস্যা থেকে সাবধান থাকবেন। আপনার আর্থিক স্থিতি এই বছর সাধারণ থাকবে। বাজে খরচা করবেন না। যেখানে প্রয়োজন সেখানে ব্যয় করুন এবং যথাসম্ভব সঞ্চয় করার প্রচেষ্টা করুন। এই সময়কালে আপনি কঠিন পরিশ্রম করে অর্থ উপার্জনে সফল হবেন।";
        }else if (rashi.equals("মীন")){
            luckyNumber = "৩, ৯, ১২, ১৫, ১৮, ২৪";
            luckyColor="ফিকে লাল, বেগুনী, সবুজ";
            luckyDay="বৃহস্পতিবার";
            traits="এই বছর আপনাকে কঠিন পরিশ্রম করতে হবে। চাকুরীজীবীদের এই বছরের দ্বিতীয় ভাগে পদোন্নতি হবার সম্ভাবনা রয়েছে। ব্যবসায়ীরা কর্তব্য-নিষ্ঠা এবং পরিশ্রমের কারনে নিজের আয় বাড়াতে সফল হবেন। শেয়ার বাজারের সাথে যুক্ত ব্যাক্তি কোন দীর্ঘকালীন বিনিয়োগের ব্যাপারে ভাবতে পারেন। জুয়া এবং লটারি থেকে দূরে থাকায় ভালো। আর্থিক দিক দিয়ে এই বছর আপনার জন্য সাধারণ থাকবে। বছরের মধ্য থেকে আর্থিক লাভ হবার সম্ভাবনা দেখা যাচ্ছে যাতে আপনার অর্থ সম্পর্কে চিন্তার সহজে নিবারণ হয়ে যাবে।দীর্ঘকালীন নিয়োগের জন্য ভালো সময়। বছরের শেষ পদ আপনার জন্য বেশি লাভদায়ক হবে।";
        }


        tvName = (TextView)findViewById(R.id.tvName);
        tvLove = (TextView)findViewById(R.id.love);
        tvMoney = (TextView)findViewById(R.id.money);
        tvcarrier = (TextView)findViewById(R.id.carrier);
        tvFriend = (TextView)findViewById(R.id.friends);
        tvEnemy = (TextView)findViewById(R.id.enemy);

        rateLove = (RatingBar)findViewById(R.id.ratingLove);
        rateMoney = (RatingBar)findViewById(R.id.ratingMoney);
        rateCarrier = (RatingBar)findViewById(R.id.ratingcarrier);
        ratingEdu = (RatingBar)findViewById(R.id.ratingEducation);
        rateEnemy = (RatingBar)findViewById(R.id.ratingEnemy);

        int loveSum,monSum,careerSum,friendum,enemySum,totalSumLove,totalSummon,totalSumcareer,totalSumfriend,totalSumenemy;
        loveSum= 310;
        monSum = 392;
        careerSum = 434;
        friendum = 523;
        enemySum = 518;


        try {
            byte[] bytes = name.getBytes("US-ASCII");
            byte[] byteDay = convertedDay.getBytes("US-ASCII");
            byte[] byteMonth = convertedMonth.getBytes("US-ASCII");

            int sum = 0;
            int sumDay = 0;
            int sumMonth = 0;

            for (int i : bytes)
                sum += i;
            for (int i : byteDay)
                sumDay += i;
            for (int i : byteMonth)
                sumMonth += i;
            totalSumLove = sum + loveSum + sumDay + sumMonth;
            totalSummon = sum + monSum+ sumDay + sumMonth;
            totalSumcareer = sum + careerSum+ sumDay + sumMonth;
            totalSumfriend = sum + friendum+ sumDay + sumMonth;
            totalSumenemy = sum + enemySum+ sumDay + sumMonth;


             modResultLove = totalSumLove%6;
             modResultmon = totalSummon%6;
             modResultcareer = totalSumcareer%6;
             modResultfriend = totalSumfriend%6;
             modResultenemy = totalSumenemy%6;
            if (modResultLove==0){
                modResultLove=4;
            }
            if (modResultmon==0){
                modResultmon=4;
            }
            if (modResultcareer==0){
                modResultcareer=4;
            }
            if (modResultfriend==0){
                modResultfriend=4;
            }
            if (modResultenemy==0){
                modResultenemy=4;
            }
            //Toast.makeText(ShowInfo.this,"Value"+ modResultLove+modResultmon+modResultcareer+modResultfriend+modResultenemy,Toast.LENGTH_LONG).show();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }



        rateLove.setRating(modResultLove);
        rateMoney.setRating(modResultmon);
        rateCarrier.setRating(modResultcareer);
        ratingEdu.setRating(modResultfriend);
        rateEnemy.setRating(modResultenemy);

        tvtrait = (TextView)findViewById(R.id.characteristics);
        tvDay = (TextView)findViewById(R.id.tvDay);
        tvcolor = (TextView)findViewById(R.id.tvColor);
        tvnumber = (TextView)findViewById(R.id.tvNumber);
        if (language.equals("বাংলা")){
            tvName.setText("স্বাগতম   "+ name+"\n"+"আপনার রাশি   "+ rashi);
            tvDay.setText("শুভ দিন :  "+luckyDay);
            tvcolor.setText("শুভ রং :  "+luckyColor);
            tvnumber.setText("শুভ সংখ্যা :  "+luckyNumber);
            tvLove.setText("প্রেম");
            tvMoney.setText("টাকা");
            tvcarrier.setText("পেশা");
            tvFriend.setText("বন্ধু");
            tvEnemy.setText("শত্রু");

        }else if (language.equals("English")) {
            tvName.setText("Welcome   "+ name+"\n"+"Your Horoscope is  "+ rashi);
            tvDay.setText("Lucky Day :  "+luckyDay);
            tvcolor.setText("Lucky Color :  "+luckyColor);
            tvnumber.setText("Lucky Number :  "+luckyNumber);

            tvLove.setText("Love");
            tvMoney.setText("Money");
            tvcarrier.setText("Career");
            tvFriend.setText("Friends");
            tvEnemy.setText("Enemies");

        }

        tvtrait.setText(traits);


    }
}
