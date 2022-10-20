package com.example.smcylerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.bumptech.glide.Glide
import com.example.smcylerview.databinding.ActivityArtistinfoBinding
import com.example.smcylerview.databinding.ActivityMainBinding
import com.example.smcylerview.databinding.ActivityRvItemSingerBinding
import com.example.smcylerview.databinding.Frame1Binding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var binding1 : ActivityRvItemSingerBinding
    private lateinit var binding2 : ActivityArtistinfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding1 = ActivityRvItemSingerBinding.inflate(layoutInflater)
        binding2 = ActivityArtistinfoBinding.inflate(layoutInflater)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)
        Glide.with(this)
            .load("data:image/png;base64,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")
            .into(binding.smlogo)

        Glide.with(this)
            .load("https://www.smentertainment.com/Images/pageVisual/top_album_banner_0.jpg")
            .into(binding.banner)
        binding.singerbutton.setOnClickListener{
            val SingerList = listOf<Singer>(
                Singer(BOA, "BoA","보아", "","11월 5일", "2000년 8월 25일 ‘ID: PeaceB’"),
                Singer(KANGTA, "KANGTA","강타","최고의 그룹 H.O.T.의 리드 보컬로 활동했던 KANGTA는 2001년부터 솔로로 활동하면서, 한국은 물론 중국을 " +
                        "비롯한 중화권 전역에서 폭발적인 사랑을 받아 최고의 한류스타에 등극했다. 노래뿐만 아니라 작사, 작곡에도 뛰어난 실력을 가지고 있는 KANGTA는 KANGTA만의 색깔이 담긴 개성" +
                        " 있는 음악으로 전 아시아를 매료시키고 있다.","10월 10일","1996년 9월 7일 '전사의 후예'"),
                Singer(SUPERJUNIOR, "SUPER JUNIOR","슈퍼주니어","‘SUPER JUNIOR(슈퍼주니어)’는 기존 그룹의 개념과는 달리 아시아의 스타 등용문으로써, 슈퍼주니어를 통해 가수뿐만 아니라 탤런트, 영화배우" +
                        ", MC, 개그맨, 작곡가, 모델 등 각 분야의 톱스타를 배출, 아시아의 슈퍼스타를 탄생시켰다.","",""),
                Singer(SHINee, "SHINee","샤이니","‘SHINee(샤이니)’라는 그룹명은 ‘Shine’에 명사형 어미 ‘ee’를 조합해 만든 신조어로, ‘빛을 받는 사람’으로 해석된다. 이는 항상 빛, 즉 스포트라이트를 받는 사람을 뜻하며, 다양한 음악 추구로 세대나 지역(나라)에 상관없이, 폭넓은" +
                        " 음악 팬층을 매료시키겠다는 ‘SHINee’의 당찬 포부를 담았다.", "",""),
                Singer(EXO, "EXO","엑소","EXO는 태양계 외행성을 뜻하는 EXOPLANET에서 모티브를 얻은 이름으로, 미지의 세계에서 온 새로운 스타라는 의미가 함축적으로 담겨 있다.","",""),
                Singer(RedVelvet, "Red Velvet","레드벨벳","2014년 8월 ‘행복 (Happiness)’으로 데뷔한 ‘Red Velvet’은 세련된 음악과 퍼포먼스로 전세계를 매료시키겠다는 포부로 탄생한 걸그룹으로, 슬기, 아이린, 웬디, 조이, 예리의 총 5명의 멤버로 구성되었다. ‘Ice Cream Cake’, ‘러시안 룰렛 (Russian Roulette)’, ‘Rookie’, ‘빨간 맛 (Red Flavor)’ 등 상큼발랄한 매력을 만날 수 있는 히트곡을 연이어 발표하며 대세 걸그룹으로 자리매김했으며, 멤버들의 다재다능한 실력과 다채로운 매력을 통해 보여줄 앞으로의 행보가 더욱 기대를 모은다","",""),
                Singer(NCT, "NCT","NCT","NCT는 ‘Neo Culture Technology’의 약자로, 새로운 문화기술로 탄생된 만큼 ‘개방성’과 ‘확장성’을 주요 포인트로 멤버의 영입이 자유롭고, 멤버수의 제한이 없는 완전히 새로운 개념의 그룹이다. NCT라는 브랜드 아래 전 세계 도시를 베이스로 한 각각의 팀이 순차적으로 데뷔하며, ‘NCT U’를 통해서도 멤버들의 다양한 조합과 변신을 지속적으로 선보일 계획이다.","",""),
                Singer(NCT127, "NCT 127","NCT 127","NCT 127은 NCT의 서울 팀으로, 한국, 중국, 일본, 캐나다 등 다양한 국적을 가진 태용, 태일, 유타, 재현, 윈윈, 마크, 해찬, 도영, 쟈니, 정우 10명의 멤버로 구성되었다. 팀명의 숫자 127은 서울의 경도를 의미, K-POP의 본거지인 서울을 기반으로 전 세계 무대에서 활동할 팀이라는 뜻을 담고 있다.","",""),
                Singer(NCTDREAM, "NCT DREAM","NCT DREAM","","", "2016년 8월 25일 싱글 'Chewing Gum'"),
                Singer(aespa, "aespa","aespa","그룹명 ‘aespa’(에스파)는 ‘Avatar X Experience’를 표현한 ‘æ’와 양면이라는 뜻의 영단어 ‘aspect’를 결합해 만든 이름으로, 자신의 또 다른 자아인 아바타 ‘ae’(아이)를 만나 새로운 세계를 경험하게 된다는 세계관을 바탕으로 다채로운 활동을 펼치고 있다.","",""),
                Singer(GOTthebeat, "GOT the beat","GOT the beat","강렬한 댄스 곡과 퍼포먼스 기반의 유닛","","")
            )

            val adapter1 = SingerAdapter(SingerList)
            binding.rv.adapter = adapter1
        }




    binding.actorbutton.setOnClickListener{
        val ActorList = listOf<Actor>(
            Actor(BOA1,"BoA","보아","","11월 5일","2000년 8월 25일 ‘ID: PeaceB’"),
            Actor(HwangShinHye,"Hwang Shin Hye","황신혜","","4월 16일","1983년 MBC 16기 공채 탤런트"),
            Actor(YooHaiJin,"Yoo Hai Jin","유해진","","1월 4일","1997년 영화'블랙잭'"),
            Actor(KANGTA1,"KANG TA","강타","","10월 10일","1996년 9월 7일 ‘전사의 후예’"),
            Actor(KEY,"KEY","","SHINee","9월 23일", "2008년 5월 ‘누난 너무 예뻐(Replay)’"),
            Actor(MunKayoung,"Mun Ka Young","문가영","","7월 10일","2006년 영화 '스승의 은혜'"),
            Actor(KimSooRo,"Kim Soo Ro","김수로","", "5월 7일","1999년 2월 영화 '쉬리' 김상중역"),
            Actor(SUHO,"SUHO","김준면","EXO","5월 22일","2012년 4월 'MAMA'"),
            Actor(YOONA,"YOONA","임윤아","GIRLS' GENERATION","5월 30일","2007년 8월 5일 ‘다시 만난 세계’"),
            Actor(SIWON,"SIWON","최시원","Super Junior","2월 10일","2005년 11월 ‘Super Junior 05’"),
            Actor(DO,"D.O","도경수","EXO","1월 12일","2012년 4월 'MAMA'")
        )

        val adapter1 = ActorAdapter(ActorList)
        binding.rv.adapter = adapter1
    }

        binding.entertainerbutton.setOnClickListener{
            val EnterList = listOf<Enter>(
                Enter(강호동,"KANG HO-dong","강호동","6월 11일","","SM C&C"),
                Enter(신동엽,"Shin Dong-Yeob","신동엽","2월 17일","","SM C&C"),
                Enter(이수근,"Lee su-Geun","이수근","2월 10일","","SM C&C"),
                Enter(김병만,"Kim Byung-Man","김병만","7월 29일","2002년 KBS 17기 공채 개그맨","SM C&C"),
                Enter(전현무,"Joen Hyun-Moo","전현무","11월 7일","","SM C&C"),
                Enter(서장훈,"Seo Jang Hoon","서장훈","6월 3일","","SM C&C"),
                Enter(데프콘,"Defconn","데프콘","1월 6일","1998 정규앨범 'Kapital G","SM C&C"),
                Enter(양세찬,"YANG SECHAN","양세찬","12월 8일","2005 SBS 공채 8기 개그맨","SM C&C"),
                Enter(김준현,"KIM JUN HYUN","김준현","11월 16일","2007 KBS 22기 공채 개그맨","SM C&C"),
                Enter(박성광,"Park Sung-Kwang","박성광","8월 15일","","SM C&C"),
                Enter(장윤주,"Jang Yoon JU","장윤주","11월7일","1997 패션쇼 SFAA 컬렉션","ESTEEM")
            )

            val adapter2 = EntertainerAdapter(EnterList)
            binding.rv.adapter = adapter2
        }
        binding.modelbutton.setOnClickListener{
            val ModelList = listOf<Model>(
                Model("","","","","",""),
                Model("","","","","",""),
                Model("","","","","",""),
                Model("","","","","",""),
                Model("","","","","",""),
                Model("","","","","",""),
                Model("","","","","",""),
                Model("","","","","",""),
                Model("","","","","",""),
                Model("","","","","","")
            )

            val adapter3 = ModelAdapter(ModelList)
            binding.rv.adapter = adapter3
        }
    }

    companion object {
            val BOA = "https://smtown-cdn.smtown.com/upload/profile/web-detail/37a110897bd843efab45acdacf99d6dd_2022-02-17-05-13-03.jpg"
        val KANGTA = "https://smtown-cdn.smtown.com/upload/profile/web-detail/ffa0246b4ecf438784e5cf1ad76226c1_2022-02-17-03-30-45.jpg"
        val SUPERJUNIOR = "https://smtown-cdn.smtown.com/upload/profile/web-detail/fa16162f2c234eeb8418bf22637bbb4f_2022-07-13-08-58-13.jpg"
        val SHINee = "https://smtown-cdn.smtown.com/upload/profile/web-detail/44edaab6e7274788a3bd85d6a01f31a3_2022-02-18-11-25-35.jpg"
        val EXO = "https://smtown-cdn.smtown.com/upload/profile/web-detail/0c9901b53c434ef9972128235a2fd8f7_2022-02-18-11-45-32.jpg"
        val RedVelvet = "https://smtown-cdn.smtown.com/upload/profile/web-detail/bd2fe06a61c842248b94b2a30bf1719f_2022-03-24-11-02-33.jpg"
        val NCT = "https://smtown-cdn.smtown.com/upload/profile/web-detail/a79a358683494dac809a138e5c0a3c3b_2022-02-17-18-42-47.jpg"
        val NCT127 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/29c8082837604ecbb9c7169c3d6310d8_2022-02-18-14-08-34.jpg"
        val NCTDREAM = "https://smtown-cdn.smtown.com/upload/profile/web-detail/78409a068ce44c4996512979154e76d9_2022-06-03-08-09-47.jpg"
        val aespa = "https://smtown-cdn.smtown.com/upload/profile/web-detail/d738a75b827c420d9ed68ba6c9a9660b_2022-07-14-07-12-08.png"
        val GOTthebeat = "https://smtown-cdn.smtown.com/upload/profile/web-detail/6ba6e071b46447cca0d0fab50c8506d7_2022-02-17-17-38-26.jpg"
        val BOA1 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/2948e08c9997448fae085b2142c67225_2022-02-18-18-08-16.jpg"
        val HwangShinHye = "https://smtown-cdn.smtown.com/upload/profile/web-detail/cee69e8ab0474803b500eb3bb35d6fe5_2022-02-16-14-44-27.jpg"
        val YooHaiJin = "https://smtown-cdn.smtown.com/upload/profile/web-detail/5bce3d4299de45069b1fc72b75a0872e_2022-02-16-02-46-03.jpg"
        val KANGTA1 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/249ec040f25d45aa9d440dd4c504276a_2022-02-18-18-43-23.jpg"
        val KEY = "https://smtown-cdn.smtown.com/upload/profile/web-detail/69043e09b76740b294944771bc2b9327_2022-02-23-08-04-32.jpg"
        val MunKayoung = "https://smtown-cdn.smtown.com/upload/profile/web-detail/873352fa685443ff905f40da80404b13_2022-02-16-02-39-32.jpg"
        val KimSooRo = "https://smtown-cdn.smtown.com/upload/profile/web-detail/a52acb355daa4738a195f4bea126a031_2022-02-16-14-49-18.png"
        val SUHO = "https://smtown-cdn.smtown.com/upload/profile/web-detail/5279208867844b18a0e6b62a8aa09e11_2022-02-18-17-44-17.jpg"
        val YOONA ="https://smtown-cdn.smtown.com/upload/profile/web-detail/3a7f62a7e0cb4d1d9cdd74ce870be40c_2022-02-19-11-54-14.jpg"
        val SIWON ="https://smtown-cdn.smtown.com/upload/profile/web-detail/6c1fe7bad7e44e97a044833dff1a5e2b_2022-02-21-05-24-17.jpg"
        val DO = "https://smtown-cdn.smtown.com/upload/profile/web-detail/13e039d455c94e7693cbd8664dc1e898_2022-02-25-04-14-30.jpg"
        val 강호동 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/37656dec73324e599b532324e7886dc9_2022-02-16-14-05-37.jpg"
        val 신동엽 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/a92b0d92697f4f5fa6198c339825eaf7_2022-02-16-14-06-58.jpg"
        val 이수근 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/30ed63c9895246a39d8fcf4420e3203b_2022-02-16-14-08-17.jpg"
        val 김병만 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/b345665506084485a14f71fc84e8bf87_2022-02-16-14-09-19.jpg"
        val 전현무 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/715756e4e7c94226aad1ba57dccdae38_2022-02-16-14-11-13.jpg"
        val 데프콘 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/5ef8421897e347a4adf7f0a643a7404d_2022-02-16-14-13-33.jpg"
        val 양세찬 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/4a4eec4f60f24d3fa2e0ddc38d3d2330_2022-02-16-14-17-10.jpg"
        val 박성광 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/2576cf4382f543f989e44a63ea912367_2022-02-16-14-19-00.jpg"
        val 장윤주 = "https://smtown-cdn.smtown.com/upload/profile/web-detail/517c8a4cc5d64c5b8638e342ec3f4fea_2022-03-18-03-43-43.jpg"
        val 서장훈 = "https://smtown-cdn.smtown.com/upload/profile/artist/a8428430b3fa475f921150b4b18a7bf5_2022-02-16-14-11-05.jpg"
        val 김준현 = "https://smtown-cdn.smtown.com/upload/profile/artist/e95138f2be5c446aa1cbb5fb3b7ff216_2022-02-16-14-17-59.jpg"


    }
    }
