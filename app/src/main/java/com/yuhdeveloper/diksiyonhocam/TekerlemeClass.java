package com.yuhdeveloper.diksiyonhocam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kored on 27.11.2017.
 */

public class TekerlemeClass {
  List<String> lstJust;

  public static List<String> getWords() {
    List<String> lst = new ArrayList<>();
    lst.add("A");
    lst.add("B");
    lst.add("C");
    lst.add("Ç");
    lst.add("D");
    lst.add("E");
    lst.add("F");
    lst.add("G");
    lst.add("H");
    lst.add("I");
    lst.add("İ");
    lst.add("J");
    lst.add("K");
    lst.add("L");
    lst.add("M");
    lst.add("N");
    lst.add("O");
    lst.add("Ö");
    lst.add("P");
    lst.add("R");
    lst.add("S");
    lst.add("Ş");
    lst.add("T");
    lst.add("U");
    lst.add("Ü");
    lst.add("V");
    lst.add("Y");
    lst.add("Z");

    return lst;
  }


  public List<String> getTekerlemeler(String _word) {
    if (_word.equals("A")) {
      return getJustA();
    } else if (_word.equals("B")) {
      return getJustB();

    } else if (_word.equals("C")) {
      return getJustC();

    } else if (_word.equals("Ç")) {
      return getJustCC();

    } else if (_word.equals("D")) {
      return getJustD();

    } else if (_word.equals("E")) {
      return getJustE();

    } else if (_word.equals("F")) {
      return getJustF();

    } else if (_word.equals("G")) {
      return getJustG();

    }  else if (_word.equals("H")) {
      return getJustH();

    } else if (_word.equals("I")) {
      return getJustI();

    } else if (_word.equals("İ")) {
      return getJustII();

    } else if (_word.equals("J")) {
      return getJustJ();

    } else if (_word.equals("K")) {
      return getJustK();

    } else if (_word.equals("L")) {
      return getJustL();

    } else if (_word.equals("M")) {
      return getJustM();

    } else if (_word.equals("N")) {
      return getJustN();

    } else if (_word.equals("O")) {
      return getJustO();

    } else if (_word.equals("Ö")) {
      return getJustOO();

    } else if (_word.equals("P")) {
      return getJustP();

    } else if (_word.equals("R")) {
      return getJustR();

    } else if (_word.equals("S")) {
      return getJustS();

    } else if (_word.equals("Ş")) {
      return getJustSS();

    } else if (_word.equals("T")) {
      return getJustT();

    } else if (_word.equals("U")) {
      return getJustU();

    } else if (_word.equals("Ü")) {
      return getJustUU();

    } else if (_word.equals("V")) {
      return getJustV();

    } else if (_word.equals("Y")) {
      return getJustY();

    } else if (_word.equals("Z")) {
      return getJustZ();

    }
    return null;
  }

