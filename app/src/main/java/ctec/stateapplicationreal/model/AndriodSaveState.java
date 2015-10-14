package ctec.stateapplicationreal.model;

import android.app.Application;

/**
 * Created by eort3611 on 10/14/15.
 */
public class AndriodSaveState extends Application
{
    private String userName;
    private int age;
    private boolean isTired;

    public AndriodSaveState()
    {
        userName = "default";
        age = -0;
        isTired = false;
    }
    public String getUserName()
    {
        return userName;
    }
    public int getAge()
    {
        return age;
    }
    public boolean getIsTired()
    {
        return isTired;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setIsTired (Boolean isTired)
    {
        this.isTired = isTired;
    }
}

