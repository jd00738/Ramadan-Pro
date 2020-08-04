package com.example.test

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.test.Adaptors.DuaCustomAdaptor
import kotlinx.android.synthetic.main.activity_duas.*
import kotlinx.android.synthetic.main.toolbar.*

class Duas : AppCompatActivity() {
    val englishDua = arrayOf<String>(
        "Allah Azzawajal I ask you for beneficial knowledge, increase in provision and cure from illness.",
        "There is no problem, O Lord of mankind, remove the difficulty (and) grant relief for you are the One who grants relief. There is no one but You who removes difficulties.",
        "O Allah Azzawajal as you made my outward appearance good make my character good too.",
        "O Allah! I fasted for you and I believe in you and I put my trust in You and I break my fast with your sustenance.",
        "I Intend to keep the fast for month of Ramadan",
        "Allah Azzwajal bless you and shower (send) blessing on you and place, goodness between both of you.",
        "O Allah Azzawajal make this moon come out on us with blessings and with Iman and peace and Islam and make it come out with the ability of that thing which pleases you and that you like, (O moom of the first night my and your Lord is Allah Azzawajal).",
        "O Allah Azzawajal You are greatly forgiving, You like forgiving, so forgive me.",
        "Allah Azzawajal in the name of and according to the way of Messenger SAW (It is burried).",
        "O dwellers of the graves peace be upon you. May Allah Azzawajal forgive us and you. You reached before us and we will follow behind you.",
        "O Allah Azzawajal, All praise is for you only, you have made me wear( this sheet of cloth or turban) and I ask you for it's goodness, and the goodness of that thing for which It has been made, and I ask you for your refuge from it's badness and badness of that thing for which it has been made.",
        "O Allah, we make you the turner of the (enemies) chest (heart) and seek refuge in You from their evils",
        "O Allah Azzawajal save me from the fire of Hell.",
        "Allah Azzawajal in the name of before and after it.",
        "O Allah Azzawajal feed him who fed me and give him to drink who gave to drink.",
        "O Allah Azzawajal give us abundance in this and grant us more then this.",
        "Thanks to Allah Azzawajal who granted me relief from this affliction, which you have been involved in, and grant me greatness over a lot of your creatures.",
        "I seek the refuge of Allah Azzawajal from the badness of this that darkness.",
        "May Allah Almighty Keep you smiling.",
        "I seek the refuge of Allah Almighty from the rejected Shetan.",
        "Thanks to Allah Almighty Who removed pain from me and granted me relief.",
        "O Allah (Almighty) I seek your refuge from impure Jinnat (male and female)",
        "O Allah Azzawajal forgive me and give me abundance and blessing in my house and grant me abundance in my livlihood.",
        "Allah Azzawajal in the name of the most affectionate, the merciful.",
        "This is not a thing of harm In Sha Allah Azzawajal this illness purifies from sins",
        "All excellencies are for Allah Azzawajal Who gave me this cloth to wear and granted me without (using) any strenfth and Power.",
        "None has the right to be worshiped except You. How perfect You are, verily I was among the wrong-doers",
        "To Allaah we belong and unto Him is our return. O Allaah, recompense me for my affliction and replace it for me with something better",
        "May Allah Almighty Have Mercy on you.",
        "All praise onto Allah Almighty.",
        "Peace be upon you And peace be upon you too.",
        "There is no deity except Allah Azzawajal he is unique, He has no partner, His is the kingship, and for him is praise, he brings to lie and he kills, He is alive(as such death will not come to him. All virtues are in his hand of power, He can do what ever he wants.",
        "Thanks to Allah Azzawajal. Pure is he who subdude this, other wise we could not make this obedient.",
        "Oh Allah! I ask you of your Favour",
        "Oh Allah! Open the doors for me of your Blessings.",
        "In the name of Allah Almighty (I comeout of my house) I trust Allah Almighty, there is no capability of saving oneself from sins and neither is there capability to do good deeds but from Allah Almighty.",
        "O Allah(عَزَّ وَجَلَّ)! I ask you for the goodness of the places of entering and exiting.",
        "All Praise onto Allah (Almighty) Who granted us life after death (Sleep) and we are return to him.",
        "O Allah (Almighty) I live and die in your name.",
        "Thanks to Allah Azzawajal who fed us and made us among Muslims",
        "In the name of Allah and with the blessings of Allah I begin (eating)"
    )

