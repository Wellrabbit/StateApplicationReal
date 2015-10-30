package ctec.stateapplicationreal.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import ctec.stateapplicationreal.model.AndriodSaveState;

public class FrontPageActivity extends Activity
{

    private Button nextScreenButton;
    private EditText nameText;
    private EditText ageText;
    private CheckBox isTiredBox;

    private AndriodSaveState saveState;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        saveState = (AndriodSaveState) getApplication();

        nextScreenButton = (Button) findViewById(R.id.changeScreenButton);
        nameText = (EditText) findViewById(R.id.nameText);
        ageText = (EditText) findViewById(R.id.ageText);
        isTiredBox = (CheckBox) findViewById(R.id.isTiredCheck);
        setupListeners();

    }

    private void grabInput()
    {
        String name = nameText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());
        boolean isTired = isTiredBox.isChecked();

        saveState.setUserName(name);
        saveState.setAge(age);
        saveState.setIsTired(isTired);
    }

    private void setupListeners()
    {
        nextScreenButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View clickView)
            {
                grabInput();
                //open the new screens
                Intent changeScreen = new Intent(clickView.getContext(), BackPageActivity.class);
                startActivityForResult(changeScreen, 0);
            }
        });
    }


}


