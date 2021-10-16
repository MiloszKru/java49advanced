package advanced.homework.enums.size;

public enum PackageSize {

    SMALL(10,20),
    MEDIUM(20,40),
    LARGE(40,60),
    UNKNOWN(0,0);

    private double minSize, maxSize;

    PackageSize(double minSize, double maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(double minSize, double maxSize){
        for(PackageSize packageSize : values()) {
            if(minSize >= packageSize.minSize && maxSize <= packageSize.maxSize) {
                return packageSize;
            }
        }
        return UNKNOWN;

    }
}
