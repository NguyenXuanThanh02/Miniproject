package baitapquanlysach;
 
import java.text.SimpleDateFormat;
import java.util.Scanner;
 
public class Sach {
    private String maSach, nhaXuatBan,tensach,ISBN;
    private double donGia;
    private int soLuong;
    Scanner scanner = new Scanner(System.in);
     
    public Sach() {
        super();
    }
 
    public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong) {
        super();
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.tensach=tensach;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
 
    public String getMaSach() {
        return maSach;
    }
 
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
 
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
 
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
 
    public String gettensacsh(){
        return tensach;
    }
    public void settensach(String tensach){
        this.tensach = tensach;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String tensach){
        this.ISBN = ISBN;
    }
    public double getDonGia() {
        return donGia;
    }
 
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
 
    public int getSoLuong() {
        return soLuong;
    }
 
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
 
    public void nhapSach() {
        System.out.print("Nhap ma sach: \n");
        maSach = scanner.nextLine();
        System.out.print("Ten sach: \n");
        tensach =scanner.nextLine();
        System.out.print("Nhap ten nha xuet ban: \n");
        nhaXuatBan = scanner.nextLine();
        System.out.print("Ma so tieu chuan cho sach[ISBN]: \n");
        ISBN = scanner.nextLine();
        System.out.print("Nhap đon gia: \n");
        donGia = scanner.nextDouble();
        System.out.print("Nhap so luong: \n");
        soLuong = scanner.nextInt();
    }
     
    @Override
    public String toString() {
        return "Ma sach: " + this.maSach +", Ten sach: "+ this.tensach + ", ten nha xuat ban: " + this.nhaXuatBan +", ISBN: " + this.ISBN + ", đon gia: " + 
                this.donGia + ", so luong: " + this.soLuong;
    }
}
