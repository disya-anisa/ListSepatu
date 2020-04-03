package id.ac.polinema.listsepatu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.lang.reflect.Array;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> fotoSepatu = new ArrayList<>();
    private ArrayList<String> namaSepatu = new ArrayList<>();
    private ArrayList<String> infoSepatu = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoSepatu, ArrayList<String> namaSepatu, ArrayList<String> infoSepatu, Context context) {
        this.fotoSepatu = fotoSepatu;
        this.namaSepatu= namaSepatu;
        this.infoSepatu = infoSepatu;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(fotoSepatu.get(position)).into(holder.ImageViewFotoSepatu);

        holder.textViewNamaSepatu.setText(namaSepatu.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(context, namaSepatu.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto_sepatu", fotoSepatu.get(position));
                intent.putExtra("nama_sepatu", namaSepatu.get(position));
                intent.putExtra("info_sepatu", infoSepatu.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaSepatu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView ImageViewFotoSepatu;
        TextView textViewNamaSepatu;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageViewFotoSepatu = itemView.findViewById(R.id.imageViewFotoSepatu);
            textViewNamaSepatu = itemView.findViewById(R.id.textViewNamaSepatu);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
