package com.blogspot.cemilecerenerdem.calculator;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    //butonların isimlerini burada belirtiyorum. bunlar butondur diyorum.
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_topla,btn_cikar,btn_carp,btn_bol,btn_hesapla;
    TextView txt_aciklama,txt_sayilar;

    //hesaplanan değerleri aktarmak için.
    public String yeni_ifade;

    //işlemlerle ilgili buraya iki değişken tanımlıyorum. Bu değişkenlerin sayi_tampon adlı olanında textview daki son değeri tutacağım
    //islem tamponda ise istenilen işlem yazacak.
    public String islem_tampon;
    public String sayi_tampon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //burada da buton isimlerine kendi butonlarımı eşitliyorum. butonları değişkenleştiriyorum.
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_topla = (Button) findViewById(R.id.btn_topla);
        btn_cikar = (Button) findViewById(R.id.btn_cikar);
        btn_carp = (Button) findViewById(R.id.btn_carp);
        btn_bol = (Button) findViewById(R.id.btn_bol);
        btn_hesapla = (Button) findViewById(R.id.btn_hesapla);
        txt_sayilar = (TextView) findViewById(R.id.txt_sayilar);




    //şimdi butonları dinleyip tepkimelerini vereceğim.
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //anlık olarak bulunan değeri alarak üzerine işlem yapacağız
                //bu sebeple onceki_ifade adında anlık değeri aldığımız bir değişken tanımlıyoruz.
                //görüldüğü gibi txt_sayilar 'ın içinde bulunan değeri önce onceki_ifade değerine atıyoruz.
                String onceki_ifade = txt_sayilar.getText().toString();

            //equals komutu - bir değişken içerisinde ki ifadeyle, parantez içerisinde ki değeri karşılaştırır.
                //burada onceki_ifade 0 a eşitse yeni_ifade=0 olsun
                //eğer önceki değer 0 a eşit değilse yeni ifade bir önceki hali + 0 olsun. dedik.
                //0 ı eski değerin yanına yaz demek istedik.
                if (onceki_ifade.equals("0"))
                {

                    yeni_ifade="0";
                }
                else
                {

                yeni_ifade=onceki_ifade + "0";

                }

                //if koşullarına göre elde ettiğimiz yeni değeri. txt_sayilar textview unun içine atadık.
                txt_sayilar.setText(yeni_ifade);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String onceki_ifade = txt_sayilar.getText().toString();
                if (onceki_ifade.equals("0"))
                {

                    yeni_ifade="1";
                }
                else
                {

                    yeni_ifade = onceki_ifade + "1";
                }

                txt_sayilar.setText(yeni_ifade);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String onceki_ifade = txt_sayilar.getText().toString();
                if (onceki_ifade.equals("0"))
                {

                    yeni_ifade="2";
                }
                else
                {

                    yeni_ifade = onceki_ifade + "2";
                }

                txt_sayilar.setText(yeni_ifade);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String onceki_ifade = txt_sayilar.getText().toString();
                if (onceki_ifade.equals("0"))
                {

                    yeni_ifade="3";
                }
                else
                {

                    yeni_ifade = onceki_ifade + "3";
                }

                txt_sayilar.setText(yeni_ifade);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String onceki_ifade = txt_sayilar.getText().toString();
                if (onceki_ifade.equals("0"))
                {

                    yeni_ifade="4";
                }
                else
                {

                    yeni_ifade = onceki_ifade + "4";
                }

                txt_sayilar.setText(yeni_ifade);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String onceki_ifade = txt_sayilar.getText().toString();
                if (onceki_ifade.equals("0"))
                {

                    yeni_ifade="5";
                }
                else
                {

                    yeni_ifade = onceki_ifade + "5";
                }

                txt_sayilar.setText(yeni_ifade);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String onceki_ifade = txt_sayilar.getText().toString();
                if (onceki_ifade.equals("0"))
                {

                    yeni_ifade="6";
                }
                else
                {

                    yeni_ifade = onceki_ifade + "6";
                }

                txt_sayilar.setText(yeni_ifade);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String onceki_ifade = txt_sayilar.getText().toString();
                if (onceki_ifade.equals("0"))
                {

                    yeni_ifade="7";
                }
                else
                {

                    yeni_ifade = onceki_ifade + "7";
                }

                txt_sayilar.setText(yeni_ifade);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String onceki_ifade = txt_sayilar.getText().toString();
                if (onceki_ifade.equals("0"))
                {

                    yeni_ifade="8";
                }
                else
                {

                    yeni_ifade = onceki_ifade + "8";
                }

                txt_sayilar.setText(yeni_ifade);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String onceki_ifade = txt_sayilar.getText().toString();
                if (onceki_ifade.equals("0"))
                {

                    yeni_ifade="9";
                }
                else
                {

                    yeni_ifade = onceki_ifade + "9";
                }

                txt_sayilar.setText(yeni_ifade);
            }
        });


        //şimdi butonların işlevlerini yazacağız.
        btn_topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //burada sayi_tampon değişkenine txt_sayilar da yazan son değeri aldık.
                sayi_tampon=txt_sayilar.getText().toString().trim();
                //işlem açıklamasını yaptık.
                islem_tampon="topla";
                //txt_sayilara boş değer atadık. çünkü işlem sonrası oraya yeni değer gelecek. yani textview ı temizleme işlemini burada yapmış olduk.
                txt_sayilar.setText("");
            }
        });

        btn_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi_tampon=txt_sayilar.getText().toString().trim();
                islem_tampon="cikar";
                txt_sayilar.setText("");
            }
        });

        btn_carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi_tampon=txt_sayilar.getText().toString().trim();
                islem_tampon="carp";
                txt_sayilar.setText("");
            }
        });

        btn_bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi_tampon=txt_sayilar.getText().toString().trim();
                islem_tampon="bol";
                txt_sayilar.setText("");
            }
        });



        //hesaplama butonunun işlevlerini yazalım.
        btn_hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sayı boşsa ya da işlem seçilmemişse uyarı mesajı verecek
                if (sayi_tampon.equals("") || islem_tampon.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"En az 1 sayı ve 1 İşlem Seçilmeli.", Toast.LENGTH_SHORT).show();

                }
                else
                    {
                    //burada yeni ifade değerine txt sayilar değerinde bulunan değeri alacağım. mesela girilen sayı 10
                    String yeni_ifade=txt_sayilar.getText().toString();
                   //girilen sayı değerini string den integer 'a çevirdim ki işlem yapabileyim.
                    int yeni_ifade_int= Integer.parseInt(yeni_ifade);
                    //sayı tampon da tuttuğum değeri de eski ifade int değerine ve integer'a çevirerek attım. önceden girilen sayıyı temsil ediyor.
                    int eski_ifade_int=Integer.parseInt(sayi_tampon);


//şimdi burada islem_tampon değerini kullanarak ve bu değerleri iflerle yöneterek işlemlerimi yaptıracağım.
                        if (islem_tampon=="topla")
                        {
                               //sonucislemi değişkeninde if değeri koşulunu kontrol ettikten sonra toplama işlemi yaptırdım ve txt sayılar textview ıma girdirttim.
                                int sonuc_islemi = (eski_ifade_int + yeni_ifade_int);
                                txt_sayilar.setText(String.valueOf(sonuc_islemi));

                        }
                        else if (islem_tampon=="cikar")
                        {
                            int sonuc_islemi = (eski_ifade_int - yeni_ifade_int);
                            txt_sayilar.setText(String.valueOf(sonuc_islemi));

                        }
                        else if (islem_tampon=="carp")
                        {
                            int sonuc_islemi = (eski_ifade_int * yeni_ifade_int);
                            txt_sayilar.setText(String.valueOf(sonuc_islemi));

                        }
                        else if (islem_tampon=="bol")
                        {
                            int sonuc_islemi = (eski_ifade_int / yeni_ifade_int);
                            txt_sayilar.setText(String.valueOf(sonuc_islemi));

                        }

                    }
            }
        });

    }
}
