package com.ss_baez.petagram;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class LikesMascotas extends AppCompatActivity {

    ArrayList<Pet> pets;
    private RecyclerView listaPets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likes_mascotas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.huellita48);

        listaPets = (RecyclerView) findViewById(R.id.rvPets);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPets.setLayoutManager(llm);
        inicializarListaPets();
        inicializarAdaptador();
    }

    public PetAdaptador objAdaptador;
    public void inicializarAdaptador(){
        objAdaptador = new PetAdaptador(pets, this);
        listaPets.setAdapter(objAdaptador);
    }


    public void inicializarListaPets(){
        pets = new ArrayList<Pet>();


        pets.add(new Pet(R.drawable.pet5, "Paco", "2"));
        pets.add(new Pet(R.drawable.pet4, "René", "10"));
        pets.add(new Pet(R.drawable.pet2, "Chaks", "2"));
        pets.add(new Pet(R.drawable.pet3, "Vektor", "6"));
        pets.add(new Pet(R.drawable.pet1, "Toby", "4"));
    }

}
