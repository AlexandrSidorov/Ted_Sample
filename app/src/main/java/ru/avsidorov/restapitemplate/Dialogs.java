package ru.avsidorov.restapitemplate;

import android.content.Context;

import com.afollestad.materialdialogs.MaterialDialog;
import com.octo.android.robospice.persistence.exception.SpiceException;

/**
 * Created by Alexandr Sidorov on 29.04.2015.
 */
public class Dialogs {


    public static void showErrors(Context context, SpiceException e) {
        new MaterialDialog.Builder(context)
                .autoDismiss(false)
                .title(R.string.error_title)
                .content(e.getLocalizedMessage())
                .positiveText(R.string.ok)
                .show();

    }
    public static MaterialDialog waiting(final Context context){
        final MaterialDialog materialDialog = new MaterialDialog.Builder(context)
                .autoDismiss(false)
                .title(R.string.error_title)
                .progress(true,0)
                .negativeText(R.string.cancel)
                .callback(new MaterialDialog.ButtonCallback() {
                    @Override
                    public void onNegative(MaterialDialog dialog) {
                        super.onNegative(dialog);
                        dialog.dismiss();

                    }
                })
                .show();
        return materialDialog;
    }


}
