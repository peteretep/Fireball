package armst.peter.Fireball;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Settings extends Activity
{
	public static final String PREFS_NAME="MyPrefsFile";

   public void onCreate(Bundle savedInstanceState)
   {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.settings_layout);
     Bundle bundle=getIntent().getExtras();
     
     String rake="o";
     String fairlead;
     String centerboard; 
     
     String weather=bundle.getString("WEATHER");
     SharedPreferences settings=this.getSharedPreferences(PREFS_NAME, MODE_WORLD_READABLE);
     String mast=settings.getString("MAST", "?mast");
     String sail=settings.getString("SAILS", "?sails");
     
     
     if(mast.equals("Selden Cumulus") ) {
    	 if(sail.equals("North")) {
    		 if(weather.equals("Light")) {
    			 rake="22'8";
    			 
    		 }
    		 else if (weather.equals("Medium")) {
    			 rake="22'6";
    		 }
    		 else if (weather.equals("Heavy")) {
    			 rake ="22'2";
    		 }	
    	 }
    	 if(sail.equals("PinBax")) {
    		 if(weather.equals("Light")) {
    			rake="Straight";
    		 }
    		 else if (weather.equals("Medium")) {
    			 rake="Medium";
    		 }
    		 else if (weather.equals("Heavy")) {
    			 rake="Straight";
    		 }	
    	 }
    	 if(sail.equals("MacNamara")) {
    		 if(weather.equals("Light")) {
    			rake="Straight";
    		 }
    		 else if (weather.equals("Medium")) {
    			 rake="Medium";
    		 }
    		 else if (weather.equals("Heavy")) {
    			 rake="Straight";
    		 }	 
    	 }
    	 
    		 
     }
     
     else if(mast.equals("Selden Alto")) {
    	 if(sail.equals("North")) {
    		 if(weather.equals("Light")) {
    			 rake="22'8";
    		 }
    		 else if (weather.equals("Medium")) {
    			 rake="22'6";
    		 }
    		 else if (weather.equals("Heavy")) {
    			 rake="22'2";
    		 }	
    	 }
    	 if(sail.equals("PinBax")) {
    		 if(weather.equals("Light")) {
    			 rake="Straight";
    		 }
    		 else if (weather.equals("Medium")) {
    			 rake="Straight";
    		 }
    		 else if (weather.equals("Heavy")) {
    			 rake="Straight";
    		 }	
    	 }
    	 if(sail.equals("MacNamara")) {
    		 if(weather.equals("Light")) {
    			 rake="Straight";
    		 }
    		 else if (weather.equals("Medium")) {
    			 rake="Straight";
    		 }
    		 else if (weather.equals("Heavy")) {
    			 rake="Straight";
    		 }	 
    	 }
    	 
    		 
     }
     
     else if(mast.equals("SuperSpars M7")) {
    	 if(sail.equals("North")) {
    		 	rake="22'8";
      	      
    		 }
    		 else if (weather.equals("Medium")) {
    			 rake="22'6";
    		 }
    		 else if (weather.equals("Heavy")) {
    			 rake="22'2";
    		 }	
    	 }
    	 if(sail.equals("PinBax")) {
    		 if(weather.equals("Light")) {
    			 rake="Straight";
    		 }
    		 else if (weather.equals("Medium")) {
    			 rake="Straight";
    		 }
    		 else if (weather.equals("Heavy")) {
    			 rake="Straight";
    		 }	
    	 }
    	 if(sail.equals("MacNamara")) {
    		 if(weather.equals("Light")) {
    			 rake="Straight";
    		 }
    		 else if (weather.equals("Medium")) {
    			 rake="Straight";
    		 }
    		 else if (weather.equals("Heavy")) {
    			 rake="Straight";
    		 }	 
    	 }
    	 
    		 
     
     TextView rakeView=new TextView(this);
     rakeView.setText("Set your Mast Rake to: " +rake);
     setContentView(rakeView);
  }
}
   
   
