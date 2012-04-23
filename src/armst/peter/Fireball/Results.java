package armst.peter.Fireball;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class Results extends ListActivity 
{
	  private int mNoteNumber = 1;
	  private Cursor mNotesCursor;
	  private Button home;
	  private Button addResult;
	  
	  private static final int ACTIVITY_CREATE=0;
	  private static final int ACTIVITY_EDIT=1;
	  
	  public static final int INSERT_ID=Menu.FIRST;
	  public static final int DELETE_ID=Menu.FIRST+1;

	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.results_layout);
	        registerForContextMenu(getListView());
	     
	        home=(Button) findViewById(R.id.homeButton);
			home.setOnClickListener(new OnClickListener() 
			{
				@Override
				  public void onClick(View v) 
				{
				    Intent i = new Intent(Results.this, Main.class);
				    startActivity(i);
				  }
			});
			
			 addResult=(Button) findViewById(R.id.addResultButton);
				addResult.setOnClickListener(new OnClickListener() 
				{
					@Override
					public void onClick(View v) 
					{
				 
					   /* Add a new Result! */
					    
					}
				});
	    }
}
