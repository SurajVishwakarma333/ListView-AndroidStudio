package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //importing/Initialising ListView. where ListView = widget name and citiesList = id name of ListView
    private ListView citiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding ListView from .xml file to .java file
        citiesList = findViewById(R.id.citiesList);

        //Creating ArrayList to add the data in list
        final ArrayList<String> arrayCities = new ArrayList<>();
        arrayCities.add("Mumbai");
        arrayCities.add("Chennai");
        arrayCities.add("Hyderabad");
        arrayCities.add("Kolkata");
        arrayCities.add("UP");
        arrayCities.add("MP");
        arrayCities.add("Gujarat");
        arrayCities.add("Delhi");
        arrayCities.add("Lukhnow");
        arrayCities.add("Mirzapur");
        arrayCities.add("Goregaon");
        arrayCities.add("Andheri");
        arrayCities.add("Dadar");
        arrayCities.add("Jopgeshwari");
        arrayCities.add("Kalyan");
        arrayCities.add("CST");
        arrayCities.add("Churchgate");
        arrayCities.add("Kurla");
        arrayCities.add("Grant Road");
        arrayCities.add("Marine lines");
        arrayCities.add("Prabhadevi");
        arrayCities.add("Vasai");
        arrayCities.add("Virar");
        arrayCities.add("Ghatkopar");
        arrayCities.add("Borivali");
        arrayCities.add("Bhayandar");
        arrayCities.add("Parel");
        arrayCities.add("Gorai");
        arrayCities.add("Pawai");
        arrayCities.add("Chinchpokli");
        arrayCities.add("Mira Road");

        //Creating ArrayAdapter to fetch the data of arraylist to listview.
        /* There are 3 parameter in ArrayAdapter :-
                    1. this context = means to tell that in which file we are in this means these file only.
                    2. android.R.layout.simple_list_item_1=layout file for every item
                    3. =to pass the data
         */
        ArrayAdapter<String> adapterCities = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayCities);

        //Passing adapter content to listview.
        citiesList.setAdapter(adapterCities);


        //now let make setOnItemClickListener for when we click on any cities-name something should be happen.
        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, arrayCities.get(i) + " Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
/*
Steps :-
1.add listview in xml file and change constraint layout to relativelayout
2.import ListView in java file
3.find listview by findViewById
4.create array list and add the data
5.create adapter to display the array list data
6.pass the data
8.create setOnItemClickListener to so something when we click on cities name.
 */