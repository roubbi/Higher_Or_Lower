package com.rubenbonan.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;



public class MainActivity extends AppCompatActivity {



          int randomNumber;



  public void checkGuess(View view){



     EditText guess = (EditText)findViewById(R.id.guessEditText);


                         if (guess.getText().length() == 0){


     Toast.makeText(getApplicationContext(), " Please enter a value!", Toast.LENGTH_LONG).show(); }



                         else {


     String guessEditString = guess.getText().toString();

     int guessEditInt = Integer.parseInt(guessEditString);



                          if (guessEditInt<randomNumber)

 {

     Toast.makeText(getApplicationContext(), " Try a Higher number", Toast.LENGTH_LONG).show();

 }

                          else if (guessEditInt>randomNumber)

{

     Toast.makeText(getApplicationContext(), " Try a Lower number", Toast.LENGTH_LONG).show();

}

                          else

{
     Toast.makeText(getApplicationContext(), "Bravo", Toast.LENGTH_LONG).show();

}


}

 }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



                          Random randomGenerator = new Random ();

                          randomNumber = randomGenerator.nextInt(11);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
