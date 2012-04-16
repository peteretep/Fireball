package armst.peter.Fireball;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class HelloTabWidget extends TabActivity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabview);
		
		TabHost tabHost=getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		intent =new Intent().setClass(this, FireballActivity.class);
		spec=tabHost.newTabSpec("fireballactivity").setIndicator("FBA").setContent(intent);
		tabHost.addTab(spec);
	/*	
		intent =new Intent().setClass(this, Main.class);
		spec=tabHost.newTabSpec("main").setIndicator("Home").setContent(intent);
		tabHost.addTab(spec);
		
		intent =new Intent().setClass(this, Settings.class);
		spec=tabHost.newTabSpec("settings").setIndicator("Settings").setContent(intent);
		tabHost.addTab(spec);
		
		intent =new Intent().setClass(this, NewSetup.class);
		spec=tabHost.newTabSpec("settings").setIndicator("NewSetup").setContent(intent);
		tabHost.addTab(spec); */
		
		tabHost.setCurrentTab(1);
	}
}
