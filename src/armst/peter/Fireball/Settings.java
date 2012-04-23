package armst.peter.Fireball;
import android.app.Activity;
import android.widget.Button;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Settings extends Activity
{
	private Button home;
	public static final String PREFS_NAME="MyPrefsFile";
	
   public void onCreate(Bundle savedInstanceState)
   {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.settings_layout);
     Bundle bundle=getIntent().getExtras();
     String rake="";
     String fairleadFromCentre = "";
     String centerboard = ""; 
     String tension="";
     
     home=(Button) findViewById(R.id.homeButton);
	 home.setOnClickListener(new OnClickListener() 
	 {
 		@Override
 		public void onClick(View v) 
 		{
 		    Intent i = new Intent(Settings.this, Main.class);
 		    startActivity(i);
 		  }
 	});
     
     
     String weather=bundle.getString("WEATHER");
     SharedPreferences settings=this.getSharedPreferences(PREFS_NAME, MODE_WORLD_READABLE);
     boolean haveWeShownPreferences=settings.getBoolean("HaveShownPrefs", false);
     if(!haveWeShownPreferences) 
     {
    	Intent i=new Intent(Settings.this, NewSetup.class);
 		startActivity(i);
     }
     
     String mast=settings.getString("MAST", "?mast");
     String sail=settings.getString("SAILS", "?sails");
     
     
     if(mast.equals("Selden Cumulus") ) 
     {
    	 if(sail.equals("North")) 
    	 {
    		 if(weather.equals("1-5 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension = "390lbs";
    			 fairleadFromCentre="250mm";
    			 
    		 }
    		 if(weather.equals("6-10 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension="400lbs";
    			 fairleadFromCentre="255mm";
    		 }
    		 else if (weather.equals("11-15 kts")) 
    		 {
    			 rake="22'6'' or 6860mm";
    			 tension="400lbs";
    			 fairleadFromCentre="270mm";
    		 }
    		 else if (weather.equals("16+ kts")) 
    		 {
    			 rake="22'4'' or 6810mm";
    			 tension="330lbs";
    			 fairleadFromCentre="285mm";
    		 }	
    	 }
    	 if(sail.equals("PinBax")) 
    	 {
    		 if(weather.equals("1-5 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension = "390lbs";
    			 fairleadFromCentre="250mm";
    			 
    		 }
    		 if(weather.equals("6-10 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension="400lbs";
    			 fairleadFromCentre="255mm";
    		 }
    		 else if (weather.equals("11-15 kts")) 
    		 {
    			 rake="22'6'' or 6860mm";
    			 tension="400lbs";
    			 fairleadFromCentre="270mm";
    		 }
    		 else if (weather.equals("16+ kts")) 
    		 {
    			 rake="22'4'' or 6810mm";
    			 tension="330lbs";
    			 fairleadFromCentre="285mm";
    		 }	
    	 }
    	 if(sail.equals("MacNamara")) 
    	 {
    		 if(weather.equals("1-5 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension = "390lbs";
    			 fairleadFromCentre="250mm";
    			 
    		 }
    		 if(weather.equals("6-10 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension="400lbs";
    			 fairleadFromCentre="255mm";
    		 }
    		 else if (weather.equals("11-15 kts")) 
    		 {
    			 rake="22'6'' or 6860mm";
    			 tension="400lbs";
    			 fairleadFromCentre="270mm";
    		 }
    		 else if (weather.equals("16+ kts")) 
    		 {
    			 rake="22'4'' or 6810mm";
    			 tension="330lbs";
    			 fairleadFromCentre="285mm";
    		 }	 
    	 }
     }
     
     else if(mast.equals("Selden Alto")) 
     {
    	 if(sail.equals("North")) 
    	 {
    		 if(weather.equals("1-5 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension = "390lbs";
    			 fairleadFromCentre="250mm";
    		 }
    		 if(weather.equals("6-10 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension="400lbs";
    			 fairleadFromCentre="255mm";
    		 }
    		 else if (weather.equals("11-15 kts")) 
    		 {
    			 rake="22'6'' or 6860mm";
    			 tension="400lbs";
    			 fairleadFromCentre="270mm";
    		 }
    		 else if (weather.equals("16+ kts")) 
    		 {
    			 rake="22'4'' or 6810mm";
    			 tension="330lbs";
    			 fairleadFromCentre="285mm";
    		 }
    	 }
    	 if(sail.equals("PinBax")) 
    	 {
    		 if(weather.equals("1-5 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension = "390lbs";
    			 fairleadFromCentre="250mm";
    			 
    		 }
    		 if(weather.equals("6-10 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension="400lbs";
    			 fairleadFromCentre="255mm";
    		 }
    		 else if (weather.equals("11-15 kts")) 
    		 {
    			 rake="22'6'' or 6860mm";
    			 tension="400lbs";
    			 fairleadFromCentre="270mm";
    		 }
    		 else if (weather.equals("16+ kts")) 
    		 {
    			 rake="22'4'' or 6810mm";
    			 tension="330lbs";
    			 fairleadFromCentre="285mm";
    		 }
    	 }
    	 if(sail.equals("MacNamara")) 
    	 {
    		 if(weather.equals("1-5 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension = "390lbs";
    			 fairleadFromCentre="250mm";
    		 }
    		 if(weather.equals("6-10 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension="400lbs";
    			 fairleadFromCentre="255mm";
    		 }
    		 else if (weather.equals("11-15 kts")) 
    		 {
    			 rake="22'6'' or 6860mm";
    			 tension="400lbs";
    			 fairleadFromCentre="270mm";
    		 }
    		 else if (weather.equals("16+ kts")) 
    		 {
    			 rake="22'4'' or 6810mm";
    			 tension="330lbs";
    			 fairleadFromCentre="285mm";
    		 } 
    	 } 
     }
     
     else if(mast.equals("SuperSpars M7")) 
     {
    	 if(sail.equals("North")) {
    		 if(weather.equals("1-5 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension = "390lbs";
    			 fairleadFromCentre="250mm";
    			 
    		 }
    		 if(weather.equals("6-10 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension="400lbs";
    			 fairleadFromCentre="255mm";
    		 }
    		 else if (weather.equals("11-15 kts")) 
    		 {
    			 rake="22'6'' or 6860mm";
    			 tension="400lbs";
    			 fairleadFromCentre="270mm";
    		 }
    		 else if (weather.equals("16+ kts")) 
    		 {
    			 rake="22'4'' or 6810mm";
    			 tension="330lbs";
    			 fairleadFromCentre="285mm";
    		 }	
    	 }
    	 if(sail.equals("PinBax")) 
    	 {
    		 if(weather.equals("1-5 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension = "390lbs";
    			 fairleadFromCentre="250mm";
    			 
    		 }
    		 if(weather.equals("6-10 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension="400lbs";
    			 fairleadFromCentre="255mm";
    		 }
    		 else if (weather.equals("11-15 kts")) 
    		 {
    			 rake="22'6'' or 6860mm";
    			 tension="400lbs";
    			 fairleadFromCentre="270mm";
    		 }
    		 else if (weather.equals("16+ kts")) 
    		 {
    			 rake="22'4'' or 6810mm";
    			 tension="330lbs";
    			 fairleadFromCentre="285mm";
    		 }
    	 }
    	 if(sail.equals("MacNamara")) 
    	 { 
    		 if(weather.equals("1-5 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension = "390lbs";
    			 fairleadFromCentre="250mm";
    			 
    		 }
    		 if(weather.equals("6-10 kts")) 
    		 {
    			 rake="22'8'' or 6910mm";
    			 tension="400lbs";
    			 fairleadFromCentre="255mm";
    		 }
    		 else if (weather.equals("11-15 kts")) 
    		 {
    			 rake="22'6'' or 6860mm";
    			 tension="400lbs";
    			 fairleadFromCentre="270mm";
    		 }
    		 else if (weather.equals("16+ kts")) 
    		 {
    			 rake="22'4'' or 6810mm";
    			 tension="330lbs";
    			 fairleadFromCentre="285mm";
    		 } 
    	 }
     }
    	 
    	 TextView rakeValue = (TextView) findViewById(R.id.rakevalue); 
    	 rakeValue.setText(rake);	
    	 TextView tensionValue = (TextView) findViewById(R.id.tensionvalue); 
    	 tensionValue.setText(tension);		
    	 TextView fairleadValue = (TextView) findViewById(R.id.fairleadvalue); 
    	 fairleadValue.setText(fairleadFromCentre);	
    
    
  }
}
   
   
