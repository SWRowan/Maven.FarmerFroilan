package com.zipcodewilmington.froilansfarm.farm.containers;

import java.util.ArrayList;

public class Field {
    private ArrayList<CropRow> cropRows;

    public Field(ArrayList<CropRow> cropRows) {
        this.cropRows = cropRows;
    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }

    public void setCropRows(ArrayList<CropRow> cropRows) {
        this.cropRows = cropRows;
    }

    @Override
    public String toString() {
        return "\nField{" +
                "cropRows=" + cropRows +
                '}';
    }
}
