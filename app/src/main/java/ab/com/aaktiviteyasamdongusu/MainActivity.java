package ab.com.aaktiviteyasamdongusu;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("yasam dongusu", "Oncreate");
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("yasam dongusu", "onPuase");
        Toast.makeText(this,"onPasue", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("yasam dongusu", "onResume");
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("yasam dongusu", "onRestart");
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("yasam dongusu", "onStart");
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("yasam dongusu", "onStop");
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("yasam dongusu", "onDestror");
        Toast.makeText(this,"onDestror", Toast.LENGTH_SHORT).show();

    }
}
