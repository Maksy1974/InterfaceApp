package com.example.interfaceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.tampil)
        {
            Toast.makeText(this, "Menu tampil dipilih", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.tutup)
        {
            Toast.makeText(this, "Menu tutup dipilih", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.help)
        {
            Toast.makeText(this, "Menu help dipilih", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}