package deerlight.com.viewpagerlikegallerylibrary;

import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;

/**
 * Created by samuel_hsieh on 2016/12/4.
 */

public class Layouts {

    private int[] mlayouts;
    private LayoutInflater mInflater;

    public Layouts(LayoutInflater mInflater,int[] mlayouts) {
        this.mlayouts = mlayouts;
        this.mInflater = mInflater;
    }

    public ArrayList<View> LayoutList(){
        ArrayList<View> ArraylistLayouts = new ArrayList<>();
        for (int layoutView:mlayouts){
            View view = mInflater.inflate(layoutView, null);
            ArraylistLayouts.add(view);
        }
        return ArraylistLayouts;
    }

}
