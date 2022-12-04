package com.example.uniparar.adapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uniparar.AboutActivity;
import com.example.uniparar.DetailsActivity;
import com.example.uniparar.R;
import com.example.uniparar.model.Product;

import java.util.ArrayList;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.MyViewHolder> {
    private ArrayList<Product> productList;
    private Context context;
    public AdapterProduct(ArrayList<Product> productsList, Context context){
        this.productList = productsList;
        this.context = context;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView productName;
        private TextView productDescription;
        private TextView productPrice;
        private ImageView productPhoto;


        public MyViewHolder(final View view){
            super(view);
            productName = view.findViewById(R.id.productName);
            productDescription = view.findViewById(R.id.productDescription);
            productPrice = view.findViewById(R.id.productPrice);
            productPhoto = view.findViewById(R.id.productPhoto);
        }
    }

    @NonNull
    @Override
    public AdapterProduct.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProduct.MyViewHolder holder, int position) {
        String pName = productList.get(position).getName();
        String pDescription = productList.get(position).getDescription();
        String pPrice = productList.get(position).getPrice();
        int pPhoto = productList.get(position).getPhoto();
        holder.productName.setText(pName);
        holder.productDescription.setText(pDescription);
        holder.productPrice.setText(pPrice);
        holder.productPhoto.setImageResource(pPhoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailsActivity.class);
                intent.putExtra("productName", pName);
                intent.putExtra("productDescription", pDescription);
                intent.putExtra("productPrice", pPrice);
                intent.putExtra("productPhoto", pPhoto);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
