package fdp;


public class Facade
{
    private final IndustrialPrinter iP;
    private final TreeDPrinter p3D;
    
    public Facade()
    {
       iP = new IndustrialPrinter("Black", 3000.00);
       p3D = new TreeDPrinter("Green", 5000.323);
    }
    
    public void showInformation()
    {
        iP.showInfo("--Industrial Printer--");   
        p3D.showInfo("\n--Printer 3D--");
    }
}
