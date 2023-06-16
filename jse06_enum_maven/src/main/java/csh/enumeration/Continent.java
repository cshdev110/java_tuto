package csh.enumeration;

/*
 * @auther cshdev110
 * @date 2023/06/16
 * @verison 1.0
 */

public enum Continent {
    /**
     * 
     */

    AFRICA(53),
    EUROPE(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int countries;

    Continent(int countries) {
        this.countries = countries;
    }

    public int getCountries() {
        return this.countries;
    }
}
