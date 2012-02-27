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

public class NewSetup extends Activity
{
	private Spinner mastSpinner, sailSpinner;
	private Button submit;
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
 
	    Toast.makeText(NewSetup.this,
		"Setup : " + 
                "\nMast : "+ String.valueOf(mastSpinner.getSelectedItem()) + 
                "\nSails : "+ String.valueOf(sailSpinner.getSelectedItem()),
			Toast.LENGTH_SHORT).show();
	  Intent i = new Intent(NewSetup.this, FireballActivity.class);
	    Bundle bundle = new Bundle();
	    bundle.putString("MAST", String.valueOf(mastSpinner.getSelectedItem()));
	    bundle.putString("SAILS", String.valueOf(sailSpinner.getSelectedItem()));
	    i.putExtras(bundle);
        startActivity(i);
	  }
 
	});
     }
}