package com.financialsanctionimporter.importer;

public class FinancialSanctionDesignationName {

    String name6;

    String name5;

    String name4;

    String name3;

    String name2;

    String name1;

    String NameType;


    public FinancialSanctionDesignationName(String name6, String name5, String name4, String name3, String name2, String name1, String nameType) {
        this.name6 = name6;
        this.name5 = name5;
        this.name4 = name4;
        this.name3 = name3;
        this.name2 = name2;
        this.name1 = name1;
        NameType = nameType;
    }


    public String getName6() {
        return name6;
    }

    public void setName6(String name6) {
        this.name6 = name6;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getNameType() {
        return NameType;
    }

    public void setNameType(String nameType) {
        NameType = nameType;
    }
}
