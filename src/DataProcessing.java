import java.util.ArrayList;

public class DataProcessing {
    private ArrayList<String> input;
    private ArrayList<String> dataProcessed;

    public DataProcessing() {}

    

    private String ipV6toDec(String ipV6)
    {
        StringBuilder s = new StringBuilder();
        String[] ipV6Array = ipV6.split(":");

        for(String ipV6Part : ipV6Array)
            s.append(Integer.parseInt(ipV6Part, 16)).append(" : ");

        return s.toString();
    }

    private String ipV4toHex(String ipV4)
    {
        StringBuilder s = new StringBuilder();
        String[] ipV4Array = ipV4.split("\\.");

        for(String ipV4Part : ipV4Array)
            s.append(Integer.toHexString(Integer.parseInt(ipV4Part))).append(".");

        return s.toString().toUpperCase();
    }
}