    val urduDua = arrayOf<String>(
        "الٰہی عزوجل میں تجھ سے علم نافع کا اور رزق کی کشادگی کا اور بیماری سے شفایابی کا سوال کرتا ہوں۔"
        ,
        "کوئی ڈر نہیں ہے(اے) انسانوں کے رب بیماری دور کردے اور شفادے دے کیوں کہ تو ہی شفا دینے والا ہے۔ تیرے سوا کوئی نقصان دور نہیں کر سکتا۔",
        "اللہ عزوجل تو نے میری صورت اچھی بنائی تو میری سیرت (اخلاق) بھی اچھی کردے۔",
        "’’اے اللہ!میں نے تیری خاطر روزہ رکھا اور تیرے اوپر ایمان لایا اور تجھ پر بھروسہ کیا اورتیرے رزق سے اسے کھول رہا ہوں۔‘‘",
        "’’اورمیں نے ماہ رمضان کے کل کے روزے کی نیت کی.‘‘",
        "اللہ عزوجل تجھ کو برکت دے اور تجھ پر برکت نازل فرمائے اور تم دونوں میں بھلائی رکھے۔",
        "یا الٰہی عزوجل اس چاند کو ہم پر برکت کے ساتھ اور ایمان و سلامتی اور اسلام اور اس چیز کی توفیق کے ساتھ نکال جس سے تو راضی ہوتا ہے اور پسند کرتا ہے، (اے پہلی رات کے چاند) میرا اور تیرا رب اللہ عزوجل ہے۔",
        "الٰہی عزوجل تو بہت معاف فرمانے والا ہے، معاف کرنے کو پسند فرماتا ہے پس مجھے معاف فرمادے۔"
        ,
        "اللہ عزوجل کے نام سے اور رسول اللہ صلی اللہ علیہ وسلم کے طریقہ پر (اسے دفن کرتا ہوں)۔"
        ,
        "اے قبر والوں تم پر سلام ہو۔ اللہ عزوجل ہماری اور تمہاری مغفرت فرما۔ اور تم ہم سے پہلے پہنچ گئے اور ہم پیچھے آنےوالے ہیں۔"
        ,
        "یا للہ عزوجل ، تمام تعریفیں تیرے ہی لئے ہیں تو نے ہی مجھے (یہ چادر یا عمامہ) پہنایا ہے اور میں تجھ سے اس کی بھلائی طلب کر تا ہوں اور اس چیز کی بھلائی جس کے لئے یہ بنایا گیا ہے اور میں اس کےشر سے تیری پناہ مانگتا ہوں اور اس چیز کے شر سے بھی جس کے لئے اس کو بنایا گیا۔"
        ,
        "اے اللہ عزوجل ہم ان (کفار و مشرکین) کے مقابل تجھے کرتے ہیں اور ان کے شر سے تیری پناہ لیتے ہیں۔"
        ,
        "یا الٰہی عزوجل مجھے دوذخ کی آگ سے بچا۔"
        ,
        "اللہ عزوجل کے نام سے اس کے پہلے اور اس کے آخر۔"
        ,
        "یا الٰہی عزوجل اس کو کھلا جس نے مجھے کھلایا اور کو پلا جس نے مجھے پلایا۔"
        ,
        "یا الٰہی عزوجل ہمارے لئے اس میں برکت دے اور ہمیں اس سے زیادہ عنایت فرما۔"
        ,
        "اللہ عزوجل کا شکر ہے جس نے مجھے اس مصیبت سے عافیت دی، جس میں تجھے مبتلا کیا، اور مجھے اپنی بہت سی مخلوق پر فضیلت دی۔"
        ,
        "میں اللہ عزوجل کی پناہ طلب کرتا ہوں اس تاریک ہوجانے والے کی برائی سے۔"
        ,
        "اللہ عزوجل تجھے ہنستا رکھے۔"
        ,
        "میں شیطان مردود سے اللہ عزوجل کی پناہ چاہتا ہوں۔"
        ,
        "اللہ عزوجل کا شکر ہے جس نے مجھ سے اذیت دور کی اور مجھے عافیت دی۔"
        ,
        "اے اللہ عزوجل میں ناپاک جنوں (نرو مادہ) سے تیری پناہ مانگتا ہوں۔"
        ,
        "اے اللہ عزوجل مجھے بخش دے اور میرے گھر میں برکت و شادگی دے اور میرے گھر روزی میں برکت عطا فرما۔"
        ,
        "اللہ عزوجل کے نام سے شروع جو بڑا مہربان اور نہایت رحم والا ہے۔"
        ,
        "کوئی حرج کی بات نہیں انشاء اللہ عزوجل یہ مرض گناہوں سے پاک کرنے والا ہے"
        ,
        "تمام خوبیاں اللہ عزوجل کے لئے جس نے مجھ کو یہ کپڑا پہنایا اور میری قوت و طاقت کے بغیر مجھ کو عطا فرمایا۔"
        ,
        "تیرے علاوہ کوئی سچا معبود نہیں، تو پاک ہے، یقینا میں ہی ظالموں میں سے ہوں۔"
        ,
        "يقینا ہم اللہ ہى كى ملكيت ہیں اور اسى كى طرف لوٹ كر جانے والے ہیں۔اے اللہ مجھے ميرے اس صدمے یا تكليف كا اجر دے اور بدلے ميں مجھے اس سے زيادہ بہتر دے۔(صحیح مسلم)"
        ,
        "اللہ عزوجل تجھ پر رحم کرے۔"
        ,
        "تمام تعریفیں اللہ عزوجل کےلئے ہیں۔"
        ,
        "تم پر سلامتی ہو۔ اور تم پر بھی سلامتی ہو۔"
        ,
        "اللہ عزوجل کے سوا کوئی معبود نہین، وہ یکتا ہے، اس کا کوئی شریک نہیں، اس کی بادشاہت ہے اور اسی کے لئے حمد ہے وہی جلاتا اور مارتا ہےوہ (ایسا) زندہ ہے جسے موت نہیں، تمام بھلائیاں اسی کے دست قدرت میں ہیں اور وہ ہر چیز پر قادر ہے۔"
        ,
        "اللہ عزوجل کا شکر ہے، پاک ہے وہ جس نے ہمارے لئے اس(سواری کو) مسخر کیا اور ہم اس کو فرمانبردار نہیں بنا سکتے تھے۔"
        ,
        "اے اللہ! میں تجھ سے تیرا فضل اور تیری رحمت مانگتا ہوں۔‘"
        ,
        "اے اللہ! میرے لیے رحمت کے دروازے کھول دے۔"
        ,
        "اللہ عزوجل کے نام سے (گھر سے نکلتا ہوں) میں نے اللہ عزوجل پر بھروسہ کیا اللہ عزوجل کے بغیر نہ طاقت ہے (گناہوں سے بچنےکی) اور نہ وقت ہے (نیکیاں کرنے کی)۔"
        ,
        "اے اللہ عَزَّ وَجَلَّ ! میں تجھ سے داخل ہونے اور نکلنے کی جگہوں کی بھلائی طلب کرتا ہوں "
        ,
        "تمام تعریفیں اللہ عزوجل کے لئے جس نے ہمیں موت (نیند) کے بعد حیات (بیداری) عطا فرمائی اور ہمیں اسی طرف لوٹنا ہے۔"
        ,
        "الٰہی عزوجل میں تیرے نام پر مرتا ہوں اور جیتا ہوں۔"
        ,
        "اللہ عزوجل کا شکر ہے جس نے ہمیں کھلایا پلایا اور مسلمانوں میں سے بنایا۔"
        ,
        "میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا"
    )

