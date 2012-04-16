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

public class Results extends ListActivity {
	  private int mNoteNumber = 1;
	  private NotesDbAdapter mDbHelper;
	  private Cursor mNotesCursor;
	  private Button home;
	  private Button addResult;
	  
	  private static final int ACTIVITY_CREATE=0;
	  private static final int ACTIVITY_EDIT=1;
	  
	  public static final int INSERT_ID=Menu.FIRST;
	  public static final int DELETE_ID=Menu.FIRST+1;

	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.results_layout);
	        mDbHelper=new NotesDbAdapter(this);
	        mDbHelper.open();
	    //    fillData();
	        
	        registerForContextMenu(getListView());
	        
	        
	        
	        home=(Button) findViewById(R.id.homeButton);
			home.setOnClickListener(new OnClickListener() {
				@Override
				  public void onClick(View v) {
			 
				   
				    Intent i = new Intent(Results.this, Main.class);
				    startActivity(i);
				  }
			});
			
			 addResult=(Button) findViewById(R.id.addResultButton);
				addResult.setOnClickListener(new OnClickListener() {
					@Override
					  public void onClick(View v) {
				 
					   /* Add a new Result! */
					    
					  }
				});
	    }
	    
		

	/*    private void createNote() {
	    	Intent i =new Intent(this, NoteEdit.class);
	    	startActivityForResult(i, ACTIVITY_CREATE);	String noteName="Note " + mNoteNumber++;
	    	mDbHelper.createNote(noteName, "");
	    	fillData();
	    }
	    
	    @Override
	    protected void onListItemClick(ListView l, View v, int position, long id) {
	    	super.onListItemClick(l, v, position, id);
	    	Cursor c=mNotesCursor;
	    	c.moveToPosition(position);
	    	Intent i=new Intent(this, NoteEdit.class);
	    	i.putExtra(NotesDbAdapter.KEY_ROWID, id);
	    	i.putExtra(NotesDbAdapter.KEY_TITLE. c.getString(c.getColumnIndexOrThrow(NotesDbAdapter.KEY_TITLE)));
	    	i.putExtra(NotesDbAdapter.KEY_BODY, c.getString(c.getColumnIndexOrThrow(NotesDbAdapter.KEY_BODY)));
	    	startActivityForResult(i, ACTIVITY_EDIT);
	    }
	    
	    @Override
	    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
	    	super.onActivityResult(requestCode, resultCode, intent);
	    	Bundle extras=intent.getExtras();
	    	
	    	switch(requestCode) {
	    	case ACTIVITY_CREATE:
	    		String title=extras.getString(NotesDbAdapter.KEY_TITLE);
	    		String body=extras.getString(NotesDbAdapter.KEY_BODY);
	    		mDbHelper.createNote(title, body);
	    		fillData();
	    		break;
	    	case ACTIVITY_EDIT:
	    		Long mRowId=extras.getLong(NotesDbAdapter.KEY_ROWID);
	    		if (mRowID != null) {
	    			String editTitle=extras.getString(NotesDbAdapter.KEY_TITLE);
	    			String editBody=extras.getString(NotesDbAdapter.KEY_BODY);
	    			mDbHelper.updateNode(mRowId, editTitle, editBody)
	    		}
	    		fillData();
	    		break;
	    	}
	    }

	    public void fillData() {
	    	// get notes from DB and create the item list
	    	Cursor c = mDbHelper.fetchAllNotes();
	    	startManagingCursor(c);
	    	
	    	String[] from=new String[] {NotesDbAdapter.KEY_TITLE };
	    	int[] to = new int[] {R.id.text1 };
	    	
	    	// Create array adapter and set it to display using our row
	    	SimpleCursorAdapter notes = new SimpleCursorAdapter(this, R.layout.results_row, c, from, to);
	    	setListAdapter(notes);
	    }
	    
	    
	    
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	       
	        boolean result= super.onCreateOptionsMenu(menu);
	        menu.add(0, INSERT_ID, 0,R.string.menu_insert);
	        return result;
	    }

	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	    	switch (item.getItemId()) {
	    	case INSERT_ID:
	    		createNote();
	    		return true;
	    	}
	    	
	        return super.onOptionsItemSelected(item);
	    }
	    
	    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
	    	super.onCreateContextMenu(menu, v, menuInfo);
	    	menu.add(0, DELETE_ID, 0, R.string.menu_delete);
	    }
	    
	    public boolean onContextItemSelected(MenuItem item) {
	    	switch(item.getItemId()) {
	    	case DELETE_ID:
	    		AdapterContextMenuInfo info=(AdapterContextMenuInfo) item.getMenuInfo();
	    		mDbHelper.deleteNote(info.id);
	    		fillData();
	    		return true;
	    	}
	    	return super.onContextItemSelected(item);
	    } */
}
