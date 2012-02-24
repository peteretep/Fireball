package armst.peter.Fireball;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
     TextView tv1= new TextView(this);
     tv1.setText(mast);
     setContentView(tv1);
     TextView tv2= new TextView(this);
     tv2.setText(sail);
     setContentView(tv2);
  }
}
   
   
