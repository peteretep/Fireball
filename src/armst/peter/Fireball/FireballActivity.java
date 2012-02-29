package armst.peter.Fireball;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class FireballActivity extends Activity {
    /** Called when the activity is first created. */
	private Spinner weatherSpinner;
	private Button submit;
//	private Button goSettings;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather);


    weatherSpinner = (Spinner) findViewById(R.id.weatherSpinner);
    ArrayAdapter<CharSequence> weatherAdapter = ArrayAdapter.createFromResource(
            this, R.array.weather_array, android.R.layout.simple_spinner_item);
    weatherAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    weatherSpinner.setAdapter(weatherAdapter);
   
    submit = (Button) findViewById(R.id.submit);
    
	submit.setOnClickListener(new OnClickListener() {
 
	  @Override
	  public void onClick(View v) {
 
	   
	    Intent i = new Intent(FireballActivity.this, Settings.class);
	    Bundle bundle = new Bundle();
	  
	    bundle.putString("WEATHER", String.valueOf(weatherSpinner.getSelectedItem()));
	    i.putExtras(bundle);
        startActivity(i);
	  }
 
	});
    }
    
    

}
