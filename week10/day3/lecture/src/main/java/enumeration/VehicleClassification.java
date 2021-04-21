package enumeration;

public enum VehicleClassification {

    NEW(true, true),
    USED(false, true),
    OFF_LEASE(true, true),
    SHUTTLE(true, false),
    LOANER(false, false),
    PARTS_RUNNER(true, true);

    private boolean warranty;
    private boolean freeService;

    public boolean WarrantyOffered() {
        return warranty;
    }

    public boolean FreeServiceOffered() {
        return freeService;
    }

    private VehicleClassification(boolean warranty, boolean freeService){
        this.warranty = warranty;
        this.freeService = freeService;
    }
}
