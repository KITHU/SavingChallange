package jameskithu2.com.savingchallange;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText amount, denomination;
    TextView display;
    Button getSavings, getDuration, clear;
    boolean val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (EditText) findViewById(R.id.amount);
        denomination = (EditText) findViewById(R.id.denomination);
        display = (TextView) findViewById(R.id.display);
        getDuration = (Button) findViewById(R.id.getDuration);
        getSavings = (Button) findViewById(R.id.getSavings);
        clear = (Button) findViewById(R.id.clear);





            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    amount.setText("");
                    denomination.setText("");
                    display.setText("");
                }
            });

            getSavings.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (denomination.length() == 0 || amount.length() == 0) {
                        return;
                    } else {

                            int sum = 0;
                            int totalSum = 0;
                            int denom = Integer.parseInt(denomination.getText().toString());
                            int weeks = Integer.parseInt(amount.getText().toString());
                            for (int i = 1; i <= weeks; i++) {
                                sum += denom;
                                totalSum += sum;

                                display.setText("Ksh " + totalSum + "");
                            }

                    }
                }
            });

            //

            getDuration.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (denomination.length() == 0 || amount.length() == 0) {
                        //do nothing
                        return;
                    } else {

                        int sum = 0;
                        int totalSum = 0;
                        int denom = Integer.parseInt(denomination.getText().toString());
                        int amot = Integer.parseInt(amount.getText().toString());


                        for (int i = 1; i <= 5201; i++) {
                            sum += denom;
                            totalSum += sum;

                            if (amot <= totalSum) {

                                display.setText(i + " weeks");
                                break;
                            }


                        }
                    }
                }
            });
        }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            if(item.getItemId()==R.id.helP){

                Intent intent = new Intent(this,HelpActivity.class);
                startActivity(intent);

            }else if(item.getItemId()==R.id.about_developer){
                Toast.makeText(this,"NAME: James waweru N  \nEMAIL:james.kithu2@gmail.com  \nCELL:0713-195-599",Toast.LENGTH_LONG).show();
        }else if(item.getItemId()==R.id.settings){

                Intent intent = new Intent(this,SettingsActivity.class);
                startActivity(intent);
            }
        return super.onOptionsItemSelected(item);
    }
}