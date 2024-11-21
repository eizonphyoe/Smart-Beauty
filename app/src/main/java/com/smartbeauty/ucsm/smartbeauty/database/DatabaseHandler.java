package com.smartbeauty.ucsm.smartbeauty.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

import com.smartbeauty.ucsm.smartbeauty.modle.ImageItem;

import java.util.ArrayList;
import java.util.List;


public class DatabaseHandler extends SQLiteOpenHelper{
    public static final String DBName="smartandbeauty.sqlite";
    public static final String DBLocatoin= "/data/data/com.smartbeauty.ucsm.smartbeauty/databases/";
    private Context mContext;
    private SQLiteDatabase mDatabase;



   public DatabaseHandler(Context context){
        super(context,DBName,null,1);
        this.mContext=context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void openDatabase(){
        String dbPath=mContext.getDatabasePath(DBName).getPath();
        Log.i("DB Path: ",dbPath);
        if(mDatabase != null && mDatabase.isOpen()){
            return;
        }
        mDatabase=SQLiteDatabase.openDatabase(dbPath,null,SQLiteDatabase.OPEN_READWRITE);
    }

    public void closeDatabase(){
        if(mDatabase!=null){
            mDatabase.close();
        }
    }


    public List<ImageItem> getHairCoiffure(){
        ImageItem hairCoiffure=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            hairCoiffure =new ImageItem(cursor.getInt(0),cursor.getBlob(1));
            Log.i("Database Arrive====>", String.valueOf(hairCoiffure));
            hairCoiffureList.add(hairCoiffure);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getHairStyle(){
        ImageItem hairStyle=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            hairStyle =new ImageItem();
            hairStyle.setHairStyle(cursor.getInt(0),cursor.getBlob(2));
            hairCoiffureList.add(hairStyle);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getEyeborrow(){
        ImageItem eyebrow=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            eyebrow =new ImageItem();
            eyebrow.setEyeBorrow(cursor.getInt(0),cursor.getBlob(3));
            hairCoiffureList.add(eyebrow);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getEye(){
        ImageItem eye=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            eye =new ImageItem();
            eye.setEye(cursor.getInt(0),cursor.getBlob(4));
            hairCoiffureList.add(eye);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getNose(){
        ImageItem nose=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            nose =new ImageItem();
           nose.setNose(cursor.getInt(0),cursor.getBlob(5));
            hairCoiffureList.add(nose);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getLip(){
        ImageItem lip=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            lip =new ImageItem();
            lip.setLip(cursor.getInt(0),cursor.getBlob(6));
            hairCoiffureList.add(lip);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }



    public List<ImageItem> getBlusher(){
        ImageItem blusher=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            blusher=new ImageItem();
            blusher.setBlusher(cursor.getInt(0),cursor.getBlob(7));
            hairCoiffureList.add(blusher);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }
    public List<ImageItem> getArm(){
        ImageItem arm=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            arm =new ImageItem();
            arm.setArm(cursor.getInt(0),cursor.getBlob(8));
            hairCoiffureList.add(arm);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }


    public List<ImageItem> getLumber(){
        ImageItem lumber=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            lumber =new ImageItem();
            lumber.setLumber(cursor.getInt(0),cursor.getBlob(9));
            hairCoiffureList.add(lumber);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getNail(){
        ImageItem nail=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            nail =new ImageItem();
            nail.setNail(cursor.getInt(0),cursor.getBlob(10));
            hairCoiffureList.add(nail);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getTall(){
        ImageItem tall=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            tall =new ImageItem();
            tall.setTall(cursor.getInt(0),cursor.getBlob(11));
            hairCoiffureList.add(tall);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getBelly(){
        ImageItem belly=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            belly=new ImageItem();
            belly.setBelly(cursor.getBlob(12));
            hairCoiffureList.add(belly);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getThigh(){
        ImageItem thigh=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            thigh =new ImageItem();
            thigh.setThigh(cursor.getInt(0),cursor.getBlob(13));
            hairCoiffureList.add(thigh);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getCalf(){
        ImageItem calf=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            calf =new ImageItem();
            calf.setCalf(cursor.getBlob(14));
            hairCoiffureList.add(calf);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getFashion(){
        ImageItem fashion=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girl",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            fashion =new ImageItem();
            fashion.setFashion(cursor.getBlob(15));
            hairCoiffureList.add(fashion);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getHair(){
        ImageItem hair=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from boy",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            hair =new ImageItem();
            hair.setHair(cursor.getInt(0),cursor.getBlob(1));
            hairCoiffureList.add(hair);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getBoyArm(){
        ImageItem arm=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from boy",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            arm =new ImageItem();
            arm.setbArm(cursor.getInt(0),cursor.getBlob(2));
            hairCoiffureList.add(arm);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }

    public List<ImageItem> getBoyBelly(){
        ImageItem bBelly=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from boy",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            bBelly =new ImageItem();
            bBelly.setbBelly(cursor.getInt(0),cursor.getBlob(3));
            hairCoiffureList.add(bBelly);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }
    public List<ImageItem> getChest(){
        ImageItem chest=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from boy",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            chest=new ImageItem();
            chest.setChest(cursor.getInt(0),cursor.getBlob(4));
            hairCoiffureList.add(chest);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }
    public List<ImageItem> getLeg(){
        ImageItem leg=null;
        List<ImageItem> hairCoiffureList=new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from boy",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            leg =new ImageItem();
            leg.setLeg(cursor.getInt(0),cursor.getBlob(5));
            hairCoiffureList.add(leg);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return hairCoiffureList;
    }
    public ImageItem getHairMaintainable(){
        ImageItem hairMaintainable=null;
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girls",null);
        if(cursor!=null)
            cursor.moveToFirst();
        hairMaintainable=new ImageItem();
        hairMaintainable.setHairMaintable(cursor.getString(1));
        cursor.close();
        closeDatabase();
        return hairMaintainable;
    }

    public ImageItem getFacial(){
        ImageItem facial=null;
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * from girls",null);
        if(cursor!=null)
            cursor.moveToFirst();
         facial=new ImageItem();
        facial.setFacial(cursor.getString(2));
        cursor.close();
        closeDatabase();
        return facial;

    }
}
