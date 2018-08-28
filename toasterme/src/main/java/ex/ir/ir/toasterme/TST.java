package ex.ir.ir.toasterme;

import android.content.Context;
import android.widget.Toast;

public class TST {
    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }
}
