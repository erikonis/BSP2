public class Airport {
    private String city;
    private String country;
    private String iataCode;

    public Airport(String city_, String country_, String iataCode_) {
		this.city = city_;
		this.country = country_;
        this.iataCode = iataCode_;
	}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    @Override
    public String toString() {
        return "Airport [city=" + city + ", country=" + country + ", iataCode=" + iataCode + "]";
    }

    
    
}
