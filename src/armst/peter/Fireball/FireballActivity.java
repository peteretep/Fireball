package armst.peter.Fireball;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class FireballActivity extends Activity {
    /** Called when the activity is first created. */
	private Spinner mastSpinner, sailSpinner, weatherSpinner;
	private Button submit;
//	private Button goSettings;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fireball_criteria);
        
        
    mastSpinner = (Spinner) findViewById(R.id.mastSpinner);
    ArrayAdapter<CharSequence> mastAdapter = ArrayAdapter.createFromResource(
            this, R.array.mast_array, android.R.layout.simple_spinner_item);
    mastAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mastSpinner.setAdapter(mastAdapter);
    
    sailSpinner = (Spinner) findViewById(R.id.sailSpinner);
    ArrayAdapter<CharSequence> sailAdapter = ArrayAdapter.createFromResource(
            this, R.array.sail_array, android.R.layout.simple_spinner_item);
    sailAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    sailSpinner.setAdapter(sailAdapter);

    weatherSpinner = (Spinner) findViewById(R.id.weatherSpinner);
    ArrayAdapter<CharSequence> weatherAdapter = ArrayAdapter.createFromResource(
            this, R.array.weather_array, android.R.layout.simple_spinner_item);
    weatherAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    weatherSpinner.setAdapter(weatherAdapter);
   
    submit = (Button) findViewById(R.id.submit);
    
	submit.setOnClickListener(new OnClickListener() {
 
	  @Override
	  public void onClick(View v) {
 
	    Toast.makeText(FireballActivity.this,
		"Setup : " + 
                "\nMast : "+ String.valueOf(mastSpinner.getSelectedItem()) + 
                "\nSails : "+ String.valueOf(sailSpinner.getSelectedItem()),
			Toast.LENGTH_SHORT).show();
	    Intent i = new Intent(FireballActivity.this, Weather.class);
	    Bundle bundle = new Bundle();
	    bundle.putString("MAST", String.valueOf(mastSpinner.getSelectedItem()));
	    bundle.putString("SAILS", String.valueOf(sailSpinner.getSelectedItem()));
	    bundle.putString("WEATHER", String.valueOf(weatherSpinner.getSelectedItem()));
	    i.putExtras(bundle);
        startActivity(i);
	  }
 
	});
    }
    
    

}
