package kursusonline.model;

import java.sql.Date;

public class Sertifikat {
    private String idSertifikat;
    private String namaKursus;
    private Date tanggalTerbit;

    public Sertifikat(String idSertifikat, String namaKursus, Date tanggalTerbit) {
        this.idSertifikat = idSertifikat;
        this.namaKursus = namaKursus;
        this.tanggalTerbit = tanggalTerbit;
    }

    public String getIDSertifikat() {
        return idSertifikat;
    }

    public String getNamaKursus() {
        return namaKursus;
    }
    public Date getTanggalTerbit() {
        return tanggalTerbit;
    }
}
