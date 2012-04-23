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
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity 
{
	
	private Button getSettings;
	private Button newSetup;
	private Button weather;
	private Button results;
	
	public static final String PREFS_NAME="MyPrefsFile";
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        getSettings=(Button) findViewById(R.id.settings);
        getSettings.setOnClickListener(new OnClickListener() 
        {
        	  
        	@Override
        	public void onClick(View v) 
        	{
        		Intent i=new Intent(Main.this, FireballActivity.class);
        		startActivity(i);
        	}
        });
        newSetup=(Button) findViewById(R.id.setup);
        newSetup.setOnClickListener(new OnClickListener() 
        {
        	@Override
        	public void onClick(View v) 
        	{
        		Intent i=new Intent(Main.this, NewSetup.class);
        		startActivity(i);
        	}
        });
        weather=(Button) findViewById(R.id.weather);
        weather.setOnClickListener(new OnClickListener() 
        {
        	@Override
        	public void onClick(View v) 
        	{
        		Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.met.ie/forecasts/sea-area.asp"));
        		startActivity(i);
        	}
        });
        results=(Button) findViewById(R.id.results);
        results.setOnClickListener(new OnClickListener() 
        {
        	@Override
        	public void onClick(View v) 
        	{
        		Intent i = new Intent(Main.this, Results.class);
        		startActivity(i);
        	}
        });
	}	
}