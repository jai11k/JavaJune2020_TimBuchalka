package InputOutput.FileReader.TimBhuchalka;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Locations implements Map<Integer, Location>
{
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args)
    {


    }

    static
    {
        Scanner scanner=null;
        try {

            scanner=new Scanner(new FileReader(System.getProperty("user.dir")+"/src/InputOutput/RequiredTextFiles/location.txt"));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine())
            {
                int loc=scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description=scanner.nextLine();
                System.out.println("imported loc :"+ loc + ","+ description);
                Map<String,Integer>tempExit=new HashMap<>();
                locations.put(loc,new Location(loc,description,tempExit));

            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (scanner!=null)
            {
                scanner.close();
            }
        }
    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear()
    {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
