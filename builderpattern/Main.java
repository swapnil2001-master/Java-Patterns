package builderpattern;

public class  Main{
    public static void main(String[] args) {
        Mobile samsungMobile = new Mobile.Builder()
                        .display("Samsung")
                        .build();

        System.out.println(samsungMobile);

        Mobile nokiaMobile = new Mobile.Builder()
                            .battery("10000Mah")
                            .display("Nokia")
                            .internalMemoryInGb("128Gb")
                            .network("5G")
                            .ramInGb("16GB")
                            .build();
        System.out.println(nokiaMobile);

    }
}