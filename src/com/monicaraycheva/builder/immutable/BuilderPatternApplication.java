package com.monicaraycheva.builder.immutable;

import com.monicaraycheva.builder.immutable.model.BillingInfo;

import java.util.logging.Logger;

public class BuilderPatternApplication {

  public static void main(String[] args) {
    BillingInfo billingInfo = BillingInfo.builder()
        .responsiblePersonFullName("Ludwig Wittgenstein")
        .companyName("Blue and Brown")
        .streetAddress("Parkgasse 18")
        .city("Vienna")
        .postalCode("1010")
        .country("Austria")
        .phoneNumber("4666468")
        .build();

    Logger logger = Logger.getLogger(BuilderPatternApplication.class.getName());
    logger.info(billingInfo.toString());
  }

}
