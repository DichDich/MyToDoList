package dichan.colasd.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by colasd on 23/01/2017.
 */
public class ToDoActivity extends Activity implements View.OnClickListener {

    private Button btnValide;
    private Button btnVide;
    private EditText editText;
    private TextView textView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        btnValide = (Button)findViewById(R.id.btnValider);
        btnValide.setOnClickListener(this);
        btnVide = (Button)findViewById(R.id.btnViderLaListe);
        btnVide.setOnClickListener(this);
        editText = (EditText)findViewById(R.id.editTextTxt);
        textView = (TextView)findViewById(R.id.txtViewTxt);
    }

    @Override
    public void onClick(View v) {
        String NewActivity = editText.getText().toString();
        String Activities = textView.getText().toString();
        if (v.getId() == R.id.btnValider){
            textView.setText(Activities + "\n" + NewActivity);
        }
        if (v.getId() == R.id.btnViderLaListe){
            textView.setText("");
        }

    }
}