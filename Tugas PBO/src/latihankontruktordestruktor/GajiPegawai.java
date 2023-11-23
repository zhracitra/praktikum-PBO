package latihankontruktordestruktor;

public class GajiPegawai {
	 private String nama;
	    private String alamat;
	    private int uangTransport;
	    private int uangTunjangan;
	    private int gajiPokok;
	    private int totalGaji;

	    public GajiPegawai(String nama, String alamat, int uangTransport, int uangTunjangan, int gajiPokok) {
	        this.nama = nama;
	        this.alamat = alamat;
	        this.uangTransport = uangTransport;
	        this.uangTunjangan = uangTunjangan;
	        this.gajiPokok = gajiPokok;
	        this.totalGaji = totalGaji(uangTunjangan, uangTransport, gajiPokok);
	    }


	    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
	        return uangTunjangan + uangTransport + gajiPokok;
	    }

	    public void tampilData() {
	        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
	        System.out.println("--------------------------");
	        System.out.println("Nama Karyawan: " + nama);
	        System.out.println("Alamat: " + alamat);
	        System.out.println("Uang Transport: Rp. " + uangTransport);
	        System.out.println("Uang Tunjangan: Rp. " + uangTunjangan);
	        System.out.println("Gaji Pokok: Rp. " + gajiPokok);
	        System.out.println("Total GAJI: Rp. " + totalGaji);
	    }

	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    public String getAlamat() {
	        return alamat;
	    }

	    public void setAlamat(String alamat) {
	        this.alamat = alamat;
	    }

	    public int getUangTransport() {
	        return uangTransport;
	    }

	    public void setUangTransport(int uangTransport) {
	        this.uangTransport = uangTransport;
	    }

	    public int getUangTunjangan() {
	        return uangTunjangan;
	    }

	    public void setUangTunjangan(int uangTunjangan) {
	        this.uangTunjangan = uangTunjangan;
	    }

	    public int getGajiPokok() {
	        return gajiPokok;
	    }

	    public void setGajiPokok(int gajiPokok) {
	        this.gajiPokok = gajiPokok;
	    }

	    public int getTotalGaji() {
	        return totalGaji;
	    }

	    public void setTotalGaji(int totalGaji) {
	        this.totalGaji = totalGaji;
	    }

	    public static void main(String[] args) {
	        GajiPegawai pegawai = new GajiPegawai("Rizki Adam Kurniawan", "Jalan Semar dlm 4 No 72/66", 250000, 300000, 4500000);

	        pegawai.tampilData();
	    }
	}
