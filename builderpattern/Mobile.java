package builderpattern;

public class Mobile {
    public final String battery;
    public final String display;
    public final String network;
    public final String ramInGb;
    public final String internalMemoryInGb;

    public Mobile(Builder builder){
        this.battery = builder.battery;
        this.display = builder.display;
        this.network = builder.network;
        this.ramInGb = builder.ramInGb;
        this.internalMemoryInGb = builder.internalMemoryInGb;
    }

    public static class Builder{
        public String battery;
        public String display;
        public String network;
        public String ramInGb;
        public String internalMemoryInGb;

        public Builder battery(String battery){
            this.battery = battery;
            return this;
        }
        public Builder display(String display){
            this.display = display;
            return this;
        }
        public Builder network(String network){
            this.network = network;
            return this;
        }
        public Builder ramInGb(String ramInGb){
            this.ramInGb = ramInGb;
            return this;
        }
        public Builder internalMemoryInGb(String internalMemoryInGb){
            this.internalMemoryInGb = battery;
            return this;
        }
        public Mobile build(){
            return new Mobile(this);
        }
    }
    @Override
    public String toString(){
        return "Mobile { " + "Battery is " + battery +
         " Display is " + display + " : Ram is: " + ramInGb +
         " Network is " + network + ": Memory is "+ internalMemoryInGb;
    }
}