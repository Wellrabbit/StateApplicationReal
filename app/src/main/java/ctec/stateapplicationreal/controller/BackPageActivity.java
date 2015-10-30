package ctec.stateapplicationreal.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ctec.stateapplicationreal.model.AndriodSaveState;

public class BackPageActivity extends Activity
{

    private TextView userText;
    private Button backButton;
    private AndriodSaveState saveState;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_page2);
        saveState = (AndriodSaveState) getApplication();
        backButton = (Button) findViewById(R.id.backButton);
        userText = (EditText) findViewById(R.id.userText);

        setupListeners();
    }

    private void loadContent()
    {
        userText.setText(saveState.getUserName() + " is " + saveState.getAge() + "years old" + "and tired" + saveState.getIsTired());
    }

    private void setupListeners()
    {
        backButton.setOnClickListener(new View.OnClickListeners()
        {
            backButton.setOnClickListener(new View.OnClickListener()

            {
                public void onClick (View.clickView)
                    {
                            Intent returnIntent = new Intent();
                setResult(RESULT_OK, returnIntent);
                finish();
                }
            }

            );
        }
    }


}
