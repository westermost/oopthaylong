class HocSinh {
    private int maSo;
    private String hoTen;
    private float diemTrungBinh;

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void input() {
        System.out.println("Nhap ma so: ");
        this.maSo = Integer.parseInt(System.console().readLine());
        System.out.println("Nhap ho ten: ");
        this.hoTen = System.console().readLine();
        System.out.println("Nhap diem trung binh: ");
        this.diemTrungBinh = Float.parseFloat(System.console().readLine());
    }

    public void output() {
        System.out.println("Ma so: " + this.maSo);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Diem trung binh: " + this.diemTrungBinh);
        System.out.println("Xep loai: " + this.rank());
        System.out.println("----------------------------------");
    }

    public String rank() {
        if (this.diemTrungBinh >= 8) {
            return "Gioi";
        } else if (this.diemTrungBinh >= 6.5) {
            return "Kha";
        } else if (this.diemTrungBinh >= 5) {
            return "Trung binh";
        } else if (this.diemTrungBinh >= 3.5) {
            return "Yeu";
        } else {
            return "Kem";
        }
    }
}

class Bai1 {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        hs.input();
        hs.output();

        System.out.println("Nhap ho ten moi: ");
        hs.setHoTen(System.console().readLine());
        hs.output();
    }
}