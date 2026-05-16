public class Author {
    private String name;
    private  int age;
    
    // methods
    
    public Author( String name , int age){
        this.name = name;
        this.age =age;
        
    }
    
    // setter/mutator(feature has return nothing)
    public void setName(String name ){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // getter
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }
}
