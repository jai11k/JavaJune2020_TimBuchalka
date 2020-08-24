package SQLiteDatabase.JDBC_With_GUI_Program;



public class Artist
{

    private final SimpleIntegerProperty id;
    private final SimpleStringProperty name;

    public Artist()
    {
        this.id = new SimpleIntegerProperty();
        this.name = new SimpleStringProperty();
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {

        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    private class SimpleStringProperty {
        public String get() {
            return null;
        }

        public void set(String name) {


        }
    }

    private class SimpleIntegerProperty {
        public int get() {
            return 0;
        }

        public void set(int id) {


        }
    }
}
