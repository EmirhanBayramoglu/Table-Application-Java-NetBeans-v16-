package listelemedenemeleri;

public class City {

    static void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int idCities;
    private String Name;
    private String Region;

    public City(int idCities, String Name, String Region) {
        this.idCities = idCities;
        this.Name = Name;
        this.Region = Region;
    }

    public int getIdCities() {
        return idCities;
    }

    public void setIdCities(int idCities) {
        this.idCities = idCities;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }
    
}
