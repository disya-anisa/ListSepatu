package id.ac.polinema.listsepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoSepatu;
    TextView textViewNamaSepatu;
    TextView textViewInfoSepatu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoSepatu = findViewById(R.id.imageViewFotoSepatu);
        textViewNamaSepatu = findViewById(R.id.textViewNamaSepatu);
        textViewInfoSepatu = findViewById(R.id.textViewInfoSepatu);

        getIncomingExtra();
    }

    private void getIncomingExtra(){

        if(getIntent().hasExtra("foto_sepatu") && getIntent().hasExtra("nama_sepatu") && getIntent().hasExtra("info_sepatu")){

            String fotoSepatu = getIntent().getStringExtra("foto_sepatu");
            String namaSepatu = getIntent().getStringExtra("nama_sepatu");
            String infoSepatu = getIntent().getStringExtra("info_sepatu");

            setDataActivity(fotoSepatu, namaSepatu, infoSepatu);
        }
    }

    private void setDataActivity(String fotoSepatu, String namaSepatu, String infoSepatu){

        Glide.with(this).asBitmap().load(fotoSepatu).into(imageViewFotoSepatu);
        textViewNamaSepatu.setText(namaSepatu);
        textViewInfoSepatu.setText(infoSepatu);

    }
}
