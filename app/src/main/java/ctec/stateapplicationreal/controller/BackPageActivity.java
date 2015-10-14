package ctec.stateapplicationreal.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class BackPageActivity extends Activity {

    private TextView userText;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_page2);

        backButton = (Button) findViewById(R.id.backButton);
        userText = (EditText) findViewById(R.id.userText);

        setupListeners();



    }
private void setupListeners()
{
    backButton.setOnClickListener(new View.OnClickListeners()
    {
        backButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View clickView)
            {
                Intent returnIntent = new Intent();
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}


}
