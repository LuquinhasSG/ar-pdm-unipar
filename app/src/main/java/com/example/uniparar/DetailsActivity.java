package com.example.uniparar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setProduct();
        setTitle("Detalhes");
    }

    private void setProduct() {
        ImageView productPhoto = findViewById(R.id.productDetailsPhoto);
        TextView productName = findViewById(R.id.productDetailsName);
        TextView productDescription = findViewById(R.id.productDetailsDescription);
        TextView productPrice = findViewById(R.id.productDetailsPrice);

        Bundle bundle = getIntent().getExtras();

        productPhoto.setImageResource(bundle.getInt("productPhoto"));
        productName.setText(bundle.getString("productName"));
        productDescription.setText(bundle.getString("productDescription"));
        productPrice.setText(bundle.getString("productPrice"));
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}