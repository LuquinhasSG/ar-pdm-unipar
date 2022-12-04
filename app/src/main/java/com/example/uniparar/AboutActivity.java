package com.example.uniparar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Meu Perfil");
        setTexts();
    }

    private void setTexts() {
        ImageView userAvatar = findViewById(R.id.user_avatar);
        TextView userName = findViewById(R.id.user_name);
        TextView userRa = findViewById(R.id.user_ra);
        TextView userAddress = findViewById(R.id.user_address);
        TextView userDistrict = findViewById(R.id.user_district);
        TextView userCity = findViewById(R.id.user_city);
        TextView userUf = findViewById(R.id.user_state);
        Bundle bundle = getIntent().getExtras();
        userAvatar.setImageResource(bundle.getInt("avatar"));
        userName.setText(bundle.getString("name"));
        userRa.setText(bundle.getString("ra"));
        userAddress.setText(bundle.getString("address"));
        userDistrict.setText(bundle.getString("district"));
        userCity.setText(bundle.getString("city"));
        userUf.setText(bundle.getString("state"));
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}