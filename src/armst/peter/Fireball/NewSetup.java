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

public class NewSetup extends Activity
{
	private Spinner mastSpinner, sailSpinner;
	private Button submit;
	public static final String PREFS_NAME="MyPrefsFile";
//	private Button goSettings;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_setup);
        
        
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

   
    submit = (Button) findViewById(R.id.submit);
    
	submit.setOnClickListener(new OnClickListener() {
 
	  @Override
	  public void onClick(View v) {
 
		  SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_WORLD_READABLE);
		  SharedPreferences.Editor editor=settings.edit();
		  editor.putString("MAST", String.valueOf(mastSpinner.getSelectedItem()));
		  editor.putString("SAILS", String.valueOf(sailSpinner.getSelectedItem()));
		  editor.commit();
		  
		  
	    Toast.makeText(NewSetup.this,
		"Setup : " + 
                "\nMast : "+ String.valueOf(mastSpinner.getSelectedItem()) + 
                "\nSails : "+ String.valueOf(sailSpinner.getSelectedItem()),
			Toast.LENGTH_SHORT).show();
	    Intent i = new Intent(NewSetup.this, Main.class);
	    
        startActivity(i);
	  }
 
	});
     }
}