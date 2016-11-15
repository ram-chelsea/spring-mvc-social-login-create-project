package project.dm.enums;


public enum Provider {

    FACEBOOK("facebook"), TWITTER("twitter"), LOCAL("local");

    private String providerType;

    public String getProviderType() {
        return providerType;
    }

    Provider(final String providerType) {
        this.providerType = providerType;
    }

}
