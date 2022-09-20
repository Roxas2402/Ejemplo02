package pastrana.jero.ejemplo02ciclodevidadelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ESTADOS", "1 - Estoy en onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "1 - Estoy en onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "1 - Estoy en onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "1 - Estoy en onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "1 - Estoy en onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "1 - Estoy en onStop");
    }
}