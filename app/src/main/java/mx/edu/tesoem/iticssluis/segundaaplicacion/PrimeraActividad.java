package mx.edu.tesoem.iticssluis.segundaaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PrimeraActividad extends AppCompatActivity implements View.OnClickListener {

    Button saludosbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_actividad);

        saludobtn = (Button) findViewById(R.id.btsaludo);

        saludosbtn,setOnClickListener (This);
    }

    @Override
    public void setOnClickListener(View v);
    Toss.makeText (Bienvendifo a tu segundo programa).show ()
    }
}
