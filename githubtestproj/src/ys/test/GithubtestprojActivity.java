package ys.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class GithubtestprojActivity extends Activity {
    /** Called when the activity is first created. */
	
	 Toast toast = Toast.makeText(this, "good", Toast.LENGTH_LONG);
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        toast.show();
        toast.show();
        toast.show();
        toast.show();
        toast.show();

    }
    
  
   
   
}
