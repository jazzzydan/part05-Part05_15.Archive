public class Archive {

    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Archive, the objects are not equal
        if (!(compared instanceof Archive)) {
            return false;
        }

        // convert the object into a Archive object
        Archive comparedArchive = (Archive) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.identifier.equals(comparedArchive.identifier)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
