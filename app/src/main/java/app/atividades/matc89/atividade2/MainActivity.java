package app.atividades.matc89.atividade2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    Button changeButton;
    TextView changeLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeButton = (Button)findViewById(R.id.change);
        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                changeLabel = (TextView)findViewById(R.id.label);
                TextView texto = (TextView)findViewById(R.id.textField);
                changeLabel.setText(texto.getText().toString());
            }
        });
    }


}
