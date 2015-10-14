package ctec.stateapplicationreal.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.view.View;
import android.content.Intent;

public class FrontPageActivity extends Activity {

    private Button nextScreenButton;
    private EditText nameText;
    private EditText ageText;
    private CheckBox isTiredBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);


        nextScreenButton = (Button) findViewById(R.id.changeScreenButton);
        nameText = (EditText) findViewById(R.id.nameText);
        ageText = (EditText) findViewById(R.id.ageText);
        isTiredBox = (CheckBox) findViewById(R.id.isTiredCheck);
        setupListeners();

    }

 private void setupListeners()
{
    nextScreenButton.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View clickView)
        {
            //open the new screens
            Intent changeScreen = new Intent(clickView.getContext(), BackPageActivity.class);
            startActivityForResult(changeScreen,0);
        }
    });
}


}


