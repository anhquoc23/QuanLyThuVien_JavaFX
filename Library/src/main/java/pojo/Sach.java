/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo;

/**
 *
 * @author dell
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String theLoai;
    private int namXB;
    private String noiXB;
    private String viTri;
    public enum StateOfBook {
    KHA_DUNG, 
    CO_NGUOI_DAT, 
    DANG_CHO_MUON
    }
    private StateOfBook trangThai;

    public Sach(String maSach, String tenSach, String tacGia, String theLoai, int namXB, String noiXB, String viTri, StateOfBook trangThai) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.namXB = namXB;
        this.noiXB = noiXB;
        this.viTri = viTri;
        this.trangThai = trangThai;
    }

    public Sach() {
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public void setNoiXB(String noiXB) {
        this.noiXB = noiXB;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void setTrangThai(StateOfBook trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public int getNamXB() {
        return namXB;
    }

    public String getNoiXB() {
        return noiXB;
    }

    public String getViTri() {
        return viTri;
    }

    public StateOfBook getTrangThai() {
        return trangThai;
    }
    
    @Override
    public String toString() {
        return this.tenSach;
    }
}
