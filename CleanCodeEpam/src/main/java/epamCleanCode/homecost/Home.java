package epamCleanCode.homecost;

public class Home
{
    String material_standard;
    double area_house;
    Boolean automated_completely;

    public Home(String material, double area, Boolean auto)
    {
        material_standard = material;
        area_house = area;
        automated_completely = auto;
    }

    public double totalCost()
    {
        double cost = 0.0;
        if(automated_completely == true)
        {
            cost = 700;
        }
        switch(material_standard)
        {
            case "s" :
            case "S" :
                cost += 1200;
                return cost*area_house;


            case "a" :
            case "A" :
                cost += 1500;
                return cost*area_house;

            case "h" :
            case "H" :
                cost += 1800;
                return cost*area_house;

            default :
                return 0;
        }
    }
}