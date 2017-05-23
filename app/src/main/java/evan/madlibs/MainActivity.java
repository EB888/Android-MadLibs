package evan.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    @Bind(R.id.titleTextView) TextView titleTextView;
    @Bind(R.id.editText1) EditText mEditText1;
    @Bind(R.id.editText2) EditText mEditText2;
    @Bind(R.id.editText3) EditText mEditText3;
    @Bind(R.id.editText4) EditText mEditText4;
    @Bind(R.id.editText5) EditText mEditText5;
    @Bind(R.id.editText6) EditText mEditText6;
    @Bind(R.id.submitButton) Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mSubmitButton) {
            String editText1 = mEditText1.getText().toString();
            String editText2 = mEditText2.getText().toString();
            String editText3 = mEditText3.getText().toString();
            String editText4 = mEditText4.getText().toString();
            String editText5 = mEditText5.getText().toString();
            String editText6 = mEditText6.getText().toString();

            Intent intent = new Intent(MainActivity.this, MadLibResultActivity.class);
            intent.putExtra("editText1", editText1);
            intent.putExtra("editText2", editText2);
            intent.putExtra("editText3", editText3);
            intent.putExtra("editText4", editText4);
            intent.putExtra("editText5", editText5);
            intent.putExtra("editText6", editText6);
            startActivity(intent);
        }
    }
}