  public List<String> getJustA(){
    lstJust = new ArrayList<>();
    lstJust.add("A be kuru dayı ne kuru sarı bu darı a be kuru dayı.");
    lstJust.add("Abana'dan Adana'ya abarta abarta apar topar ahlatla ağdalı avuntucu ahmak Ahmet'in avandanlıklarını aparanlardan Acar Abdullah ile Aptal Abdi akşam akşam bize geldi.");
    lstJust.add("Adalardan adalara adanan Adanalı Abroşun abarta abarta, Ahlatlı ağdacının avutucu, avutucu ahmak, aptal Abdurrahman'ın apraşı ağır ağır gidiyordu.");
    lstJust.add("Adem madene gitmiş. Adem madende badem yemiş. Madem ki Adem madende badem yemiş, niye bize getirmemiş.");
    lstJust.add("Alem ala dana aldı ala danalandı da biz bir ala dana alıp ala danalanamadık.");
    return lstJust;
  }
  public List<String> getJustB(){
    lstJust = new ArrayList<>();
    lstJust.add("Babaeskili babacan Bahri Beberuhi Bedri ile bıyıksız bıçkıcıbıngıldak Bigalı bekes Bahir’in Bigadiç’teki bonbon bonmarşesine varmışlar, oradakilerin yüzlerine bön bön bakarak, büyülü büyük buhurdanlığı buğulu buğulu boşaltıp bomboş bırakmışlar, sonra da bodrumda gözden kaybolmuşlar.");
    lstJust.add("Babasının benekli bıldırcını bitişik bostanda böceklerden bunalarak büzüldü.");
    lstJust.add("Bir tarlaya kemeken ekmişler. İki kürkü yırtık kel, kör kirpi dadanmış. Biri erkek kürkü yırtık kel, kör kirpi, öteki dişi kürkü yırtık kel, kör kirpi. Kürkü yırtık erkek kel, kör kirpinin yırtık kürkünü, kürkü yırtık dişi kel, kör kirpinin yırtık kürkünü, kürkü yırtık dişi kel, kör kirpinin yırtık kürküne, kürkü yırtık dişi kel kör kirpinin yırtık kürkünü, kürkü yırtık erkek kel, kör kirpinin yırtık kürküne eklemişler.");
    lstJust.add("Bizde bize biz derler, sizde bize ne derler?");
    lstJust.add("Bir pirinci birinci buluşta bir inci gibi birbirine bağlayıp perlepe berberi bastı bacak Bedri ile beraber Bursa barına parasız giden paytak budala babası topal Badi’den biberli bir papara yedi.");
    return lstJust;
  }
  public List<String> getJustC(){
    lstJust = new ArrayList<>();
    lstJust.add("Caddedeki canfesci Canan’ın camındaki canfeslerin cazibeleri cariyelerin canını cayır cayır yaktı.");
    lstJust.add("Camadanlı cahil Cabi Canib’in cacığına cascavlak cadaloz bir canavar gibi saldırdı.");
    lstJust.add("Cambaz Cevat cılız cimri coşkunla cömertliğe cumbada cüret ettiler.");
    lstJust.add("Cıvık cıvacının cılız cırcırları cıyak cıyak cırlarken cızbızlar cızladılar.");
    lstJust.add("Coğrafya Coskun’u coşturdu. Coşkun coştu coşturdu.");
    return lstJust;
  }
  public List<String> getJustCC(){
    lstJust = new ArrayList<>();
    lstJust.add("Çankırılı çarıkçı Çakır, çardakta çalgı çalınırken çapulcularla çan çan etti.");
    lstJust.add("Çapakçurlu çapaçul çarkçıbaşı çaylak Zülküf, Çatalcalı çakmakçı çivit Cahit’e: -Behey çaçabalığı, çepiç, çerçi, çakaloz, çayırhorozu, çöpçatan, çurçur, çirişotu demiş!");
    lstJust.add("Çarşamba çarşısında çatalcıla çatıkkaş Çavdar Çavuş çamaşır çantasını çayın çamuruna düşürdü.");
    lstJust.add("Çatalağzı’nda çatalsız Çatalcalı çatalcının çarpık çurpuk çançiçeğini çalçene Çoruhluya çarptırmasına ne dersin?");
    lstJust.add("Çilli çekici çılgın çocuk, çökük çardağın çam çerçevelerini çekçek içinde çiviledi.");
    return lstJust;
  }
  public List<String> getJustD(){
    lstJust = new ArrayList<>();
    lstJust.add("Dadaylı dadımın Dodurgalı düdük delisi dedesi diline doladığı debdebeli dedim dedisiyle dırdırını dilinden düşürüp de bir kez olsun doya doya düden diyemeden, düdenin dallara doldurduğu doyumlu yemişlerden doyasıya yiyemeden dâr-ı dünyadan göçüp gitti.");
    lstJust.add("Şu dardünyada delilerle dertli dedeler içinde didindin durdun da kendi derdini döküp dereden tepeden dört çift lakırdı edecek bir hemderdi neden bulamadın?");
    lstJust.add("Davulcu dede dışarlıklı dikişçiyi dolandırırken dönemecin duvarından düştü.");
    lstJust.add("Değirmene girdi köpek, değirmenci çaldı kötek, hem kepek yedi köpek, hem kötek yedi köpek.");
    lstJust.add("Dedemanda dayımın düdük delisi debdebeli deli dolu Doğan, doya doya doydum demeden, dedim dediye dırdıra düşmeden gitti.");
    return lstJust;
  }
  public List<String> getJustE(){
    lstJust = new ArrayList<>();
    lstJust.add("Ebe Ece, edepli Efe egemen eğitimde ejderli ehliyetini ekleyerek ellerini emeklinin entrikacı spekürcü erkek esmer esşine etejerli evinde eyvah diyerek ezberletti.");
    lstJust.add("Ecelerin Eveabat'taki evlerindeki tekir kedi, tenceredeki elli dirhemeti kendi kendine yedi.");
    lstJust.add("Eğer, Eleşkirtli eleştirmen Eşref ile Edremitli Bedri'yi Ege'nin en iyi eyercisi biliyorlarsa, ben de en iyi Ermenekli Erdem, Ergene'nin en iyi elektrikçisidir derim.");
    lstJust.add("Elalem bir aladana aldı aladanalandı da biz bir aladana alıp aladanalanamadık.");
    lstJust.add("Erzurumlu Efruz Efendi'nin evde kalmış, evlenememiş ebesi, Edirne emini İskender Efendi'ye,\"evet\" deyip evlenmelide mi ev edinmeli, yoksa evlenmemelide mi ev edinmeli.");
    return lstJust;
  }
  public List<String> getJustF(){
    lstJust = new ArrayList<>();
    lstJust.add("Fakat farfara fareler falancanın falanını falsosuz familtesitle fakir fabrikada faydalandılar.");
    lstJust.add("Farfaracı Fikriye ile favorili faso fiso Fahri, Fatsalı Fatma’yı görünce, fesleğenci feylesoy Feyyaz’ı fındıkçı Ferhunde’yi anımsatarak feveran ettiler.\n");
    lstJust.add("Fasa fisocu Fikret, Fatsalı ile fesleğenci Feyyaz’ın fındıkçı Ferhunde’si Felemenk’e fink atmaya gittiler.\n");
    lstJust.add("Felemenkte Felemenklerin Felemenkçe mi konuştuklarını düşüne düşüne fertliği çektiler.\n");
    lstJust.add("Feraceli Fethiye fener yolunda feminist Feride feryat etmekle fenalaştı.\n");
    return lstJust;
  }
  public List<String> getJustG(){
    lstJust = new ArrayList<>();
    lstJust.add("Geçen Gece Gemerek’ten Gediz’e Gelen Gebzeli Gezginci Gizemcilerden , General Genzel , Gitarist Gençlere Gerçek Dışılıkla Gerçeklik Dişi Ilişkiler Arasinda Ne Gibi Bir Gerçeklik Olduğunu Sordu.  ");
    lstJust.add("Güneyli Gammaz Galip Gâvur Dağinda Güpe Gündüz Galeyana Gelmiş De Gülgillioğlu Gaziantepli Gazup Gazinocu Gaffuru Gitarciyla Birlikte Gümüşhaneye Göndermiş.\n");
    return lstJust;
  }
  public List<String> getJustH(){
    lstJust = new ArrayList<>();
    lstJust.add("Habeş hemşire, hırkalı hizmetçi hoppa hödüğe hurmaları hürmetle sundu.");
    lstJust.add("Hahamhanede hahambaşı hahamı homur homur homurdanır görûnce, hemencecik heyecanlandı, hızlandı, hoşnutsuz hırçın halhallarla halkaları, halatları hallaçlara verdi.");
    lstJust.add("Havzalı Haydar, hancı Haydar’ın hasretinden, hastanedeki haşhaşçı halka haykırarak havalandırdı.");
    lstJust.add("Horasanlı hoppa hoca, hokkabaz hoyrat Hozatlı’nın horozuna hoyratlıkla hoşafları döktü.");
    lstJust.add("Hiçlik herkesi hastalık hastası halinde hırpalayan, nahoşça hırpalayabilen hain hislerdendir.");
    return lstJust;
  }
  public List<String> getJustI(){
    lstJust = new ArrayList<>();
    lstJust.add("Iğdır'ın ığıl ığıl akan ılıman ırmağının kıyıları ıklım tıklım ılgın kaplıdır.");
    lstJust.add("Ilım ılınan, ılıcalı ılıcalı akan ılık Iğdır Irmağı'nın kıyıları ıkır tıkır ığrıp ağaçlarıyla kaplıdır.");
    lstJust.add("Issız Sivrihisar’ın sarsıntısız şosesi üstünde zırıltısız sızıltısız bir yaz köşesi seçip sazsız, cazsız ve susuz, içkisiz sırf sosisonla işsiz bir yaz sürmek isteyişimizin sırrını sezişinize serzenişsizce sustum.");
    return lstJust;
  }
  public List<String> getJustII(){
    lstJust = new ArrayList<>();
    lstJust.add("İbibiklerin ibibiklerini iyice iyileştirmek için İstinyeli istifçi İbiş’in istif istiridyeleri mi, yoksa, İskilipli İspinoz işportacı İshak’ın işliğindeki ibrişimler mi daha iyi, bilemiyorum.\n");
    lstJust.add("İbiş’le Memiş, iş miş dememiş, itişmiş, kavga etmiş, mahkemeye düşmüşler, mahkemeleşmişler. İş miş dememiş, itişmiş, kavga etmişlerde mi mahkemeye düşmüşler; iş miş demiş, itişmemiş, kavga etmemişlerde mi mahkemeye düşmüşler?");
    lstJust.add("İbiş’le Memiş, mahkemeye gitmiş, mahkemeleşmiş mi, mahkemeleşmemiş mi?");
    lstJust.add("İnim inim inleyen ibiliklerin, ibibiklerin ibiklerini ibrişimli iplikle ipil ipil istifleyen İskilli İskilipli’nin işliğinde toplandık");
    lstJust.add("İbrikleri icat eden içli idealist İffet, ihtiyar ikiz ilerici imparatoru, İncirlili ipekçi iri İspanyol’un işaretli iti ile iz sürüp iyice izledi.");
    return lstJust;
  }
  public List<String> getJustJ(){
    lstJust = new ArrayList<>();
    lstJust.add("Jale Japonyalı jandarmadan Japonca öğrendi.");
    lstJust.add("Jarseli jeolôg jestini jeolôjide yaptı.");
    lstJust.add("Jale’nin jurnâlci Jilet Japon’u jambon, jeton, jarse istedi.");
    lstJust.add("Jimnastikçi Japon jeolôg, jübiledeki jüriye jürnâl satıp, jiletini jurnaliyle jüriye verdi.");
    lstJust.add("Jurnâlci Jale ile jenaratör Müjgân, Japonya’dan jilet, jant, jet, jambon, jelatin, jartiyer, jeton, jarse, Japongülü getirdiler.");
    return lstJust;
  }
  public List<String> getJustK(){
    lstJust = new ArrayList<>();
    lstJust.add("Kâni’nin kafası Kâbil’i kabil değil kabûl etmez.");
    lstJust.add("Karaburunlu kabadayı Kadir, kafakâğıdını Kadirlili kadir bilmez kapkaççı Kasım’la, Kahire’deki Kalecikliler kahvehanesinde kalamarla kafuru satan kaparozcu Kuzguncuklu Kozmonot Kâzım’a kaptırmış.");
    lstJust.add("Kara kahküllü ketenli kız, kibar komşusuna, köprülü kuyuda küstü.");
    lstJust.add("Karabüklü kabadayı, kafakağıdını Kalecikli Kazım'a kaptırdı.");
    lstJust.add("Kekeme Kerim, kemençeci Kemal'le kerestecilik yaptı.");
    lstJust.add("Bu tarlaya bir şinik, kekere mekere ekmişler.\n"
        + "bu tarlaya da bir şinik kekere mekere ekmişler.\n"
        + "bu tarlaya ekilen bir şinik kekere mekereye boz ala boz başlı pis porsuk dadanmış,\n"
        + "bu tarlaya ekilen bir şinik kekere mekereye de boz ala boz başlı pis porsuk dadanmış,\n"
        + "o tarlaya ekilen bir şinik kekere mekereye dadanan boz ala boz başlı pis porsuk,... \n"
        + "diğer tarlaya ekilen bir şinik kekere mekereye dadanan boz ala boz başlı pis porsuk'a demiş ki,\n"
        + "sen ne zamandan beri bu tarlaya ekilen bir şinik kekere mekereye dadanan boz ala boz başlı pis porsuksun?\n"
        + "o da ona cevaben!\n"
        + "sen ne zaman o tarlaya ekilen bir şinik kekere mekereye dadanan boz ala boz başlı pis porsuk san,\n"
        + "bende o zamandan beri bu tarlaya ekilen bir şinik kekere mekereye dadanan boz ala boz başlı pis porsuğum demiş.");
    return lstJust;
  }
  public List<String> getJustL(){
    lstJust = new ArrayList<>();
    lstJust.add("Lügatli Lütfü, lütfen lügatini lütfetti.");
    lstJust.add("Leyla ile Lalelili Lale´ye leblebi ile likör ikram etmiş. Lüpçüler,lütfen lüzumlu lüzumsuz lakırdıları bırakın da lüzferle rızk, rot, rop, rint, ring, ray, radyoaktivite nedir diye konuşun.");
    lstJust.add("Liseli lirik limonatacı, limancılara limonlu likörler aldı.");
    lstJust.add("Limoncu Lemi, Lâle’nin lüks lôkantasında lüzumlu malzeme limonluğunda lıngır lıngır lıngırdayan dolu çaydanlığın yanına soluksuz nakletti.");
    lstJust.add("Lügatli Lütfü, lütfen lügatini lütfetti.");
    return lstJust;
  }
  public List<String> getJustM(){
    lstJust = new ArrayList<>();
    lstJust.add("Mağaralı Mehmet, mağazada magazinleri makbuzla satmış.");
    lstJust.add("Manken muhtarın, Muşlu Muzaffer'le yaptığı mukavele mutlu sona erdi.");
    lstJust.add("Marmara’daki Karmarişli mermerciler mermerciliği meslek edinmişler, ama Mamak’taki mamacılar manyetizmacılıkla marmelatçılığı meslek edinememişler.");
    lstJust.add("Marmaris’ten Marmara’ya maviş maviş menevişli mermerlerle mermerciler, mamacılar ve marmelâtçılar mırın kırın, mışıl mışıl gittiler.");
    lstJust.add("Maskeli madenci Mardinli mahcup Macit'i malüm manifatura malları ile mahkemede mahküm etti.");
    return lstJust;
  }
  public List<String> getJustN(){
    lstJust = new ArrayList<>();
    lstJust.add("Niğdeli Nihat'la nişanlı Nigar nispetsiz Nilüfer'le nihayetsiz nikah ninnisi söyledi.");
    lstJust.add("Nankör nalbant nalları nallamalı mı, nallamamalı mı ?");
    lstJust.add("Namlı Nallıhanlı Nesrin’in nalınlarını nazikâne nergis satan nöbetşekeri alan Nezaket’e vermesine ne dersin?");
    lstJust.add("Nakkaş nekre nışadırcı Niyazi noktadaki nöbetçiyle nutukta nükte yaptı.");
    lstJust.add("Nöbetçi Nedim, nalbant Nail'i narkozla nakletti.");
    return lstJust;
  }
  public List<String> getJustO(){
    lstJust = new ArrayList<>();
    lstJust.add("Ocak kıvılcımlandırıcılarından mısın, kapı gıcırdatıcılarından mısın? Ne ocak kıvılcımlandırıcılarındanım, ne kapı gıcırdatıcılarındanım.");
    lstJust.add("Okmeydanı'ndan Oğuzeli'ne otostop yap; Oltu'da volta at, olta al; Orhagazi'de Orhanelili Orhan'a otostopçuluk öğret, sonra da Osmancıklı Osman'a otoydu, fotoydu lotoydu, say dök.");
    lstJust.add("Olmaz olmaz deme, olmayacak dediğin oluyor.");
    lstJust.add("Oluklu'dan Kozlu'ya, Kozlu'dan Oğuzeli'nin Otçuk otogarına oba oba, ot toplaya toplaya Posoflu Osman'ın ocağına vardı.");
    lstJust.add("Oruçlu oduncu oluklu okunu oflaya oflaya orduya doğrulttu.");
    return lstJust;
  }
  public List<String> getJustOO(){
    lstJust = new ArrayList<>();
    lstJust.add("Ödemişli ödlek Ömer, öksürüklü Özdemir'in öküzüyle ördeğini öldürmüş.");
    lstJust.add("Öğretmen öğleyin öğrencilere dört öğeden oluşan öğütleri söylemiş.");
    lstJust.add("Öğretmen, özerk öğretimde, örnek çalışmalara destek oldu.");
    lstJust.add("Öküz ölür gönü kalır,yiğit ölür ünü kalır.");
    lstJust.add("Özbeöz'ün özbeöz Ödemişli öngörülü öğretmeni Özgüraslan ile Özgülaslan özellikle özerk ön öğretimde öylesine özverili övünç verici ve övgüye değer kişiler ki, hani tüm öğretim örgütleri içinde en özgün örnek onlardır, diyebilirim.");
    return lstJust;
  }
  public List<String> getJustP(){
    lstJust = new ArrayList<>();
    lstJust.add("Paçavracı paskal patronun paspasını paytak palavracı Pakize'nin paspal papucunu patlattı.");
    lstJust.add("Palavracı peltek pısırık pişkin poturlu pörsük pulcu patladı.");
    lstJust.add("Peltek pehlivan peçeli perişan Perizat'ın pervazı perdesiz peykede pestenkerani pembe pedagogla pençelendi.");
    lstJust.add("Pervasız palavracı, parasız pimponun pötikare paltosuna pompayı püskürttü.");
    lstJust.add("Pınarbaşı'nın pimpirik pompacısı Pötürgeli pazvantoğlu pusatçı, paskalyadan palaskasız pisbıyık paskal Pasin, pülümürlülere pülverizatörün Türkçesini satmış. Pülverizatörün Türkçesi mi ne Püskürteç.");
    return lstJust;
  }
  public List<String> getJustR(){
    lstJust = new ArrayList<>();
    lstJust.add("Rıfkı’yla Rıza rıhtımda rızklarını aradılar.");
    lstJust.add("Ramazanda Rizeli Remzi rüküş Rümeyşa’ya rastlamış da: römorkör, riziko, rokoko, Ruhülkudüs, rüzgârgülü, rıhzır, rehabilitasyon, rızk, rot, rop, rint, ring, ray ve radyoaktivite nedir diye sormuş.");
    lstJust.add("Ramazanda razakızade rastıklı Rasim, raftaki radyonun rabıtasını kesti.\n");
    lstJust.add("Radyolu ressam Rıfkı, rint romancıyla röportajcı robottan rüşvet aldı.");
    lstJust.add("Riyaziyeci Rıfat ricaen riyasetini rica etti.");
    return lstJust;
  }
  public List<String> getJustS(){
    lstJust = new ArrayList<>();
    lstJust.add("Safranbolulu Safinazla Salihlili Salih Sivrihisar’da soğuk almışlar, sinüzit olmuşlar, sonra sımsıkı sarınarak söylenmesiz Seyitgazi’ye varıp, sarımsaklı suteresini susarımsağı ile karıştırarak suyunu süzmüşler.");
    lstJust.add("Salepçi saf Sadık, sahtekâr sabuncu Salih’e salyalar saçarak sağlam saplı sopayla saldırdı.");
    lstJust.add("Sandıklı’da sepetleri sıralı simitçi sofrada sökülen sucukları süpürdü.");
    lstJust.add("Sazsız sözsüz, sarsıntısız bir yaz meşesi için işsiz, sessiz, serseri bir Sivrihisarlı isteyişimizin sızısını size serzenişlerle anlatamam ki.");
    lstJust.add("Sazende Şazi ile Zifos Zihni zaman zaman sizin sokağın sağ köşesinde sinsi sinsi fiskoslaşarak sizi zibidi Suzi’ye sonsuz ve sorumsuz bir hayasızlıkla ikide bir şikayet ederler.");
    return lstJust;
  }
  public List<String> getJustSS(){
    lstJust = new ArrayList<>();
    lstJust.add("Şaklaban şamdancı Şaban, şatafatlı şatosunda şaşmaz şakrak şairleri şanlı şakrak şapkacısının şarabıyla şaşırttı.");
    lstJust.add("Şamlı, şemsiyeli, şıracı, şişko, şoför Şakir, şölende, şurupçuları şüphelendirdi.");
    lstJust.add("Şavşatlı Şaban, Şarkışlalı şipşakçı Şekip, Şişhaneş´den şeytankuşunu, şiş şiyeyi şişlemiş, şiye keşişe şiş demiş.");
    lstJust.add("Şemsiyeli Şerbetçi Şefik, şehirli şekercinin şebboylarını şezlongunun şeritlerine astı.");
    lstJust.add("Şıkırtıcı şımarık şıkır şıkır oynadı.");
    return lstJust;
  }
  public List<String> getJustT(){
    lstJust = new ArrayList<>();
    lstJust.add("Titrek Tevfik, talihli Tahir'i tir tir titretti.");
    lstJust.add("Tokatlı tombalacı tombala torbasını toplarken tombalak torununu tokacı torbasına koydu.");
    lstJust.add("Tatar tepsici tıknaz titiz tosun, töbekeci tulumbacıyla tütün tüttürdü.");
    lstJust.add("Talihli Tahir'in titrek Tevfik'i ters türs söz ederek tir tir titretmesi tahin ve tahıl işini Turhallı tombul, tuhaf Turhan'a vermesi doğru mu?");
    lstJust.add("Tahrilli ve talihli tentürdiyotçu tetik Tahir’le tahterevallici tekinsiz Tevfik’in talimhanede ters türs konuşarak terter tepinip tir tir titremeleri Turhallı tombul Turgut’u tıpış tıpış tosbağa sokaktaki tömbekçiye doğru yürüttü.");
    return lstJust;
  }
  public List<String> getJustU(){
    lstJust = new ArrayList<>();
    lstJust.add("Uluborlulu Ufuk, utangaç Ulaş'la uğraşmaktan usandı.");
    lstJust.add("Umdum umdum, geri yumdum.");
    lstJust.add("Ulubatlı utangaç Ulaş'a uğursuz Ulunay'ın uzun uzun uzattığı urganı uğraşa uğraşa aldı.");
    lstJust.add("Umumunuzun mumu umumumuzun mumudur.");
    lstJust.add("Uzun burunlu umutsuz kulun mumunu mumsuz kutudan ateşlediler");
    return lstJust;
  }
  public List<String> getJustUU(){
    lstJust = new ArrayList<>();
    lstJust.add("Ürdünlü ünlü üfürükçü Üryani, Ünye, Ürgüp üzerinden ülküdeşlerine, üstüpü, üstübez, üvez, üzüm, üzengitaşı ve üzünç götürürken, Üveyik'ten ürüyerek, üvendirlerini sürüyerek yürüyen üçkağıtçıların ürküntü üreten ünü batasıca ünlemleriyle ürküverdi.\n");
    lstJust.add("Ürgüplü Hüseyin, üzüm üzüm üzülen, süzüm süzüm süzülen üzümcüye üzüldü.");
    lstJust.add("Üstü Üç taşlı taç saplı üç tunç tası çaldıran mı çabuk çıldırır, yoksa iç içe yüz ton saç kaplı çanı kaldıran mı çabuk çıldırır.");
    lstJust.add("Üzüntüden üşüdüğünün ürediğini, ürpererek ünlü ünlemesiyle ünledi.");
    lstJust.add("Üveçli Üvezli, Ürgüplü üzümcünün üzüm üzüm üzülen , süzüm süzüm süzülen Ünyeli üzengili güzelini üvendireyle ürüye sürüye götürdü.");
    return lstJust;
  }
  public List<String> getJustV(){
    lstJust = new ArrayList<>();
    lstJust.add("Vırvırcı vırvır vırladı,vızır vızır vızırdadı.");
    lstJust.add("Vefasız Vahap, farfara fırıldayışlı vefalı fırıldağını vınlayan yele fırlatan Veli’nin de vaktiyle vefalısıymış.");
    lstJust.add("Venedik’te vebadan vefat eden Vedat’ın veresesi vekâleti velveleye verdi.");
    lstJust.add("Vırvırcı Vedia ile vıdıvıdıcı Veli, velinimeti vatman Vahit’e vilayette veda edip Vefa’ya doğru vaveylasız, velevasız velespitle volta vururlarken voleybolcu Vatran, virtüöz Vicdani ve Viranşehirli vatansever, viyolonselist Vecibe ile karşılaştılar.");
    lstJust.add("Vıdıvıdıcı ve vırvırcı Vanlı Veli’nin Vefalı vatandaşı Vahit vatanseverine veda edip vilayette vola vura vura, vayvaycı Vicdani ve Viranköylü Vahap’la karşılaştı.\n");
    return lstJust;
  }
  public List<String> getJustY(){
    lstJust = new ArrayList<>();
    lstJust.add("Yalancıoğlu yalıncık Yayla Dağı’nın yahnisini yağsız yiyebilirse de Yayla Dağı’nın yağlı yoğurdundan, Yüksekova’nın yusyumru yumurta yumurtlayan tavuklarından, bir de yörük ayranıyla yufkasından asla vazgeçemez.");
    lstJust.add("Yalvaçlı yelpazeli Yıldız, yirmi yoksul yörükle yumurtalarını yükledi.");
    lstJust.add("Yeni yelpazeli Yekta, yerli yekpare yeleğine yedi yeni yemeni yerleştirdi.");
    lstJust.add("Yıldırım Yılmaz, yıkadığı yılanlarıyla yıldırım yıkıcıları yıldırdı.");
    lstJust.add("Yirmi yiğit yine yiğitlendi.");
    return lstJust;
  }
  public List<String  > getJustZ(){
    lstJust = new ArrayList<>();

    lstJust.add("Zıpır, zıpzıpçı, zımbacı, zıvanasız zirzopla zırıl zırıl zırlayarak zırvaladılar.");
    lstJust.add("Zevzek Zeki, zeminlikteki zehir zerrelerini, Zerrin’in zevci zeybek zenciye zeytinlikte verdi.");
    lstJust.add("Zerzevatçının sepetini sıska sülük, tatsız, tuzsuz, sert sırtlı biri zigzaglar çizen tazı gibi taşıyordu.");
    lstJust.add("Zararlı zarif Zahit, zamkçı zavallı zabite zambaklarda zalimlik etti.");
    lstJust.add("Zamkçı zevzek zirzop, zilli zorba zurnacıyla züğürtledi.");
    return lstJust;
  }

}
