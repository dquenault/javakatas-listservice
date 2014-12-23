package org.javakatas.listservice.problem.list;

import java.util.UUID;

/**
 * Created by davidq on 23/12/14.
 */
public class Product {
    UUID uuid;
    String gtin;
    String productDescription;

    public Product (String gtin, String description){
        setUuid();
        this.gtin = gtin;
        this.productDescription = description;
    }

    public UUID getUuid() {
        return uuid;
    }

    private void setUuid() {
        this.uuid = UUID.randomUUID();
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


}
