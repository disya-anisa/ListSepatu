package id.ac.polinema.listsepatu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoSepatu = new ArrayList<>();
    private ArrayList<String> namaSepatu = new ArrayList<>();
    private ArrayList<String> infoSepatu = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoSepatu, namaSepatu, infoSepatu, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet(){

        namaSepatu.add("Wedge");
        fotoSepatu.add("https://cdn.idntimes.com/content-images/community/2018/07/d08bfa157c20b87e4b0672de33b84c67.jpg");
        infoSepatu.add("Sepatu ini dapat digunakan di berbagai momen, santai, ke kampus, ataupun ke kantor, bahkan ada juga yang memadukan dengan baju pesta." +
                "harga Rp. 200.000");

        namaSepatu.add("Stiletto");
        fotoSepatu.add("https://cdn.idntimes.com/content-images/community/2018/07/5173d4cb71470e3468cbeb791a914896.jpg");
        infoSepatu.add("Jenis sepatu ini cocok digunakan dalam acara formal maupun santai, pemakai akan terlihat menarik karena lebih anggun.");

        namaSepatu.add("Pump");
        fotoSepatu.add("https://cdn.idntimes.com/content-images/community/2018/07/691662e5818bece9526e8fa78b176297.jpg");
        infoSepatu.add("Model sepatu ini lebih cocok digunakan untuk acara pesta yang bersifat formal.");

        namaSepatu.add("Boots");
        fotoSepatu.add("https://cdn.idntimes.com/content-images/community/2018/07/0c501dad4ab12e3c189b3e78d7fb8aad.jpg");
        infoSepatu.add("Model sepatu ini lebih cocok digunakan untuk acara manggung atau fashion.");

        namaSepatu.add("High heels");
        fotoSepatu.add("https://cdn.idntimes.com/content-images/community/2018/07/ad1c2c66c23171b9de3e7608bac16d5a.jpg");
        infoSepatu.add("Model sepatu ini lebih cocok digunakan untuk acara pesta yang bersifat formal maupun santai .");

        namaSepatu.add("Kitten Heels");
        fotoSepatu.add("https://cdn.idntimes.com/content-images/community/2018/07/5cc9619783b72b1c7876b7d5f1017c48.jpg");
        infoSepatu.add("Sepatu ini cocok digunakan dalam acara formal maupun santai.");

        namaSepatu.add("Flat shoes");
        fotoSepatu.add("https://cdn.idntimes.com/content-images/community/2018/07/e273983be5daa4c23a8460535f9791cc.jpg");
        infoSepatu.add("Sepatu ini cocok digunakan dalam untuk kuliah atau untuk jalan-jalan.");

        namaSepatu.add("Statement Heels");
        fotoSepatu.add("https://cdn.idntimes.com/content-images/community/2018/07/fe3f2d00e5dcb96efa02443306a5db4f.jpg");
        infoSepatu.add("Sepatu ini lebih cocok digunakan pada acara pesta yang bersifat santai.");

        namaSepatu.add("Mules");
        fotoSepatu.add("https://cdn.idntimes.com/content-images/community/2018/07/05dcfb5c793f00fbd0590901ebf452c4.jpg");
        infoSepatu.add("Sepatu ini lebih cocok digunakan pada acara pesta yang bersifat santai atau untuk jalan-jalan.");

        namaSepatu.add("Platform Shoes");
        fotoSepatu.add("https://cdn.idntimes.com/content-images/community/2018/07/a145de331d8b9cc45bb16edc937d6541.jpg");
        infoSepatu.add("Sepatu ini lebih cocok digunakan pada acara pesta yang bersifat santai.");


        prosesRecyclerViewAdapter();

    }

}
