package org.openmrs.module.bahmniIEApps.model;

public class BahmniFormResource{
    private BahmniForm form;
    private String uuid;
    private String dataType;
    private String valueReference;

    public BahmniForm getForm() {
        return form;
    }

    public void setForm(BahmniForm form) {
        this.form = form;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getValueReference() {
        return valueReference;
    }

    public void setValueReference(String valueReference) {
        this.valueReference = valueReference;
    }
}