    val arabicDua = arrayOf<String>(
        "اَللّٰهُمَّ إِنِّي أَسْأَلُكَ عِلْماً نَافِعاً وَرِزْقاً وَاسِعاً وَشِفَاءً مِنْ كُلِّ دَاءٍ"
        ,
        "لَا بَأْسَ أَذْهِبِ الْبَأْسَ رَبَّ النَّاسِ اشْفِ أَنْتَ الشَّافِي لَا يَكْشِفُ الضُّرَّ إِلَّا أَنْتَ"
        ,
        "اَللّٰهُمَّ أَنْتَ حَسَّنْتَ خَلْقِي فَحَسِّنْ خُلُقِي"
        ,
        "اَللّٰهُمَّ اِنِّی لَکَ صُمْتُ وَبِکَ اٰمَنْتُ وَعَلَيْکَ تَوَکَّلْتُ وَعَلٰی رِزْقِکَ اَفْطَرْتُ"
        ,
        "وَبِصَوْمِ غَدٍ نَّوَيْتُ مِنْ شَهْرِ رَمَضَانَ."
        ,
        "بَارَكَ اللّٰہُ لَكَ وَبَارَكَ عَلَيْكُمَا وَجَمَعَ بَيْنَكُمَا فِي خَيْرٍ"
        ,
        "اَللّٰهُمَّ أَهِلَّهُ عَلَيْنَا بِالْيُمْنِ وَالْإِيمَانِ وَالسَّلَامَةِ وَالْإِسْلَامِ وَالتَّوْفِيقِ لِمَا تُحِبُّ وَتَرْضیٰ رَبِّي وَرَبُّكَ اللّٰہُ"
        ,
        "اللَّهُمَّ إِنَّكَ عَفُوٌّ تُحِبُّ الْعَفْوَ فَاعْفُ عَنِّ"
        ,
        "بِسْمِ اللَّهِ وَعَلٰی سُنَّةِ رَسُولِ اللَّهِ"
        ,
        "السَّلَامُ عَلَيْكُمُ يَا أَهْلَ الْقُبُورِ يَغْفِرُ اللَّهُ لَنَا وَلَكُمْ أَنْتُمُ سَلَفُنَا وَنَحْنُ بِالْأَثَرِ"
        ,
        "اَللّٰهُمَّ لَكَ الْحَمْدُ كَمَا كَسَوْتَنِيهِ أَسْأَلُكَ خَيْرَهٗ وَخَيْرَ مَا صُنِعَ لَهٗ وَأَعُوذُ مِنْ شَرِّهٖ وَشَرِّ مَا صُنِعَ لَهٗ"
        ,
        "اَللّٰهُمَّ إِنَّا نَجْعَلُكَ فِي نُحُورِهِمْ وَنَعُوذُ بِكَ مِنْ شُرُورِهِمْ"
        ,
        "اَللّٰهُمَّ أَجِرْنِي مِنَ النَّارِ"
        ,
        "بِسْمِ اللَّهِ أَوَّلِهِ وَآخِرِهِ"
        ,
        "اَللّٰهُمَّ أَطْعِمْ مَنْ أَطْعَمَنِي وَاسْقِ مَنْ سَقَانِي"
        ,
        "اَللّٰهُمَّ بَارِكْ لَنَا فِيهِ وَزِدْنَا مِنْهُ"
        ,
        "اَلْحَمْدُ لِلّٰہِ الَّذِي عَافَانِي مِمَّا ابْتَلَاكَ بِهٖ وَفَضَّلَنِي عَلٰی كَثِيرِ مِمَّنْ خَلَقَ تَفْضِيلَاً"
        ,
        "أَعُوذُ بِاللَّهِ مِنْ شَرِّ هَذَا لغاسِق"
        ,
        "أَضْحَكَ اللّٰہُ سِنَّكَ"
        ,
        "أَعُوذُ بِاللّٰہِ مِنَ الشَّيْطٰنِ الرَّجِيمِ"
        ,
        "اَلْحَمْدُ لِلّٰہِ الَّذِي أَذْهَبَ عَنِّي الْأَذَى وَعَافَانِي"
        ,
        "اَللّٰھُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْخُبُثِ وَالْخَبَائِثِ"
        ,
        "اَللّٰهُمَّ اغْفِرْ لِي ذَنْبِي وَوَسِّعْ لِي فِي دَارِي وَبَارِكْ لِي فِي رِزْقِي"
        ,
        "بِسْمِ اللّٰہِ وَلْحَمْدُ لِلّٰہِ"
        ,
        "لَا بَأْسَ طَهُورٌ إِنْ شَآءَ اللّٰہُ"
        ,
        "الْحَمْدُ لِلَّهِ الَّذِي كَسَانِي هَذَا وَرَزَقَنِيهِ مِنْ غَيْرِ حَوْلٍ مِنِّي وَلَا قُوَّةٍ"
        ,
        "لَا إِلٰهَ إِلَّا أَنْتَ سُبْحَانَكَ إِنِّي كُنْتُ مِنَ الظَّالِمِينَ"
        ,
        "إِنَّا لِلهِ وَ إِنَّا إِلَيْهِ رَاجِعُوْن. اَللّٰهُمَّ أْجُرْنِيْ فِيْ مُصِيبَتِيْ وَاخْلُفْ لِيْ خَيْرا مِنْهَا"
        ,
        "يَرْحَمُكَ اللّٰہُ"
        ,
        "اَلْحَمْدُ لِلّٰہِ"
        ,
        "اَلسَّلَامُ عَلَيْكُمُ - وَعَلَيْكُمُ السَّلَامُ"
        ,
        "لَا إِلٰهَ إِلَّا اللّٰہُ وَحْدَهٗ لَا شَرِيكَ لَهٗ ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ يُحْيِي وَيُمِيتُ وَهُوَ حَيٌّ لَا يَمُوتُ بِيَدِهِ الْخَيْرُ وَهُوَ عَلٰی كُلِّ شَيْءٍ قَدِيرٍ"
        ,
        "سُبْحَانَ الَّذِي سَخَّرَ لَنَا هَـٰذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ وَإِنَّا إِلَىٰ رَبِّنَا لَمُنقَلِبُونَ"
        ,
        "اَللّٰهُمَّ اِنِّيْ اَسْاَلُکَ مِنْ فَضْلِکَ وَرَحْمَتِکَ"
        ,
        "اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِکَ."
        ,
        "بِسْمِ اللّٰہِ تَوَكَّلْتُ عَلَى اللّٰہِ وَلَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللّٰہِ"
        ,
        "اَللّٰھُمَّ اِنِّیْ اَسْئَلُكَ خَیْرَالْمَوْلَجِ وَخَیْرَالْمَخْرَجِ"
        ,
        "الْحَمْدُ لِلّٰہِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ"
        ,
        "اَللّٰھُمَّ بِاسْمِكَ أَمُوتُ وَأَحْيَا"
        ,
        "الْحَمْدُ لِلَّهِ الَّذِي أَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِينَ"
        ,
        "بِسْمِ اللّٰہِ وَعَلٰی بَرَكَةِ اللّٰہِ"
    )

