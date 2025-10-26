public enum Branch {
    MATH("information regardin math"),
    PHYSICS("information regardin physics"),
    CS("information regardin cs"),
    ENG("information regardin eng");

    private final String description;

    Branch(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
