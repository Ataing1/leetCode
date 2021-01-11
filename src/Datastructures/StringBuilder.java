package Datastructures;

import java.util.Arrays;

public class StringBuilder {

    private  StringBuffer stringBuffer;
    private int nextEmptySlot = 0;

    public StringBuilder(String string) { stringBuffer = new StringBuffer(string); }

    public StringBuilder() { stringBuffer = new StringBuffer(); }

    public void append(String string) { stringBuffer.append(string); }

    public String toString(){ return stringBuffer.toString(); }



}
