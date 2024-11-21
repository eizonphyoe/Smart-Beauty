package com.smartbeauty.ucsm.smartbeauty.modle;

/**
 * Created by UCSM on 10/27/2016.
 */

public class ImageItem {
    private int id;
    private byte[] img1;
    private byte[] hairStyle;
    private  byte[] eyeBorrow;
    private byte[] eye;
    private byte[] nose;
    private byte[] lip;
    private byte[] blusher;
    private byte[] arm;
    private byte[] lumber;
    private byte[] nail;
    private byte[] tall;
    private byte[] belly;
    private byte[] thigh;
    private byte[] calf;
    private byte[] fashion;
    private byte[] hair;
    private byte[] bArm;
    private byte[] bBelly;
    private byte[] chest;
    private byte[] leg;
    private String hair_maintainable;
    private String facial;

    public ImageItem(){

    }

    public ImageItem(int id,byte[] img1){
        this.id=id;
        this.img1=img1;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getHairCoiffure() {
        return img1;
    }

    public void setHairCoiffure(byte[] hairCoiffure) {
        this.img1 =img1;
    }

    public byte[] getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(int id,byte[] hairStyle) {
        this.id=id;
        this.hairStyle = hairStyle;
    }

    public byte[] getEyeBorrow() {
        return eyeBorrow;
    }

    public void setEyeBorrow(int id,byte[] eyeBorrow) {
        this.id=id;
        this.eyeBorrow = eyeBorrow;
    }

    public byte[] getEye() {
        return eye;
    }

    public void setEye(int id,byte[] eye) {
        this.id=id;
        this.eye = eye;
    }

    public byte[] getNose() {
        return nose;
    }

    public void setNose(int id,byte[] nose) {
        this.nose = nose;
        this.id=id;
    }

    public byte[] getLip() {
        return lip;
    }

    public void setLip(int id,byte[] lip) {
        this.id=id;
        this.lip = lip;
    }

    public byte[] getBlusher() {
        return blusher;
    }

    public void setBlusher(int id,byte[] blusher) {
        this.id=id;
        this.blusher = blusher;
    }

    public byte[] getArm() {
        return arm;
    }

    public void setArm(int id,byte[] arm) {
        this.id=id;
        this.arm = arm;
    }

    public byte[] getLumber() {
        return lumber;
    }

    public void setLumber(int id,byte[] lumber) {
        this.lumber = lumber;
    }

    public byte[] getNail() {
        return nail;
    }

    public void setNail(int id,byte[] nail) {
        this.nail = nail;
    }

    public byte[] getTall() {
        return tall;
    }

    public void setTall(int id,byte[] tall) {
        this.tall = tall;
    }

    public byte[] getBelly() {
        return belly;
    }

    public void setBelly(byte[] belly) {
        this.belly = belly;
    }

    public byte[] getThigh() {
        return thigh;
    }

    public void setThigh(int id,byte[] thigh) {
        this.thigh = thigh;
    }

    public byte[] getCalf() {
        return calf;
    }

    public void setCalf(byte[] calf) {
        this.calf = calf;
    }

    public byte[] getFashion() {
        return fashion;
    }

    public void setFashion(byte[] fashion) {
        this.fashion = fashion;
    }

    public byte[] getHair() {
        return hair;
    }

    public void setHair(int id,byte[] hair) {
        this.id=id;
        this.hair = hair;
    }

    public byte[] getbArm() {
        return bArm;
    }

    public void setbArm(int id,byte[] bArm) {
        this.id=id;
        this.bArm = bArm;
    }

    public byte[] getbBelly() {
        return bBelly;
    }

    public void setbBelly(int id,byte[] bBelly) {
        this.id=id;
        this.bBelly = bBelly;
    }

    public byte[] getChest() {
        return chest;
    }

    public void setChest(int id,byte[] chest) {
        this.id=id;
        this.chest = chest;
    }

    public byte[] getLeg() {
        return leg;
    }

    public void setLeg(int id,byte[] leg) {
        this.id=id;
        this.leg = leg;
    }

    public void setHairMaintable(String hair_maintainable) {
        this.hair_maintainable = hair_maintainable;
    }

    public String getHairMaintable() {

        return hair_maintainable;
    }

    public ImageItem(int id, String hairMaintable){
       this.id=id;
       this.hair_maintainable=hairMaintable;

   }

    public String getFacial() {
        return facial;
    }

    public void setFacial(String facial) {
        this.facial = facial;
    }
}
