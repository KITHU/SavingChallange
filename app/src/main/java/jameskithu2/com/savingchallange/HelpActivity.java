package jameskithu2.com.savingchallange;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    TextView helptext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        ActionBar actionBar =getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("how to use the app");

        helptext = (TextView) findViewById(R.id.helPtext);
        String text1 = "To get the total amount to save for a certain number of weeks just" +
                " ENTER number of weeks on the amount_weeks field e.g 52 , then enter the denomination " +
                "as amount to start saving e.g ksh 50. Hit the get saving button to get total incrementing savings."+
                "Note: saving are incrementing per week e.g ksh 50,100,150,200 and so on......";
        helptext.setText(text1);
    }
}
