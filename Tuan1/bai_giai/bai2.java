class HocSinh {
    private int maSo;
    private String hoTen;
    private float diemTrungBinh;

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

class DSHocSinh {
    private HocSinh ds[];
    private int sl;

    public void nhapDs() {
        System.out.println("Nhap so luong hoc sinh: ");
        this.sl = Integer.parseInt(System.console().readLine());
        // Khai báo mảng, khởi tạo bộ nhớ cho mảng chưa tối đa x học sinh
        this.ds = new HocSinh[this.sl];
        // Khai báo thông tin học sinh
        for (int i = 0; i < this.sl; i++) {
            this.ds[i] = new HocSinh();
            this.ds[i].input();
        }

    }

    public void xuatDs() {
        System.out.println("Danh sach hoc sinh: ");
        System.out.println("----------------------------------");
        for (int i = 0; i < this.ds.length; i++) {
            this.ds[i].output();
        }
    }

    // Sap xep danh sach theo dtb
    public void sapxep() {
        HocSinh temp = this.ds[0];

        for (int i = 0; i < this.ds.length; i++)
            for (int j = i + 1; j < this.ds.length; j++)
                if (this.ds[i].getDiemTrungBinh() < this.ds[j].getDiemTrungBinh()) {
                    temp = this.ds[i];
                    this.ds[i] = this.ds[j];
                    this.ds[j] = temp;
                }

    }
}

public class bai2 {
    public static void main(String[] args) {
        DSHocSinh ds = new DSHocSinh();
        ds.nhapDs();
        ds.sapxep();
        ds.xuatDs();
    }
}
