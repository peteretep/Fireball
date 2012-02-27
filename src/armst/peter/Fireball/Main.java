package armst.peter.Fireball;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	
	private Button getSettings;
	private Button newSetup;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        getSettings=(Button) findViewById(R.id.settings);
        getSettings.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		Intent i=new Intent(Main.this, FireballActivity.class);
        		startActivity(i);
        	}
        });
        newSetup=(Button) findViewById(R.id.setup);
        newSetup.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		Intent i=new Intent(Main.this, NewSetup.class);
        		startActivity(i);
        	}
        });
	}
	
}