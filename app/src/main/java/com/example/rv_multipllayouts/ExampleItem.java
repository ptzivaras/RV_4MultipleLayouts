package com.example.rv_multipllayouts;

public class ExampleItem {

    public enum ItemType {
        ONE_ITEM, TWO_ITEM, THREE_ITEM, FOUR_ITEM;
    }

    private String mText1;
    private String mText2;
    private String mText3;
    private ItemType type;


    public ExampleItem( String text1, String text2, String text3, ItemType type) {
        mText1 = text1;
        mText2 = text2;
        mText3 = text3;
        this.type = type;
    }

    public ExampleItem( String text1, String text2, ItemType type) {
        mText1 = text1;
        mText2 = text2;
        this.type = type;
    }

    public ExampleItem( String text1,  ItemType type) {
        mText1 = text1;
        this.type = type;
    }

    public String getText1() {
        return mText1;
    }

    public String getText2() {
        return mText2;
    }

    public String getText3() {
        return mText3;
    }

    public ItemType getType() {
        return type;
    }
}
