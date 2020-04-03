package com.monicaraycheva.builder.immutable.model;

public final class BillingInfo {

  private final String responsiblePersonFullName;
  private final String companyName;
  private final String streetAddress;
  private final String city;
  private final String postalCode;
  private final String country;
  private final String phoneNumber;

  private BillingInfo(final String responsiblePersonFullName,
                      final String companyName,
                      final String streetAddress,
                      final String city,
                      final String postalCode,
                      final String country,
                      final String phoneNumber) {
    this.responsiblePersonFullName = responsiblePersonFullName;
    this.companyName = companyName;
    this.streetAddress = streetAddress;
    this.city = city;
    this.postalCode = postalCode;
    this.country = country;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "BillingInfo(\n" +
        "responsiblePersonFullName=" + getResponsiblePersonFullName() + ",\n" +
        "companyName=" + getCompanyName() + ",\n" +
        "streetAddress=" + getStreetAddress() + ",\n" +
        "city=" + getCity() + ",\n" +
        "postalCode=" + getPostalCode() + ",\n" +
        "country=" + getCountry() + ",\n" +
        "phoneNumber=" + getPhoneNumber() + "\n" +
        ")";
  }

  public String getResponsiblePersonFullName() {
    return responsiblePersonFullName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public String getCity() {
    return city;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public String getCountry() {
    return country;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public static BillingInfoBuilder builder() {
    return new BillingInfoBuilder();
  }

  public static class BillingInfoBuilder {

    private String responsiblePersonFullName;
    private String companyName;
    private String streetAddress;
    private String city;
    private String postalCode;
    private String country;
    private String phoneNumber;

    private BillingInfoBuilder() {
    }

    public BillingInfoBuilder responsiblePersonFullName(final String responsiblePersonFullName) {
      this.responsiblePersonFullName = responsiblePersonFullName;
      return this;
    }

    public BillingInfoBuilder companyName(final String companyName) {
      this.companyName = companyName;
      return this;
    }

    public BillingInfoBuilder streetAddress(final String streetAddress) {
      this.streetAddress = streetAddress;
      return this;
    }

    public BillingInfoBuilder city(final String city) {
      this.city = city;
      return this;
    }

    public BillingInfoBuilder postalCode(final String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    public BillingInfoBuilder country(final String country) {
      this.country = country;
      return this;
    }

    public BillingInfoBuilder phoneNumber(final String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public BillingInfo build() {
      return new BillingInfo(responsiblePersonFullName,
          companyName,
          streetAddress,
          city,
          postalCode,
          country,
          phoneNumber);
    }

  }

}
