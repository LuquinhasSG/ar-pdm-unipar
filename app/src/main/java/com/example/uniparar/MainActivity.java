package com.example.uniparar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.uniparar.adapter.AdapterProduct;
import com.example.uniparar.model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Product> productsList = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView_products);
        setTitle("Produtos");

        setProductInfo();
        setAdapter();

    }

    private void setAdapter() {
        AdapterProduct adapter = new AdapterProduct(productsList, getApplicationContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    private void setProductInfo() {
        productsList.add(new Product("SSD SanDisk Plus 480GB", "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.", "R$ 450,00", R.drawable.ssd));
        productsList.add(new Product("GeForce RTX 3090 24GB", "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.", "R$ 18.499,00", R.drawable.placadevideo));
        productsList.add(new Product("Teclado Mecânico Gamer", "Teclado Mecânico Gamer T-Dagger Corvette, LED Rainbow, Switch Outemu DIY Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).", "R$ 229,00", R.drawable.teclado));
        productsList.add(new Product("Intel Core i5 10400F", "Os novos processadores da 10ª geração oferecem atualizações de desempenho incríveis para melhorar a produtividade e proporcionar entretenimento surpreendente.", "R$ 1.050,00", R.drawable.processador));
        productsList.add(new Product("Memória Ram Corsair", "Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.", "R$ 369,00", R.drawable.memoria));
        productsList.add(new Product("Gabinete Gamer", "A série Carbide SPEC-DELTA RGB é uma caixa ATX de torre média de vidro temperado com estilo angular impressionante, fluxo de ar potente e três ventiladores de refrigeração RGB incluídos.", "R$ 799,00", R.drawable.gabinete));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                intent.putExtra("avatar", R.drawable.avatar);
                intent.putExtra("name", "Lucas Dillenburg");
                intent.putExtra("ra", "09023391");
                intent.putExtra("address", "Rua do algodão doce 1155");
                intent.putExtra("district", "Pé de Feijão");
                intent.putExtra("city", "Francisco Beltrão");
                intent.putExtra("state", "Paraná");
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}