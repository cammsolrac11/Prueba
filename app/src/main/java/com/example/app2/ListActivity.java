package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.app2.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private RecyclerView javaList;
    private List<Contact> lstContact = new ArrayList<>();
    RecyclerViewAdapter recyclerViewAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        javaList =findViewById(R.id.list);
        Contact contact = new Contact("nombre","99999999",R.drawable.prueba,50);
        Contact contact2 = new Contact("nom2","99999999",R.drawable.prueba,50);
        Contact contact3 = new Contact("nombre3","99999999",R.drawable.prueba,50);
        Contact contact4 = new Contact("nombre4","99999999",R.drawable.prueba,50);
        Contact contact5 = new Contact("nombre5","99999999",R.drawable.prueba,50);
        Contact contact6 = new Contact("nombre6","99999999",R.drawable.prueba,50);
        Contact contact7 = new Contact("nombre7","99999999",R.drawable.prueba,50);
        Contact contact8 = new Contact("nombre8","99999999",R.drawable.prueba,50);
        Contact contact9 = new Contact("nombre9","99999999",R.drawable.prueba,50);
        Contact contact10 = new Contact("nombre10","99999999",R.drawable.prueba,50);
        Contact contact11 = new Contact("nombre11","99999999",R.drawable.prueba,50);
        lstContact.add(contact);
        lstContact.add(contact2);
        lstContact.add(contact3);
        lstContact.add(contact4);
        lstContact.add(contact5);
        lstContact.add(contact6);
        lstContact.add(contact7);
        lstContact.add(contact8);
        lstContact.add(contact9);
        lstContact.add(contact10);
        lstContact.add(contact11);

        recyclerViewAdapter = new RecyclerViewAdapter(this,lstContact);
        javaList.setLayoutManager(new LinearLayoutManager(this));
        javaList.setAdapter(recyclerViewAdapter);



    }
}
