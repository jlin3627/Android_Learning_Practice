package com.jlin3627.overlayLayoutPractice;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public final class MenuActivity2 extends Dialog
{
    private Context _ctxParent;
    private	SelectLayoutListener	_objHandler;

    public interface SelectLayoutListener
    {
        void onLayoutSelected(String strLayoutName);
    }

    public MenuActivity2(Context parent)
    {
        super(parent);

        _ctxParent = parent;

        try
        {
            _objHandler	= (MenuActivity2.SelectLayoutListener) parent;
        }
        catch ( Throwable thrw )
        {
            thrw.printStackTrace();
            _objHandler = null;
        }
    }

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.side_menu_layout);

    }
}
