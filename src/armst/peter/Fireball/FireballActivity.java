package armst.peter.Fireball;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FireballActivity extends Activity {
    /** Called when the activity is first created. */
	private Spinner weatherSpinner;
	private Button submit;
	private Button home;
	public static final String PREFS_NAME="MyPrefsFile";
//	private Button goSettings;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        

        
        SharedPreferences settings=this.getSharedPreferences(PREFS_NAME, MODE_WORLD_READABLE);
        boolean haveWeShownPreferences=settings.getBoolean("HaveShownPrefs", false);
        if(!haveWeShownPreferences) {
       	Intent i=new Intent(FireballActivity.this, NewSetup.class);
    		startActivity(i);
        }

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
	
	
	home=(Button) findViewById(R.id.homeButton);
	home.setOnClickListener(new OnClickListener() {
		@Override
		  public void onClick(View v) {
	 
		   
		    Intent i = new Intent(FireballActivity.this, Main.class);
		    startActivity(i);
		  }
	});
    }
    

    //Creates the menu
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.mainmenu, menu);
		return true;
	}
	//Tells the menu what to do
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		// We have only one menu option
		
		case R.id.home:
			Intent i = new Intent(FireballActivity.this, Main.class);
			startActivity(i);
			break;
		case R.id.settingsMenu:
			i=new Intent(FireballActivity.this, Settings.class);
			startActivity(i);
			break;
		case R.id.newSetup:
			// Launch Preference activity
			i = new Intent(FireballActivity.this, NewSetup.class);
			startActivity(i);
			// Some feedback to the user
			break;
		case R.id.weather:
			// Launch Preference activity
			i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.met.ie/forecasts/sea-area.asp"));
			startActivity(i);
			// Some feedback to the user
			break;			

		}
		return true;
	}
    

}
