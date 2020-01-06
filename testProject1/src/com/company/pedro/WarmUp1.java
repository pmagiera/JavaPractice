package com.company.pedro;

public class WarmUp1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        if ( weekday == false || vacation == true ){
            return true;
        }
        else {
            return false;
        }
    }

    public int diff21(int n) {
        //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
        if (n>21){
            return 2*(n-21);
        }
        else {
            return 21-n;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        // We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        // We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
        if (hour<0 || hour>23 ) { System.out.println("Invalid Hour");}
        if (talking==true && (hour<7 || hour>20)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative==true) {
            if ( a<0 && b<0 )
            {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if ( (a>0 && b<0 ) || (a<0 && b>0) )
            {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public String backAround(String str) {
        if (str != null ){
            String last=str.substring(str.length()-1,str.length());
            return last+str+last;
        }
        else{
            return "Empty string provided";
        }
    }

    public boolean makes10(int a, int b) {
        if( (a==10 || b==10) || a+b==10 )
        {
            return true;
        }
        else {
            return false;
        }
    }

    public String notString(String str) {
        String s1="not";
        if (str != null && str.length()>=s1.length() ){
            if ( str.substring(0,s1.length()).equals(s1) ){
                return str;
            }
            else{
                return s1+" "+str;
            }
        }
        else if ( str != null && str.length()<s1.length() ){
            return s1+" "+str;
        }
        else{
            return "Empty string provided.";
        }
    }

    public String everyNth(String str, int n) {
        if (str != null ){
            String s1=str.substring(0,1);
            int max=str.length()/n;
            for ( int i=1; i<=max; i++){
                if (i*n+1 <=str.length()){
                    s1=s1+str.substring(i*n,i*n+1);
                }
            }

            return s1;
        }
        else
        {
            return "Empty string provided";
        }
    }

    public String front22(String str) {
        if ( str.length()<2 ) {
            return str+str+str;
        }
        else {
            return str.substring(0,2)+str+str.substring(0,2);
        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ( aSmile!=bSmile ) {
            return false;
        }
        return true;
    }

    public String front3(String str) {
        if ( str.length()<3 ) {
            return str+str+str;
        }
        else {
            String fr=str.substring(0,3);
            return fr+fr+fr;
        }
    }
}
