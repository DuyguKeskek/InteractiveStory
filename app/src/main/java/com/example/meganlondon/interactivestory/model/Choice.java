package com.example.meganlondon.interactivestory.model;

/**
 * Created by MeganLondon on 27.12.2015.
 */
public class Choice {
    private int mNextPage;
    private String mText;

    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
