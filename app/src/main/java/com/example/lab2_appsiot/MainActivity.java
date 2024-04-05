package com.example.lab2_appsiot;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView teleMathTextView = findViewById(R.id.textView5);

        registerForContextMenu(teleMathTextView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        TextView teleMathTextView = findViewById(R.id.textView5);
        String itemId = getResources().getResourceEntryName(item.getItemId());
        switch (itemId) {
            case "colorAzul":
                teleMathTextView.setTextColor(ContextCompat.getColor(this, R.color.colorAzul));
                return true;
            case "colorVerde":
                teleMathTextView.setTextColor(ContextCompat.getColor(this, R.color.colorVerde));
                return true;
            case "colorRojo":
                teleMathTextView.setTextColor(ContextCompat.getColor(this, R.color.colorRojo));
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    public void irAVentana2(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

    public void irAVentana3(View view) {

        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }

}
