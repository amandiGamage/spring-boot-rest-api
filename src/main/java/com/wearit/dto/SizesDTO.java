package com.wearit.dto;

/**
 * Created by Amandi on 8/31/2018.
 */
public class SizesDTO {
    private Integer id;
    private String sizes;
    private String sizeUK;
    private String sizeUS;
    private String sizeEU;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getSizeUK() {
        return sizeUK;
    }

    public void setSizeUK(String sizeUK) {
        this.sizeUK = sizeUK;
    }

    public String getSizeUS() {
        return sizeUS;
    }

    public void setSizeUS(String sizeUS) {
        this.sizeUS = sizeUS;
    }

    public String getSizeEU() {
        return sizeEU;
    }

    public void setSizeEU(String sizeEU) {
        this.sizeEU = sizeEU;
    }
}
