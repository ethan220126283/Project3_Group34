package za.ac.cput.domain;
/*
    Lana Africa (216166640)
    Classroom Entity
 */
import java.util.Objects;

public class Classroom {

    private String classroom_Id;
    private String classroom_Name;
    private String classroom_Description;

    protected Classroom(){}
    private Classroom(Builder builder){
        this.classroom_Id = builder.classroom_Id;
        this.classroom_Name = builder.classroom_Name;
        this.classroom_Description = builder.classroom_Description;
    }

    public String getClassroom_Id(){
        return  classroom_Id;
    }
    public String getClassroom_Name(){
        return  classroom_Name;
    }
    public String getClassroom_Description(){
        return classroom_Description;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroom_Id='" + classroom_Id + '\'' +
                ", classroom_Name='" + classroom_Name + '\'' +
                ", classroom_Description='" + classroom_Description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return classroom_Id.equals(classroom.classroom_Id) && Objects.equals(classroom_Name, classroom_Name) && Objects.equals(classroom_Description, classroom_Description);
    }
    @Override
    public int hashCode(){
        return Objects.hash(classroom_Id, classroom_Name, classroom_Description);
    }

    public static class Builder{
        private String classroom_Id;
        private String classroom_Name;
        private String classroom_Description;

        public  Builder classroom_Id(String classroom_Id){
            this.classroom_Id = classroom_Id;
            return this;
        }
        public Builder classroom_Name(String classroom_Name){
            this.classroom_Name = classroom_Name;
            return this;
        }
        public Builder classroom_Description(String classroom_Description){
            this.classroom_Description = classroom_Description;
            return this;
        }
        public Builder copy(Classroom classroom){
            this.classroom_Id=classroom.classroom_Id;
            this.classroom_Name=classroom.classroom_Name;
            this.classroom_Description=classroom.classroom_Description;
            return this;
        }
        public Classroom build(){
            return new Classroom(this);
        }
    }

}