    val duaName = arrayOf<String>(
        "DUA WHEN DRINKING ZAM ZAM WATER",
        "DUA FOR ANIMAL SUFFERING THROUGH EVIL EYE (NAZAR)",
        "DUA WHEN LOOKING IN THE MIRROR",
        "DUA FOR IFTAR",
        "DUA OF SEHRI",
        "DUA FOR BRIDE & GROOM AFTER MARRIAGE/NIKAH",
        "DUA WHEN SIGHTING THE NEW MOON",
        "DUA SHAB E QADR (LAYLAT UL QADR)",
        "DUA AT THE TIME OF LOWERING A DEAD BODY INTO A GRAVE",
        "DUA WHEN ENTERING THE CEMETERY / GRAVEYARD",
        "DUA WEARING A NEW TURBAN (AMAAMAH) OR A NEW SHEET OF CLOTH",
        "DUA WHEN FEARING THE ENEMY",
        "DUA AFTER FAJR & MAGHRIB PRAYER",
        "DUA WHEN YOU FORGET TO SAY BISMILLAH BEFORE MEAL",
        "DUA WHEN DINING AT SOMEONE'S HOUSE",
        "DUA AFTER DRINKING MILK",
        "DUA WHEN YOU SEE SOMEONE IN TROUBLE",
        "DUA WHEN SIGHTING THE MOON",
        "DUA AT THE TIME OF SEEING A MUSLIM SMILING",
        "DUA WHEN YOU BECOME ANGRY",
        "DUA AFTER LEAVING TOILET",
        "DUA BEFORE ENTERING TOILET",
        "DUA WHILE PERFORMING WUDHU (ABLUTION)",
        "DUA BEFORE WUDHU (ABLUTION)",
        "DUA WHEN VISITING THE SICK",
        "DUA AT THE TIME OF DRESSING",
        "DUA FOR RELIEF FROM ALL HARDSHIPS",
        "DUA WHEN FACING TROUBLE OR DIFFICULTIES",
        "DUA WHEN HEARING SOMEONE SNEEZE",
        "DUA UPON SNEEZING",
        "DUA WHEN MEETING ANOTHER MUSLIM",
        "DUA WHEN ENTERING THE MARKET (BAZAAR)",
        "DUA FOR TRAVELING & JOURNEY",
        "DUA WHEN LEAVING THE MOSQUE",
        "DUA WHEN ENTERING THE MOSQUE",
        "DUA WHEN LEAVING THE HOUSE",
        "DUA WHEN ENTERING THE HOME",
        "DUA WHEN WAKING UP FROM SLEEP",
        "DUA BEFORE SLEEPING",
        "DUA AFTER EATING",
        "DUA BEFORE MEALS"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_duas)
        action_bar_title.text = " Dua's"

        action_bar_back.setOnClickListener(View.OnClickListener {
            finish()
        })

        val myListAdapter = DuaCustomAdaptor(this, duaName, arabicDua, englishDua, urduDua)
        dua_list_view.adapter = myListAdapter

    }
}
