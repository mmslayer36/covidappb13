package com.example.covidappb1.ui.chart;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JavaScriptInterface {
    Context mContext;


    /** Instantiate the interface and set the context */
    JavaScriptInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
    //get dates
    @JavascriptInterface
    public String updateDataDate(String datadate) {
        return "['4/10/20','4/11/20','4/12/20','4/13/20','4/14/20','4/15/20','4/16/20','4/17/20','4/18/20','4/19/20','4/20/20','4/21/20','4/22/20','4/23/20','4/24/20','4/25/20','4/26/20','4/27/20','4/28/20','4/29/20','4/30/20','5/1/20','5/2/20','5/3/20','5/4/20','5/5/20','5/6/20','5/7/20','5/8/20','5/9/20']";
    }
    //get data
    @JavascriptInterface
    public String updateDataNum(String datanum) {
        return "[1694667,1775429,1847796,1919174,1992903,2076502,2161885,2249004,2330764,2406786,2480741,2556720,2637439,2722857,2824741,2915365,2989175,3055800,3132312,3213960,3299603,3394153,3477488,3559748,3639330,3720577,3815902,3912163,4009291,4098288]";
    }

}