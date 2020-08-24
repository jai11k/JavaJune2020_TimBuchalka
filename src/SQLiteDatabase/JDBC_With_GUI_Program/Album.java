package SQLiteDatabase.JDBC_With_GUI_Program;


public class Album
{

    private final SimpleIntegerProperty id;
    private final SimpleStringProperty name;
    private final SimpleIntegerProperty artistId;

    public Album() {
        this.id = new SimpleIntegerProperty();
        this.name = new SimpleStringProperty();
        this.artistId = new SimpleIntegerProperty();
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id)
    {

        this.id.set(id);
    }

    public String getName() {

        return name.get();
    }

    public void setName(String name) {

        this.name.set(name);
    }

    public int getArtistId() {

        return artistId.get();
    }

    public void setArtistId(int artistId) {
        this.artistId.set(artistId);
    }

    private class SimpleStringProperty {
        public void set(String name) {
        }

        public String get() {
            return null;
        }
    }
     private class SimpleIntegerProperty
     {
         public void set(int id)
         {}

         public int get()
         {
             return 0;
         }
     }
     }


