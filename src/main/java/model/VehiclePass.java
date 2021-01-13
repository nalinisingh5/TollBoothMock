package model;

public class VehiclePass {
    private String license;
    private Toll toll;
    private TollPass tollPass;

    public VehiclePass(String license, Toll toll, TollPass tollPass) {
        this.license = license;
        this.toll = toll;
        this.tollPass = tollPass;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Toll getToll() {
        return toll;
    }

    public void setToll(Toll toll) {
        this.toll = toll;
    }

    public TollPass getTollPass() {
        return tollPass;
    }

    public void setTollPass(TollPass tollPass) {
        this.tollPass = tollPass;
    }
}
