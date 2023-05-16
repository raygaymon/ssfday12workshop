package sg.nus.iss.ssf.day12workshop.Model;

//create model class first
//used to store data
//used to populate image data

public class Image {
    
    private String name;
    private String path;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public Image() {
    }
    
    public Image(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public String toString() {
        return "Image [Name =" + name + ", Path =" + path + "]";
    }

    
}
