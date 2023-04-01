public class Meja {
    private int nomorMeja;
    private Pelanggan pelanggan;
    private Menu[] menu;

    public Meja(int nomorMeja) {
        this.nomorMeja = nomorMeja;
        this.menu = new Menu[10]; // maksimum 10 pesanan per meja
    }

    public void setNomorMeja(int nomorMeja) {
        this.nomorMeja = nomorMeja;
    }

    public int getNomorMeja() {
        return nomorMeja;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }


    public Menu[] getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        boolean pesananDitambahkan = false;
        for (int i = 0; i < this.menu.length; i++) {
            if (this.menu[i] == null) {
                this.menu[i] = menu;
                pesananDitambahkan = true;
                break;
            }
        }
        if (!pesananDitambahkan) {
            System.out.println("Maaf, tidak dapat menambahkan pesanan lagi. Sudah mencapai batas maksimum 10 pesanan.");
        }
    }

    // untuk mengecek apakah meja kosong
    public boolean isKosong() {
        return nomorMeja == 0;
    }
}