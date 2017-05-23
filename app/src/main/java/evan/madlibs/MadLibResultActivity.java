package evan.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MadLibResultActivity extends AppCompatActivity{
    @Bind(R.id.resultTextView) TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_result_activity);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String editText1 = intent.getStringExtra("editText1");
        String editText2 = intent.getStringExtra("editText2");
        String editText3 = intent.getStringExtra("editText3");
        String editText4 = intent.getStringExtra("editText4");
        String editText5 = intent.getStringExtra("editText5");
        String editText6 = intent.getStringExtra("editText6");

        String result = String.format("One day when %s went to the %s. The %s at the %s and " +
                        "when %s on the car the world %s.", editText1,
                editText2,
                editText3, editText4,
                editText5, editText6);

        mResultTextView.setText(result);
    }
}
