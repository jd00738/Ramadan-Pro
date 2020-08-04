package com.example.test

//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.test.Adaptors.DuaCustomAdaptor
import com.example.test.Adaptors.QuranCustomAdaptor
import kotlinx.android.synthetic.main.activity_quran.*
import kotlinx.android.synthetic.main.toolbar.*

class Quran : AppCompatActivity() {

    val arabic = arrayOf<String>("""
1. بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحَابِ الْفِيلِ
2. أَلَمْ يَجْعَلْ كَيْدَهُمْ فِي تَضْلِيلٍ
3. وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيلَ
4. تَرْمِيهِمْ بِحِجَارَةٍ مِنْ سِجِّيلٍ
5. فَجَعَلَهُمْ كَعَصْفٍ مَأْكُولٍ
""","""
1. بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ لِإِيلَافِ قُرَيْشٍ
2. إِيلَافِهِمْ رِحْلَةَ الشِّتَاءِ وَالصَّيْفِ
3. فَلْيَعْبُدُوا رَبَّ هَٰذَا الْبَيْتِ
4. الَّذِي أَطْعَمَهُمْ مِنْ جُوعٍ وَآمَنَهُمْ مِنْ خَوْفٍ
""","""
1. بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ أَرَأَيْتَ الَّذِي يُكَذِّبُ بِالدِّينِ
2. فَذَٰلِكَ الَّذِي يَدُعُّ الْيَتِيمَ
3. وَلَا يَحُضُّ عَلَىٰ طَعَامِ الْمِسْكِينِ
4. فَوَيْلٌ لِلْمُصَلِّينَ
5. الَّذِينَ هُمْ عَنْ صَلَاتِهِمْ سَاهُونَ
6. الَّذِينَ هُمْ يُرَاءُونَ
7. وَيَمْنَعُونَ الْمَاعُونَ
""","""
1. بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ إِنَّا أَعْطَيْنَاكَ الْكَوْثَرَ
2. فَصَلِّ لِرَبِّكَ وَانْحَرْ
3. إِنَّ شَانِئَكَ هُوَ الْأَبْتَرُ
""","""
1. بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ قُلْ يَا أَيُّهَا الْكَافِرُونَ
2. لَا أَعْبُدُ مَا تَعْبُدُونَ
3. وَلَا أَنْتُمْ عَابِدُونَ مَا أَعْبُدُ
4. وَلَا أَنَا عَابِدٌ مَا عَبَدْتُمْ
5. وَلَا أَنْتُمْ عَابِدُونَ مَا أَعْبُدُ
6. لَكُمْ دِينُكُمْ وَلِيَ دِينِ
""","""
1. بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ إِذَا جَاءَ نَصْرُ اللَّهِ وَالْفَتْحُ
2. وَرَأَيْتَ النَّاسَ يَدْخُلُونَ فِي دِينِ اللَّهِ أَفْوَاجًا
3. فَسَبِّحْ بِحَمْدِ رَبِّكَ وَاسْتَغْفِرْهُ ۚ إِنَّهُ كَانَ تَوَّابًا
""","""
1. بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ تَبَّتْ يَدَا أَبِي لَهَبٍ وَتَبَّ
2. مَا أَغْنَىٰ عَنْهُ مَالُهُ وَمَا كَسَبَ
3. سَيَصْلَىٰ نَارًا ذَاتَ لَهَبٍ
4. وَامْرَأَتُهُ حَمَّالَةَ الْحَطَبِ
5. فِي جِيدِهَا حَبْلٌ مِنْ مَسَدٍ
""","""
1. بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ قُلْ هُوَ اللَّهُ أَحَدٌ
2. اللَّهُ الصَّمَدُ
3. لَمْ يَلِدْ وَلَمْ يُولَدْ
4. وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ
""","""
1. بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ
2. مِنْ شَرِّ مَا خَلَقَ
3. وَمِنْ شَرِّ غَاسِقٍ إِذَا وَقَبَ
4. وَمِنْ شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ
5. وَمِنْ شَرِّ حَاسِدٍ إِذَا حَسَدَ
""","""
1. بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ قُلْ أَعُوذُ بِرَبِّ النَّاسِ
2. مَلِكِ النَّاسِ
3. إِلَٰهِ النَّاسِ
4. مِنْ شَرِّ الْوَسْوَاسِ الْخَنَّاسِ
5. الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ
6. مِنَ الْجِنَّةِ وَالنَّاسِ
""")

