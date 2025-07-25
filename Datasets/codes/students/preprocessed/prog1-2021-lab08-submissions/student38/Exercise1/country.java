enum country {
    Luxembourg("Luxembourg"), France("France"), Belgium("Belgium"), Germany("Germany");

    private String countryName;

    private country(String counString) {
        this.countryName = counString;
    }

    public String toString() {
        return countryName;
    }

    public int getPrice() { // method to get price for the country
        switch (countryName) {
        case "Luxembourg":
            return 0;
        case "France":
            return 30;
        case "Belgium":
            return 50;
        case "Germany":
            return 40;
        default:
            return 0;
        }
    }
}