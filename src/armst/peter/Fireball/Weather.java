package armst.peter.Fireball;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Weather extends Activity
{
   public void onCreate(Bundle savedInstanceState)
   {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.weather_layout);
     Bundle bundle=getIntent().getExtras();
     
     String mast=bundle.getString("MAST");
     String sail=bundle.getString("SAILS");
     String weather=bundle.getString("WEATHER");
     
     if(mast.equals("Selden Cumulus") ) {
    	 if(sail.equals("North")) {
    		 if(weather.equals("Light")) {
    			 TextView tv = new TextView(this);
      	       tv.setText("Cumulus, North, Light");
      	       setContentView(tv);
    		 }
    		 else if (weather.equals("Medium")) {
    			 
    		 }
    		 else if (weather.equals("Heavy")) {
    		 
    		 }	
    	 }
    	 if(sail.equals("PinBax")) {
    		 if(weather.equals("Light")) {
    			 TextView tv = new TextView(this);
      	       tv.setText("Cumulus, PinBax, Light");
      	       setContentView(tv);
    		 }
    		 else if (weather.equals("Medium")) {
    			 
    		 }
    		 else if (weather.equals("Heavy")) {
    		 
    		 }	
    	 }
    	 if(sail.equals("MacNamara")) {
    		 if(weather.equals("Light")) {
    			 TextView tv = new TextView(this);
      	       tv.setText("Cumulus, Mc, Light");
      	       setContentView(tv);
    		 }
    		 else if (weather.equals("Medium")) {
    			 
    		 }
    		 else if (weather.equals("Heavy")) {
    		 
    		 }	 
    	 }
    	 
    		 
     }
     
     else if(mast.equals("Selden Alto")) {
    	 if(sail.equals("North")) {
    		 if(weather.equals("Light")) {
    			 TextView tv = new TextView(this);
      	       tv.setText("Alto, North, Light");
      	       setContentView(tv);
    		 }
    		 else if (weather.equals("Medium")) {
    			 
    		 }
    		 else if (weather.equals("Heavy")) {
    		 
    		 }	
    	 }
    	 if(sail.equals("PinBax")) {
    		 if(weather.equals("Light")) {
    			 TextView tv = new TextView(this);
      	       tv.setText("Alto, PinBax, Light");
      	       setContentView(tv);
    		 }
    		 else if (weather.equals("Medium")) {
    			 
    		 }
    		 else if (weather.equals("Heavy")) {
    		 
    		 }	
    	 }
    	 if(sail.equals("MacNamara")) {
    		 if(weather.equals("Light")) {
    			 TextView tv = new TextView(this);
      	       tv.setText("Alto, Mc, Light");
      	       setContentView(tv);
    		 }
    		 else if (weather.equals("Medium")) {
    			 
    		 }
    		 else if (weather.equals("Heavy")) {
    		 
    		 }	 
    	 }
    	 
    		 
     }
     
     else if(mast.equals("SuperSpars M7")) {
    	 if(sail.equals("North")) {
    		 if(weather.equals("Light")) {
    			 TextView tv = new TextView(this);
      	       tv.setText("M7, North, Light");
      	       setContentView(tv);
    		 }
    		 else if (weather.equals("Medium")) {
    			 
    		 }
    		 else if (weather.equals("Heavy")) {
    		 
    		 }	
    	 }
    	 if(sail.equals("PinBax")) {
    		 if(weather.equals("Light")) {
    			 TextView tv = new TextView(this);
      	       tv.setText("M7, PinBax, Light");
      	       setContentView(tv);
    		 }
    		 else if (weather.equals("Medium")) {
    			 
    		 }
    		 else if (weather.equals("Heavy")) {
    		 
    		 }	
    	 }
    	 if(sail.equals("MacNamara")) {
    		 if(weather.equals("Light")) {
    			 TextView tv = new TextView(this);
      	       tv.setText("M7, Mc, Light");
      	       setContentView(tv);
    		 }
    		 else if (weather.equals("Medium")) {
    			 
    		 }
    		 else if (weather.equals("Heavy")) {
    		 
    		 }	 
    	 }
    	 
    		 
     }
     
  }
}
   
   