    val urdu = arrayOf<String> ("""
    1. شروع الله کا نام لے کر جو بڑا مہربان نہایت رحم والا ہے
    2. سب تعریفیں الله کے لیے ہیں جو سب جہانوں کا پالنے والا ہے
    3. بڑا مہربان نہایت رحم والا
    4. جزا کے دن کا مالک
    5. ہم تیری ہی عبادت کرتے ہیں اور تجھ ہی سے مدد مانگتے ہیں
    6. ہمیں سیدھا راستہ دکھا
    7. ان لوگوں کا راستہ جن پر تو نے انعام کیا نہ جن پر تیرا غضب نازل ہوا اور نہ وہ گمراہ ہوئے
  ""","""
1. اس لیے کہ قریش کو مانوس کر دیا
2. ان کو جاڑے اور گرمی کے سفر سے مانوس کرنے کے باعث
3. ان کو اس گھرکے مالک کی عبادت کرنی چاہیئے
4. جس نے ان کو بھوک میں کھلایا اور ان کو خوف سے امن دیا
""","""
1. کیا آپ نے اس کو دیکھا جو روزِ جرا کو جھٹلاتا ہے
2. پس وہ وہی ہے جو یتیم کو دھکے دیتا ہے
3. اور مسکین کو کھانا کھلانے کی ترغیب نہیں دیتا
4. پس ان نمازیوں کے لیے ہلاکت ہے
5. جو اپنی نماز سے غافل ہیں
6. جو دکھلاوا کرتے ہیں
7. اور برتنے کی چیز تک روکتے ہیں

""","""
1. بے شک ہم نے آپ کو کوثر دی
2. پس اپنے رب کے لیے نماز پڑھیئے اور قربانی کیجیئے
3. بے شک آپ کا دشمن ہی بے نام و نشان ہے
""","""
1. کہہ دو اے کافرو
2. نہ تومیں تمہارے معبودوں کی عبادت کرتا ہوں
3. اور نہ تم ہی میرے معبود کی عبادت کرتے ہو
4. اور نہ میں تمہارے معبودوں کی عبادت کروں گا
5. اور نہ تم میرے معبود کی عبادت کرو گے
6. تمہارے لیے تمہارا دین ہے اور میرے لیے میرا دین
""","""
1. جب الله کی مدد اور فتح آ چکی
2. اورآپ نے لوگوں کو الله کے دین میں جوق در جوق داخل ہوتے دیکھ لیا
3. تو اپنے رب کی حمد کے ساتھ تسبیح کیجیئے اور اس سے معافی مانگیئے بےشک وہ بڑا توبہ قبول کرنے والا ہے
""","""
1. ابو لہب کے دونوں ہاتھ ٹوٹ گئے اوروہ ہلاک ہو گیا
2. اس کا مال اورجو کچھ اس نے کمایا اس کے کام نہ آیا
3. وہ بھڑکتی ہوئی آگ میں پڑے گا
4. اور اس کی عورت بھی جو ایندھن اٹھائے پھرتی تھی
5. اس کی گردن میں موُنج کی رسیّ ہے
""","""
1. کہہ دووہ الله ایک ہے
2. اللہ بے نیاز ہے
3. نہ اس کی کوئی اولاد ہے اور نہ وہ کسی کی اولاد ہے
4. اور اس کے برابر کا کوئی نہیں ہے
""","""
1. کہہ دو صبح کے پیدا کرنے والے کی پناہ مانگتا ہوں
2. اس کی مخلوقات کے شر سے
3. اور اندھیری رات کے شر سے جب وہ چھا جائے
4. اورگرہوں میں پھونکنے والیوں کے شر سے
5. اور حسد کرنے والے کے شر سے جب وہ حسد کرے
""","""
1. کہہ دو میں لوگوں کے رب کی پناہ میں آیا
2. لوگوں کے بادشاہ کی
3. لوگوں کے معبود کی
4. اس شیطان کے شر سے جووسوسہ ڈال کر چھپ جاتا ہے
5. جو لوگوں کے سینوں میں وسوسہ ڈالتا ہے
6. جنوں اور انسانوں میں سے
""")
    val english = arrayOf<String>("""
1. Hast thou not seen how thy Lord dealt with the possessors of the elephant?
2. Did He not cause their war to end in confusion?
3. And send against them birds in flocks?
4. Casting at them decreed stones --
5. So He rendered them like straw eaten up?
""","""
1. For the protection of the Quraish
2. Their protection during their journey in the winter and the summer.
3. So let them serve the Lord of this House.
4. Who feeds them against hunger, and gives them security against fear.
""","""
1. Hast thou seen him who belies religion?
2. That is the one who is rough to the orphan,
3. And urges not the feeding of the needy.
4. So woe to the praying ones,
5. Who are unmindful of their prayer!
6. Who do (good) to be seen,
7. And refrain from acts of kindness!
""","""
1. Surely We have given thee abundance of good.
2. So pray to thy Lord and sacrifice.
3. Surely thy enemy is cut off (from good).
""","""
1. Say: O disbelievers,
2. I serve not that which you serve,
3. Nor do you serve Him Whom I serve,
4. Nor shall I serve that which ye serve,
5. Nor do you serve Him Whom I serve.
6. For you is your recompense and for me my recompense.
""","""
1. When Allah’s help and victory comes,
2. And thou seest men entering the religion of Allah in companies,
3. Celebrate the praise of thy Lord and ask His protection. Surely He is ever Returning (to mercy).
""","""
1. Abu Lahab’s hands will perish and he will perish.
2. His wealth and that which he earns will not avail him.
3. He will burn in fire giving rise to flames --
4. And his wife -- the bearer of slander;
5. Upon her neck a halter of twisted rope!
""","""
1. Say: He, Allah, is one.
2. Allah is He on Whom all depend.
3. He begets not, nor is He begotten;
4. And none is like Him.
""","""
1. Say: I seek refuge in the Lord of the dawn,
2. From the evil of that which he has created,
3. And from the evil of intense darkness, when it comes,
4. And from the evil of those who cast (evil suggestions) in firm resolutions,
5. And from the evil of the envier when he envies.
""","""
1. Say: I seek refuge in the Lord of men,
2. The King of men,
3. The God of men,
4. From the evil of the whisperings of the slinking (devil),
5. Who whispers into the hearts of men,
6. From among the jinn and the men.
""")

    var surahName = arrayOf<String>("Surah Al-Fil","Surah Quraish","Surah Al-Maun","Surah Al-Kauthar","Surah Al-Kafirun","Surah An-Nasr","Surah Al-Lahab","Surah Al-Ikhlas","Surah Al-Falaq","Surah An-Nas")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quran)
        action_bar_title.text="Quran Last 10 Surah"

        action_bar_back.setOnClickListener(View.OnClickListener {
            finish()
        })
        val myListAdapter = QuranCustomAdaptor(this,surahName,arabic,english,urdu)
        quran_list_view.adapter=myListAdapter
    }
}
