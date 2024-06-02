package aplicacionesmoviles.avanzado.todosalau.ejemplocaracteristicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);
        TextView answerTextView = findViewById(R.id.answerTextView);

        // Obtener la información del dispositivos
        String versionOS = Build.VERSION.RELEASE;
        int versionAPI = Build.VERSION.SDK_INT;
        String modelo = Build.MODEL;
        String fabricante = Build.MANUFACTURER;
        String hardware = Build.HARDWARE;
        String procesador = Build.PRODUCT;
        String marca = Build.BRAND;
        String tipoBuild = Build.TYPE;

        btn1.setOnClickListener(view ->{
            answerTextView.setText("Versión de Android: " + versionOS);
        });

        btn2.setOnClickListener(view ->{
            answerTextView.setText("Número de API: " + versionAPI);
        });

        btn3.setOnClickListener(view ->{
            answerTextView.setText("Modelo: " + modelo);
        });

        btn4.setOnClickListener(view ->{
            answerTextView.setText("Fabricante: " + fabricante);
        });

        btn5.setOnClickListener(view ->{
            answerTextView.setText("Hardware: " + hardware);
        });

        btn6.setOnClickListener(view ->{
            answerTextView.setText("Procesador: " + procesador);
        });

        btn7.setOnClickListener(view ->{
            answerTextView.setText("Marca: " + marca);
        });

        btn8.setOnClickListener(view ->{
            answerTextView.setText("Tipo de build: " + tipoBuild);
        });
    }
}